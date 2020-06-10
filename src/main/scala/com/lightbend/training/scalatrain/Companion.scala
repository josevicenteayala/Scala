package com.lightbend.training.scalatrain

object Companion {

  def fromMinutes(minutes:Int) : Time = {
    new Time(0,minutes)
  }

}
