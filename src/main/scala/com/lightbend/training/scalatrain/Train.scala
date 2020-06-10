package com.lightbend.training.scalatrain

class Train(val kind:String, val number:Int, schedule:Seq[Station]){
  println("Size compare:: "+schedule.sizeCompare(2))
  require(schedule.sizeCompare(2) >= 0,"Schedule must contains at least 2 elements")

  val map = Map((1,'a'),(2,'b'))
  map.contains(3)
}