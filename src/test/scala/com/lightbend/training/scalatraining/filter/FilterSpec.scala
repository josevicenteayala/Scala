package com.lightbend.training.scalatraining.filter

import org.scalatest.{Matchers, WordSpec}

class FilterSpec extends WordSpec with Matchers {

  "Apply filter to -Hello Word- text" should {
    "contains vowels eoo" in {
      val str: String = "Hello World".filter(char => List('a', 'e', 'i', 'o', 'u').contains(char))
      str shouldBe("eoo")
    }
  }

  "Apply filterNot to -Hello Word- text" should {
    "contains vowels eoo" in {
      val str: String = "Hello World".filterNot(char => List('a', 'e', 'i', 'o', 'u').contains(char))
      str shouldBe("Hll Wrld")
    }
  }
}
