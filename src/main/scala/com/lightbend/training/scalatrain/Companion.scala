package com.lightbend.training.scalatrain

import java.sql.Time

object Companion {

  def fromMinutes(minutes:Int) : TimeCustom[Time] = {
    new TimeCustom(0,minutes)
  }

}
