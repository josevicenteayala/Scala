package com.lightbend.training.scalatrinin

import org.scalatest.{Matchers, WordSpec}

class MultiplePurposeTest extends WordSpec with Matchers {

  "For expression to multiply two arrays with elements 1,2,3 each one" should {
    "return a Vector(1, 2, 4, 3, 6, 9)" in {
      val vector: Seq[Int] = for {
        n <- 1 to 3
        m <- 1 to n
        _ = println(s"$n * $m is "+(n*m))
      }yield n*m
      println(vector)
      vector shouldBe(Vector(1, 2, 4, 3, 6, 9))
    }
  }

  "Apply a filter n % 2 == 1  to a set of 1 to 3" should {
    "generate a Vector(1, 3, 6, 9)" in {
      val filter: Seq[Int] = for {
        n <- 1 to 3 if n % 2 == 1
        m <- 1 to n
        _ = println(s"$n % 2 == 1 is "+(n % 2 == 1))
        _ = println(s"$n * $m is "+(n*m))
      } yield n * m
      println(filter)
      filter shouldBe(Vector(1, 3, 6, 9))
    }
  }

  "reading minutes" should {
    "empty minutes" in {
      case class Time(hours: Int, minutes: Int)
      val times: Seq[Time] = Seq()

      for {
        time <- times
        minutes = time.minutes
      } yield minutes
    }
  }

  "override def bt val" should {
    "error in compile time" in {
      class Override {
        def method = {println("method")}
        def method(number :Int) = {println(number)}
        //val method:String = ""
      }
    }
  }
}
