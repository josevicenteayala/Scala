package com.lightbend.training.scalatraining

import java.sql.Time

object Companion {

  def fromMinutes(minutes:Int) : TimeCustom[Time] = {
    new TimeCustom(0,minutes)
  }

}
