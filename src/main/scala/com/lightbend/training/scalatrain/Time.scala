package com.lightbend.training.scalatrain

case class Time(hours:Int = 0, minutes:Int = 0){
  require(hours >= 0 && hours <= 23,"The hour must be between zero and twenty three")
  require(minutes >= 0 && minutes <= 59, "The minutes must be between zero and fifty nine")
  val asMinutes : Int = hours * 60 + minutes

  def minus(time:Int):Int = {
    Math.abs(asMinutes - time)
  }

  def -(minutesToMinus : Int) : Int = this.minus(minutesToMinus)

  override lazy val toString: String = f"$hours%02d:$minutes%02d"
}

object Time {

  def fromMinutes (minut:Int): Time = {
    val hours = minut / 60
    val minutes = minut % 60

    new Time(hours,minutes)
  }

}