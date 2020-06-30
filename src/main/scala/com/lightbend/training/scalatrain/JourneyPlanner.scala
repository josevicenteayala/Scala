package com.lightbend.training.scalatrain

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
}
