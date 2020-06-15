package com.lightbend.training.scalatrinin

import com.lightbend.training.scalatrain.{BavarianRegional, InterCityExpress, RegionalExpress, Station, Time, Train}
import org.scalatest.{Matchers, WordSpec}

class TrainTest extends WordSpec with Matchers{

  "Create a train with 2 Stations" should {
    "create the train successfully" in {
      val stations: Seq[(Time,Station)] = Seq((Time(),Station("Madrid")),(Time(),Station("London")))
      val train = new Train(InterCityExpress(1), stations)
    }
  }

  "Create a train with 3 Stations" should {
    "create the train successfully" in {
      val stations: Seq[(Time,Station)] = Seq((Time(),Station("Madrid")),(Time(),Station("London")), (Time(),Station("Paris")))
      val train = new Train(RegionalExpress(2), stations)
    }
  }

  "Create a train with 1 station" should {
    "Throw an IllegalArgumentException because there is only 1 station and must be at least 2 stations" in {
      val stations: Seq[(Time,Station)] = Seq((Time(),Station("Madrid")))
      an[IllegalArgumentException] should be thrownBy(new Train(BavarianRegional(3), stations))
    }
  }

  "Create a train with 0 station" should {
    "Throw an IllegalArgumentException because there is only 0 station and must be at least 2 stations" in {
      val stations: Seq[(Time,Station)] = Seq()
      an[IllegalArgumentException] should be thrownBy(new Train(RegionalExpress(1), stations))
    }
  }
}
