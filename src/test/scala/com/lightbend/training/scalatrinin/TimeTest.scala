package com.lightbend.training.scalatrinin

import com.lightbend.training.scalatrain.Time
import org.scalatest.{Matchers, WordSpec}

class TimeTest extends WordSpec with Matchers {

   "Creating a time" should {
     "Throw an IllegalArgumentException when the minutes are less than zero and greater than 59" in {
       an[IllegalArgumentException] should be thrownBy(Time(minutes = -1))
       an[IllegalArgumentException] should be thrownBy(Time(minutes = 60))
     }

     "Throw an IllegalArgumentException when the hours are less than zero and greater than 23" in {
       an[IllegalArgumentException] should be thrownBy(Time(-1))
       an[IllegalArgumentException] should be thrownBy(Time(24))
     }

     "The default arguments for hours and minutes" should{
       "be equals to zero" in {
         val time = Time()
         time.hours shouldEqual(0)
         time.minutes shouldEqual(0)
       }
     }

     "asMinutes for Time(hour = 10)" should {
       "be equal to 600" in {
         val time = Time(hours = 10)
         time.asMinutes shouldEqual 600
       }
     }

    "asMinutes for Time(minutes = 40)" should {
      "be equal to 40" in {
        val time = Time(minutes = 40)
        time.asMinutes shouldEqual(40)
      }
    }

     "asMinutes for Time(2, 45)" should {
       "be equal to 165" in {
         val time = Time(2, 45)
         time.asMinutes shouldEqual(165)
       }
     }

     "Calling minus or -" should {
       "return the correct difference in minutes" in {
         Time(1, 30) minus (10) shouldEqual 80
         Time(1, 30) - 10 shouldEqual(80)
       }
     }

     "calling toString method for Time(1,30)" should {
       "return 01:30" in {
         val time = Time(1,30)
         time.toString shouldBe("01:30")
       }
     }
   }
}
