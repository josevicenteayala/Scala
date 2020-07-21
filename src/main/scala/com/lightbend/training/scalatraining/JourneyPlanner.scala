package com.lightbend.training.scalatraining

import java.sql.Time

class JourneyPlanner (trains : Set[Train]) {

  val stations: Set[Station] = trains.flatMap(_.stations)

  def trainsAt(station: Station): Set[Train] = trains.filter((train: Train) => train.stations.contains(station))

  def stopsAt(station: Station): Set [(TimeCustom[Time],Train)] = {
    for {
      train: Train <- trainsAt(station)
      _ = println("************************************* "+train)
      schedule <- train.schedule.filter(s=> s._2.name.equals(station.name))
      _ = println("++++++++++++++++++++++++++ "+schedule)
      trainsInStation = schedule._1 -> train
    } yield (trainsInStation)
  }

  def isShortTrip(from:Station, to:Station): Boolean = {
    trains.exists{
      train =>
        val value = train.stations.dropWhile(station => {
          station != from
        })
        println(from +" stations.dropWhile "+value)
        val value1 = value.drop(1)
        println(" drop(1) "+value1)
        val value2 = value1.take(2)
        println(" take(2) "+value2)
        value2.contains(to)
    }
  }

  def isShortTripWithPatterMatcher(from:Station, to:Station): Unit ={
    true
  }
}
