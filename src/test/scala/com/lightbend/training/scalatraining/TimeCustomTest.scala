package com.lightbend.training.scalatraining

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class TimeCustomTest extends AnyFlatSpec with should.Matchers {

   "TimeCustom" should "Throw an IllegalArgumentException when the minutes are less than zero and greater than 59" in {
       an[IllegalArgumentException] should be thrownBy(TimeCustom(minutes = -1))
       an[IllegalArgumentException] should be thrownBy(TimeCustom(minutes = 60))
     }

     "TimeCustom" should "Throw an IllegalArgumentException when the hours are less than zero and greater than 23" in {
       an[IllegalArgumentException] should be thrownBy(TimeCustom(-1))
       an[IllegalArgumentException] should be thrownBy(TimeCustom(24))
     }

     "TimeCustom" should "The default arguments for hours and minutes" in {
         val time = TimeCustom()
         time.hours shouldEqual(0)
         time.minutes shouldEqual(0)
     }

     "TimeCustom" should "asMinutes for Time(hour = 10)" in {
         val time = TimeCustom(hours = 10)
         time.asMinutes shouldEqual 600
     }

     "TimeCustom" should "asMinutes for Time(minutes = 40)" in {
        val time = TimeCustom(minutes = 40)
        time.asMinutes shouldEqual(40)
    }
     
     "TimeCustom" should "asMinutes for Time(2, 45)" in {
         val time = TimeCustom(2, 45)
         time.asMinutes shouldEqual(165)
     }

     "TimeCustom" should "return the correct difference in minutes" in {
         TimeCustom(1, 30) minus (10) shouldEqual 60
         TimeCustom(1, 30) - 10 shouldEqual(60)
     }

     "TimeCustom" should "calling toString method for Time(1,30)" in {
         val time = TimeCustom(1,30)
         time.toString shouldBe("01:30")
     }

     "TimeCustom" should "Calling fromJson method for Json with time 1:30" in {
         val time = new TimeCustom(1,30)

         val jsValue = time.toJson

         val timeCustom: Option[TimeCustom[TimeCustom.type]] = TimeCustom.fromJson(jsValue)

         timeCustom.getOrElse("").toString shouldBe("01:30")
     }
}
