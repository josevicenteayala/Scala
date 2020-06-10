package com.lightbend.training.scalatrinin

import com.lightbend.training.scalatrain.{Station, Train}
import org.scalatest.{Matchers, WordSpec}

class TrainTest extends WordSpec with Matchers{

  "Create a train with 2 Stations" should {
    "create the train successfully" in {
      val stations: Seq[Station] = Seq(Station("Madrid"),Station("London"))
      val train = new Train("faster", 1, stations)
    }
  }

  "Create a train with 3 Stations" should {
    "create the train successfully" in {
      val stations: Seq[Station] = Seq(Station("Madrid"),Station("London"), Station("Paris"))
      val train = new Train("faster", 1, stations)
    }
  }

  "Create a train with 1 station" should {
    "Throw an IllegalArgumentException because there is only 1 station and must be at least 2 stations" in {
      val stations: Seq[Station] = Seq(Station("Madrid"))
      an[IllegalArgumentException] should be thrownBy(new Train("faster", 1, stations))
    }
  }

  "Create a train with 0 station" should {
    "Throw an IllegalArgumentException because there is only 0 station and must be at least 2 stations" in {
      val stations: Seq[Station] = Seq()
      an[IllegalArgumentException] should be thrownBy(new Train("faster", 1, stations))
    }
  }
}
