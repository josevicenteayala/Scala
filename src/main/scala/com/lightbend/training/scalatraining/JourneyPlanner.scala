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
      _.stations.dropWhile(_ != from).drop(1).take(2).contains(to)
    }
  }

  def isShortTripWithPatternMatcher(from:Station, to:Station): Boolean ={
    trains.exists{
      _.stations.dropWhile(_ != from) match {
        case `from` +: `to` +: _ => true
        case `from` +: _ +: `to` +: _ => true
        case _ => false
      }
    }
  }
}
