package com.lightbend.training.scalatraining.either

import org.scalatest.{Matchers, WordSpec}

class EitherExampleSpec extends WordSpec with Matchers{

  "Either" should {
    "calculate value plus 10 for value 2 should be 20" in {
      val response: Either[IllegalArgumentException, Int] = EitherExample.calculatedValuePlus10("2")
      response.isRight shouldBe true
    }

    "calculate value plus 10 for 'two' value should get IllegalArgumentException" in {
      val response: Either[IllegalArgumentException, Int] = EitherExample.calculatedValuePlus10("two")
      response.isLeft shouldBe true

      response match {
        case Right(value) => println(s"Right value $value")
        case Left(value) => print(s"Left value $value")
      }
    }

    "calculate value plus 10 for 2 value should print 20" in {
      val response: Either[IllegalArgumentException, Int] = EitherExample.calculatedValuePlus10("two")
      response match {
        case Right(value) => {
          println(s"Right value $value")
          value shouldBe 20
        }
        case Left(value) => print(s"Left value $value")
      }
    }

    "calculate value plus 10 for 'two' value should print IllegalArgumentException" in {
      val response: Either[IllegalArgumentException, Int] = EitherExample.calculatedValuePlus10("two")
      response match {
        case Right(value) => {
          println(s"Right value $value")
        }
        case Left(value) => {
          print(s"Left value $value")
          value.getMessage shouldBe "The value two is not a number"
        }
      }
    }
  }

}
