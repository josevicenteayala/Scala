package com.lightbend.training.scalatraining.functions

import org.scalatest.{Matchers, WordSpec}

class PartialFunctionsSpec extends WordSpec with Matchers {
  val partialFunctions: PartialFunctions = new PartialFunctions

  "PartialFunctions" should {

    "Divide 20 between ten should be 2" in {
      val partialFunctionDivision: PartialFunction[Int, Int] = partialFunctions.divide(20)
      partialFunctionDivision.isDefinedAt(10) shouldBe true
      partialFunctionDivision.apply(10) shouldBe 2
    }

    "Divide 20 for numbers 1 to 10 " in {
      partialFunctions.divideNumberByNumbersInList(20) shouldBe List(20, 10, 6, 5, 4, 3, 2, 2, 2, 2)
    }

    "Find all odd number in a list" in {
      val list:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
      list collect(partialFunctions.isOdd) shouldBe List(1,3,5,7,9)
    }

    "Find all even number in a list" in {
      val list:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
      list collect(partialFunctions.isEven) shouldBe List(2,4,6,8,10)
    }
  }

}
