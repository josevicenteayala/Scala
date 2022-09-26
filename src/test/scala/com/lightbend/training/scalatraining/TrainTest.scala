package com.lightbend.training.scalatraining

import java.sql.Time
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TrainTest extends AnyFlatSpec with should.Matchers {

  "Train" should "Create a train with 2 Stations" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq((TimeCustom(),Station("Madrid")),(TimeCustom(),Station("London")))
      val train = new Train(InterCityExpress(1), stations)
  }

  "Train" should "Create a train with 3 Stations" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq((TimeCustom(),Station("Madrid")),(TimeCustom(),Station("London")), (TimeCustom(),Station("Paris")))
      val train = new Train(RegionalExpress(2), stations)
  }

  "Train" should "Throw an IllegalArgumentException because there is only 1 station and must be at least 2 stations" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq((TimeCustom(),Station("Madrid")))
      an[IllegalArgumentException] should be thrownBy(new Train(BavarianRegional(3), stations))
  }

  "Train" should "Throw an IllegalArgumentException because there is only 0 station and must be at least 2 stations" in {
      val stations: Seq[(TimeCustom[Time],Station)] = Seq()
      an[IllegalArgumentException] should be thrownBy(new Train(RegionalExpress(1), stations))
  }
}
