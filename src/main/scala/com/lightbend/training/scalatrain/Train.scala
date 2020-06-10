package com.lightbend.training.scalatrain

class Train(val kind:String, val number:Int, schedule:Seq[(Time, Station)]){
  println("Size compare:: "+schedule.sizeCompare(2))
  require(schedule.sizeCompare(2) >= 0,"Schedule must contains at least 2 elements")

  val stations: Seq[Station] = schedule.map(tuple => tuple._2)

  val map = Map((1,'a'),(2,'b'))
  map.contains(3)
}