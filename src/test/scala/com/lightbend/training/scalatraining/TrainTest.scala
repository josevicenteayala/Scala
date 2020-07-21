package com.lightbend.training.scalatraining

import java.sql.Time

import com.lightbend.training.scalatraining.{BavarianRegional, InterCityExpress, RegionalExpress, Station, TimeCustom, Train}
import org.scalatest.{Matchers, WordSpec}

class TrainTest extends WordSpec with Matchers{

  "Create a train with 2 Stations" should {
    "create the train successfully" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq((TimeCustom(),Station("Madrid")),(TimeCustom(),Station("London")))
      val train = new Train(InterCityExpress(1), stations)
    }
  }

  "Create a train with 3 Stations" should {
    "create the train successfully" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq((TimeCustom(),Station("Madrid")),(TimeCustom(),Station("London")), (TimeCustom(),Station("Paris")))
      val train = new Train(RegionalExpress(2), stations)
    }
  }

  "Create a train with 1 station" should {
    "Throw an IllegalArgumentException because there is only 1 station and must be at least 2 stations" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq((TimeCustom(),Station("Madrid")))
      an[IllegalArgumentException] should be thrownBy(new Train(BavarianRegional(3), stations))
    }
  }

  "Create a train with 0 station" should {
    "Throw an IllegalArgumentException because there is only 0 station and must be at least 2 stations" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq()
      an[IllegalArgumentException] should be thrownBy(new Train(RegionalExpress(1), stations))
    }
  }
}
