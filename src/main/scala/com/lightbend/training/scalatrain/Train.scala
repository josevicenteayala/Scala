package com.lightbend.training.scalatrain

import java.sql.Time

case class Train(info: TrainInfo, schedule:Seq[(TimeCustom[Time], Station)]){
  println("Size compare:: "+schedule.sizeCompare(2))
  require(schedule.sizeCompare(2) >= 0,"Schedule must contains at least 2 elements")

  val stations: Seq[Station] = schedule.map(tuple => tuple._2)

  val map = Map((1,'a'),(2,'b'))
  map.contains(3)
}

sealed abstract class TrainInfo {
  def number : Int
}

case class InterCityExpress(number:Int,hasWifi:Boolean = false) extends TrainInfo {
}

case class RegionalExpress(number:Int) extends TrainInfo {
}

case class BavarianRegional(number:Int) extends TrainInfo {
}