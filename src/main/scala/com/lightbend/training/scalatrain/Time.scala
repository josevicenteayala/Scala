package com.lightbend.training.scalatrain

case class Time(hour:Int = 0, minutes:Int = 0){
  require(hour >= 0 && hour <= 23,"The hour must be between zero and twenty three")
  require(minutes >= 0 && minutes <= 59, "The minutes must be between zero and fifty nine")
  val asMinutes : Int = hour * 60 + minutes

  def minus(time:Int):Int = {
    Math.abs(asMinutes - time)
  }

  def -(minutesToMinus : Int) : Int = this.minus(minutesToMinus)
}

object Time {

  def fromMinutes (minut:Int): Time = {
    val hours = minut / 60
    val minutes = minut % 60

    new Time(hours,minutes)
  }

}