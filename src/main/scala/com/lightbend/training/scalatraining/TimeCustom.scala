package com.lightbend.training.scalatraining

import play.api.libs.json._

import scala.util.Try

object TimeCustom {

  def fromMinutes (minute:Int): TimeCustom[TimeCustom.type] = {
    val hours: Int = minute / 60
    val minutes: Int = minute % 60

   TimeCustom(hours,minutes)
  }

  def fromHoursMinutes (minute:Int, hours:Int): TimeCustom[TimeCustom.type] = {
    val minutes: Int = minute % 60
    TimeCustom(hours,minutes)
  }

  def fromJson(js:JsValue): Option[TimeCustom[TimeCustom.type]] = {
    for {
      hours <- Try((js \ "hours").as[Int])
      minutes <- Try((js \ "minutes").as[Int]).recover{ case _ => 0}
    }yield fromHoursMinutes(minutes,hours)
  }.toOption
}

case class TimeCustom[Time](hours:Int = 0, minutes:Int = 0) extends Ordered[Time]{
  require(hours >= 0 && hours <= 23,"The hour must be between zero and twenty three")
  require(minutes >= 0 && minutes <= 59, "The minutes must be between zero and fifty nine")
  val asMinutes : Int = hours * 60 + minutes

  def minus(time:Time):Int = {
    this.asMinutes - 10//TODO fix this
  }

  def -(time : Time) : Int = minus(time)

  override lazy val toString: String = f"$hours%02d:$minutes%02d"

  override def compare(that: Time): Int = minus(that)

  def toJson: JsValue =  JsObject(Map("hours" -> JsNumber(hours), "minutes" -> JsNumber(minutes)))
}

