package com.lightbend.training.scalatraining.options

import com.lightbend.training.scalatraining.option.OptionReview
import org.scalatest.{Matchers, WordSpec}

class OptionReviewTest extends WordSpec with Matchers {

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
      val maybeAssertion = opt.map(_ shouldBe 6)
      maybeAssertion
    }

    "OptionReview" in {
      val optionReview = new OptionReview()
      val stringReversed = optionReview.revertString(Some("Jose Vicente"))
      stringReversed shouldBe "etneciV esoJ"
    }
  }

}
