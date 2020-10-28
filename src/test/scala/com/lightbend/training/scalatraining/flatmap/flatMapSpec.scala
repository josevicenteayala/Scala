package com.lightbend.training.scalatraining.flatmap

import org.scalatest.{Matchers, WordSpec}

class flatMapSpec extends WordSpec with Matchers {

  "flat map of array Strings" should {
    "return a String type" in {
      val str : String = "This is the string to test"
      val split : Array[String] = str.split(" ")
      val flatMapped : Array[Char] = split.flatMap(word => word.toUpperCase)
      flatMapped shouldBe a [Array[Char]]
      flatMapped.foreach(println)

      val strings: Array[String] = split.map(word => word.toUpperCase())
      println("map "+strings)
      strings.foreach(println)
    }
  }

}
