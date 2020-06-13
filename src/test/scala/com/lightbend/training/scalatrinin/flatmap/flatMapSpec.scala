package com.lightbend.training.scalatrinin.flatmap

import org.scalatest.{Matchers, WordSpec}

class flatMapSpec extends WordSpec with Matchers {

  "flat map of array Strings" should {
    "return a String type" in {
      val str : String = "This is the string to test"
      val split : Array[String] = str.split(" ")
      val flatMapped : Array[Char] = split.flatMap(word => word.toLowerCase)
      flatMapped shouldBe a [Array[Char]]
    }
  }

}
