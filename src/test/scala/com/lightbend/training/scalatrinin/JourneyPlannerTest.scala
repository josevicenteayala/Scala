package com.lightbend.training.scalatrinin

import com.lightbend.training.scalatrain.{JourneyPlanner, Station, Time, Train}
import org.scalatest.{Matchers, WordSpec}

class JourneyPlannerTest extends WordSpec with Matchers{

  "Create a JourneyPlanner with all stations from all trains" should {
    val setStations = Set(Station("Madrid"), Station("Barcelona"), Station("Toledo"), Station("Sevilla"))

    "create a JourneyPlanner successfully" in {
      val journeyPlanner: JourneyPlanner = createJourneyPlanner

      journeyPlanner.stations.isEmpty shouldEqual false

      setStations shouldEqual(journeyPlanner.stations)
    }
  }

  "Create a Journey Planner with faster and regular trains" should {
    "trains at Madrid station must include faster and regular trains" in {
      val journeyPlanner: JourneyPlanner = createJourneyPlanner
      val trainsFiltered: Set[Train] = journeyPlanner.trainsAt(station = Station("Madrid"))
      trainsFiltered.exists(train=>train.kind.equals("faster") && train.number==1) shouldBe(true)
      trainsFiltered.exists(train=>train.kind.equals("regular") && train.number==2) shouldBe(true)
    }
  }

  def createTrains: (Train, Train) = {
    val scheduleFasterTrain: Seq[(Time, Station)] = Seq((Time(1, 30), Station("Madrid")), (Time(3, 50), Station("Barcelona")))
    val fasterTrain = new Train("faster", 1, scheduleFasterTrain)

    val scheduleRegularTrain: Seq[(Time, Station)] = Seq((Time(1, 30), Station("Madrid")), (Time(2, 0), Station("Toledo")), (Time(4, 58), Station("Sevilla")))
    val regularTrain = new Train("regular", 2, scheduleRegularTrain)
    (fasterTrain, regularTrain)
  }

  private def createJourneyPlanner = {
    val (fasterTrain: Train, regularTrain: Train) = createTrains
    new JourneyPlanner(Set(fasterTrain, regularTrain))
  }

  private def setOfTrains: Set[Train] = {
    val (fasterTrain: Train, regularTrain: Train) = createTrains
    Set(fasterTrain, regularTrain)
  }
}
