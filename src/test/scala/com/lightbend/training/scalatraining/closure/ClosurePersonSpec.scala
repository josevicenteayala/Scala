package com.lightbend.training.scalatraining.closure

import com.lightbend.training.scalatraining.functions.closure.{AnotherPerson, Person}
import org.scalatest.{Matchers, WordSpec}

class ClosurePersonSpec extends WordSpec with Matchers {

  "ClosurePerson" should {
    "Martha is older than Vicente" in {
     val anotherPerson:AnotherPerson = new AnotherPerson
     val marthaPerson = anotherPerson.person
     anotherPerson.isOlderThanVicente(marthaPerson) shouldBe true
    }
  }

  "ClosurePerson" should {
    "Carlos is younger than Vicente" in {
      val anotherPerson:AnotherPerson = new AnotherPerson
      val carlosPerson = Person("Carlos", "Castro", 30)
      anotherPerson.isOlderThanVicente(carlosPerson) shouldBe false
    }
  }

}
