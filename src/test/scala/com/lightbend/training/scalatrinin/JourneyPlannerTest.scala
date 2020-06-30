package com.lightbend.training.scalatrinin

import java.sql.Time

import com.lightbend.training.scalatrain.{BavarianRegional, InterCityExpress, JourneyPlanner, Station, TimeCustom, Train}
import org.scalatest.{Matchers, WordSpec}

class JourneyPlannerTest extends WordSpec with Matchers{

  private val madrid = "Madrid"
  private val TypeTrainOne = 1
  private val TypeTrainTwo = 2

  "Create a JourneyPlanner with all stations from all trains" should {
    val setStations = Set(Station(madrid), Station("Barcelona"), Station("Toledo"), Station("Sevilla"))

    "create a JourneyPlanner successfully" in {
      val journeyPlanner: JourneyPlanner = createJourneyPlanner

      journeyPlanner.stations.isEmpty shouldEqual false

      setStations shouldEqual(journeyPlanner.stations)
    }
  }

  "Create a Journey Planner with faster and regular trains" should {
    "trains at " + madrid + " station must include faster and regular trains" in {
      val journeyPlanner: JourneyPlanner = createJourneyPlanner
      val trainsFiltered: Set[Train] = journeyPlanner.trainsAt(station = Station(madrid))
      trainsFiltered.exists(train=>train.info.number.equals(TypeTrainOne)) shouldBe(true)
      trainsFiltered.exists(train=>train.info.number.equals(TypeTrainTwo)) shouldBe(true)
    }
  }

  "Since a given " + madrid + " station stopsAt" should {
    "contains a sequence from faster an regular trains with their times" in {
      val journeyPlanner: JourneyPlanner = createJourneyPlanner
      val stops = journeyPlanner.stopsAt(Station(madrid))
      stops shouldBe(Set(
        (TimeCustom(1,30),Train(InterCityExpress(1),List((TimeCustom(1,30),Station(madrid)), (TimeCustom(3,50),Station("Barcelona"))))),
        (TimeCustom(1,30),Train(BavarianRegional(2),List((TimeCustom(1,30),Station(madrid)), (TimeCustom(2,0),Station("Toledo")), (TimeCustom(4,58),Station("Sevilla")))))))
    }
  }

  def createTrains: (Train, Train) = {
    val scheduleFasterTrain: Seq[(TimeCustom[Time], Station)] = Seq((TimeCustom(1, 30), Station(madrid)), (TimeCustom(3, 50), Station("Barcelona")))
    val fasterTrain = new Train(InterCityExpress(TypeTrainOne), scheduleFasterTrain)

    val scheduleRegularTrain: Seq[(TimeCustom[Time], Station)] = Seq((TimeCustom(1, 30), Station(madrid)), (TimeCustom(2, 0), Station("Toledo")), (TimeCustom(4, 58), Station("Sevilla")))
    val regularTrain = new Train(BavarianRegional(TypeTrainTwo), scheduleRegularTrain)
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
