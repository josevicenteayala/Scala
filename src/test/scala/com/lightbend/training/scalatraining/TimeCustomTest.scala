package com.lightbend.training.scalatraining

import com.lightbend.training.scalatraining.TimeCustom
import org.scalatest.{Matchers, WordSpec}

class TimeCustomTest extends WordSpec with Matchers {

   "Creating a time" should {
     "Throw an IllegalArgumentException when the minutes are less than zero and greater than 59" in {
       an[IllegalArgumentException] should be thrownBy(TimeCustom(minutes = -1))
       an[IllegalArgumentException] should be thrownBy(TimeCustom(minutes = 60))
     }

     "Throw an IllegalArgumentException when the hours are less than zero and greater than 23" in {
       an[IllegalArgumentException] should be thrownBy(TimeCustom(-1))
       an[IllegalArgumentException] should be thrownBy(TimeCustom(24))
     }

     "The default arguments for hours and minutes" should{
       "be equals to zero" in {
         val time = TimeCustom()
         time.hours shouldEqual(0)
         time.minutes shouldEqual(0)
       }
     }

     "asMinutes for Time(hour = 10)" should {
       "be equal to 600" in {
         val time = TimeCustom(hours = 10)
         time.asMinutes shouldEqual 600
       }
     }

    "asMinutes for Time(minutes = 40)" should {
      "be equal to 40" in {
        val time = TimeCustom(minutes = 40)
        time.asMinutes shouldEqual(40)
      }
    }

     "asMinutes for Time(2, 45)" should {
       "be equal to 165" in {
         val time = TimeCustom(2, 45)
         time.asMinutes shouldEqual(165)
       }
     }

     "Calling minus or -" should {
       "return the correct difference in minutes" in {
         TimeCustom(1, 30) minus (10) shouldEqual 80
         TimeCustom(1, 30) - 10 shouldEqual(80)
       }
     }

     "calling toString method for Time(1,30)" should {
       "return 01:30" in {
         val time = TimeCustom(1,30)
         time.toString shouldBe("01:30")
       }
     }
   }
}
