package com.lightbend.training.scalatraining.options

import org.scalatest.{Matchers, WordSpec}

class OptionTest extends WordSpec with Matchers {

  "Option" should {
    "Some string" in {
      val myString = "This is an string"
      Option(myString) match {
        case Some(str) => println(str)
        case _ => println("String not found")
      }
    }

    "Map option string" in {
      val string = "String"
      val opt: Option[Int] = Option(string).map(str =>str.length)
    }
  }

}
