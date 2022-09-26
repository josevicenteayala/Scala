package com.lightbend.training.scalatraining

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MultiplePurposeTest extends AnyFlatSpec with should.Matchers {

  "MultiplePurpose" should "For expression to multiply two arrays with elements 1,2,3 each one" in {
      val vector: Seq[Int] = for {
        n <- 1 to 3
        m <- 1 to n
        _ = println(s"$n * $m is "+(n*m))
      }yield n*m
      println(vector)
      vector shouldBe(Vector(1, 2, 4, 3, 6, 9))
  }

  "MultiplePurpose" should "Apply a filter n % 2 == 1  to a set of 1 to 3" in {
      val filter: Seq[Int] = for {
        n <- 1 to 3 if n % 2 == 1
        m <- 1 to n
        _ = println(s"$n % 2 == 1 is "+(n % 2 == 1))
        _ = println(s"$n * $m is "+(n*m))
      } yield n * m
      println(filter)
      filter shouldBe(Vector(1, 3, 6, 9))
  }

  "MultiplePurpose" should "reading minutes" in {
      case class Time(hours: Int, minutes: Int)
      val times: Seq[Time] = Seq()

      for {
        time <- times
        minutes = time.minutes
      } yield minutes
  }

  "MultiplePurpose" should "override def bt val" in {
      class Override {
        def method = {println("method")}
        def method(number :Int) = {println(number)}
        //val method:String = ""
      }
  }

  "MultiplePurpose" should "Inheritance" in {
      class Car
      trait CargoBed {
        def abstractMethod

        def concreteMethod:String = "Concrete method"
      }
      class Truck extends CargoBed {
        override def abstractMethod: Unit = ???
      }

      class FordRanchero extends Car with CargoBed {
        override def abstractMethod: Unit = ???
      }

      val fordRanchero: FordRanchero = new FordRanchero
      println(fordRanchero)

      class Topping
      trait Pepperoni extends Topping
      trait Mushrooms extends Topping

      class Pizza extends Pepperoni with Mushrooms
  }

  "MultiplePurpose" should "Matching pattern" in {
      trait Date
      trait Time
      class DateTime() extends Date with Time {}

      val myDateTime = new DateTime()

      myDateTime match {
        case d: Date => println("Matched a Date")
        case t: Time => println("Matched a Time")
        case _ => println("This was not a date or a time")
      }

      ("a"-> 1) match {
        case("a",x) => println("X is::::: "+x)
      }

      case class TimeCase(hours: Int, minutes: Int)

      TimeCase(1, 30) match {
        case TimeCase(_, 15) => println("15 minutes past")
        case TimeCase(1, _) => println("Sometime after 1")
        case TimeCase(h, m) => println(s"The time is $h:$m")
      }
  }

}
