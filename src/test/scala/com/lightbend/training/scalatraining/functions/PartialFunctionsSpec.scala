package com.lightbend.training.scalatraining.functions

import org.scalatest.{Matchers, WordSpec}

class PartialFunctionsSpec extends WordSpec with Matchers {

  "PartialFunctions" should {

    "Divide 20 between ten should be 2" in {
     val partialFunctions: PartialFunctions = new PartialFunctions
      val partialFunctionDivision: PartialFunction[Int, Int] = partialFunctions.divide(20)
      partialFunctionDivision.isDefinedAt(10) shouldBe true
      partialFunctionDivision.apply(10) shouldBe 2
    }
  }

}
