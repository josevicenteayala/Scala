package com.lightbend.training.scalatraining.filter

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class FilterSpec extends AnyFlatSpec with should.Matchers {

  "FilterSpec" should "Apply filter to -Hello Word- text" in {
      val str: String = "Hello World".filter(char => List('a', 'e', 'i', 'o', 'u').contains(char))
      str shouldBe("eoo")
  }

  "FilterSpec" should "Apply filterNot to -Hello Word- text" in {
      val str: String = "Hello World".filterNot(char => List('a', 'e', 'i', 'o', 'u').contains(char))
      str shouldBe("Hll Wrld")
  }
}
