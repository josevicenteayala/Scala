package com.lightbend.training.scalatraining

import java.sql.Time

import org.scalatest.{Matchers, WordSpec}

class JourneyPlannerTest extends WordSpec with Matchers{

  private val madrid = "Madrid"
  private val TypeTrainOne = 1
  private val TypeTrainTwo = 2
  private val TypeTrainThree = 3

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

  "Since a given two stations" should {
    "return true if exists a train with this stations en one station between them " in {
      val journeyPlanner: JourneyPlanner = createJourneyPlannerWithMultipleTrains
      println(journeyPlanner)
      val bool = journeyPlanner.isShortTrip(Station("Madrid"), Station("Bruselas"))
      bool shouldBe true
    }
  }

  "Since a given another two stations" should {
    "return true if exists a train with this stations en one station between them " in {
      val journeyPlanner: JourneyPlanner = createJourneyPlannerWithMultipleTrains
      println(journeyPlanner)
      val bool = journeyPlanner.isShortTripWithPatternMatcher(Station("Madrid"), Station("Bruselas"))
      bool shouldBe true
    }
  }

  "Since a given two stations but with more than one station between them" should {
    "return false because exists more than on stations between them " in {
      val journeyPlanner: JourneyPlanner = createJourneyPlannerWithMultipleTrains
      println(journeyPlanner)
      val bool = journeyPlanner.isShortTripWithPatternMatcher(Station("Amsterdam"), Station("Barcelona"))
      bool shouldBe false
    }
  }

  "Since a given two stations and from station does not exits" should {
    "return false because the from station does not exits" in {
      val journeyPlanner: JourneyPlanner = createJourneyPlannerWithMultipleTrains
      println(journeyPlanner)
      val bool = journeyPlanner.isShortTripWithPatternMatcher(Station("Medellin"), Station("Barcelona"))
      bool shouldBe false
    }
  }

  "Since a given two stations and to station does not exits" should {
    "return false because the station does not exits" in {
      val journeyPlanner: JourneyPlanner = createJourneyPlannerWithMultipleTrains
      println(journeyPlanner)
      val bool = journeyPlanner.isShortTripWithPatternMatcher(Station("Amsterdam"), Station("Medellin"))
      bool shouldBe false
    }
  }

  "CreateSchedule" should {
    "return a Sequence with the schedule" in {
      val schedule: Seq[(TimeCustom[Time], Station)] = createSchedule(Seq("Madrid","Toledo"))
     schedule.size shouldBe  2
    }
  }

  def createTrains: (Train, Train) = {
    val scheduleFasterTrain: Seq[(TimeCustom[Time], Station)] = Seq((TimeCustom(1, 30), Station(madrid)), (TimeCustom(3, 50), Station("Barcelona")))
    val fasterTrain = Train(InterCityExpress(TypeTrainOne), scheduleFasterTrain)

    val scheduleRegularTrain: Seq[(TimeCustom[Time], Station)] = Seq((TimeCustom(1, 30), Station(madrid)), (TimeCustom(2, 0), Station("Toledo")), (TimeCustom(4, 58), Station("Sevilla")))
    val regularTrain = Train(BavarianRegional(TypeTrainTwo), scheduleRegularTrain)
    (fasterTrain, regularTrain)
  }

  def createTrain(info: TrainInfo, schedule:Seq[(TimeCustom[Time], Station)]) = {
    Train(info,schedule)
  }

  private def createJourneyPlanner = {
    val (fasterTrain: Train, regularTrain: Train) = createTrains
    new JourneyPlanner(Set(fasterTrain, regularTrain))
  }

  private def setOfTrains: Set[Train] = {
    val (fasterTrain: Train, regularTrain: Train) = createTrains
    Set(fasterTrain, regularTrain)
  }

  def createTrainInfo(infoType:Int) = {
    infoType match {
      case TypeTrainOne => InterCityExpress(TypeTrainOne)
      case TypeTrainTwo => RegionalExpress(TypeTrainTwo)
      case TypeTrainThree => BavarianRegional(TypeTrainThree)
    }
  }

  def createSchedule(stations:Seq[String]): Seq[(TimeCustom[Time], Station)] = {
    val collectionStations: Seq[(TimeCustom[Time], Station)] = stations.collect{
      case stationName: String => (TimeCustom(2,30),Station(stationName))
    }
    collectionStations
  }

  val fasterTrain: Train = createTrain(createTrainInfo(TypeTrainOne), createSchedule(Seq("Madrid","Toledo","Sevilla","Cadiz","Valencia","Barcelona")))

  val regularTrain: Train = createTrain(createTrainInfo(TypeTrainTwo), createSchedule(Seq("Madrid","Granada","Londres","Paris","Valencia","Barcelona")))

  val normalTrain: Train = createTrain(createTrainInfo(TypeTrainThree), createSchedule(Seq("Madrid","Roma","Pompeya","Silicia","Turingia","Barcelona")))

  val touristTrain: Train = createTrain(createTrainInfo(TypeTrainOne), createSchedule(Seq("Madrid","Cadiz","Amsterdam","Berlin","Praga","Barcelona")))

  val cultureTrain: Train = createTrain(createTrainInfo(TypeTrainTwo), createSchedule(Seq("Madrid","Monaco","Bruselas","Paris","Roma","Barcelona")))

  private def createJourneyPlannerWithMultipleTrains = {
    new JourneyPlanner(Set(fasterTrain, regularTrain, normalTrain, touristTrain, cultureTrain))
  }
}
