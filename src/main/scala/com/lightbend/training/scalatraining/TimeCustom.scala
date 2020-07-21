package com.lightbend.training.scalatraining

object TimeCustom {

  def fromMinutes (minut:Int): TimeCustom[TimeCustom.type] = {
    val hours = minut / 60
    val minutes = minut % 60

   TimeCustom(hours,minutes)
  }
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
}

