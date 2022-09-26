package com.lightbend.training.scalatraining.functions

import com.lightbend.training.scalatraining.functions.Function._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
class FunctionSpec extends AnyFlatSpec with should.Matchers{

  "Function" should
    "True comparing if 10 is greater than 5" in {
      executeFunction(greaterThan, 10, 5) shouldBe true
    }

  "Function" should "True comparing if 10 is less than 15" in {
      executeFunction(lessThan, 10, 15) shouldBe true
    }

  "Function" should "Add 10 to 20 result in 30" in {
      executeGenericFunction(sumTen,20) shouldBe 30
    }

  "Function" should "Say hello to Vicente name" in {
      executeGenericFunction(sayHelloTo,"Vicente") shouldBe "Hello Vicente"
    }

  "Function" should "Using function that returns a function like sayHiToSomeone" in {
      sayHelloToSomeone("Vicente") shouldBe "Hello Vicente"
    }

  "Function" should "Using a composition of functions, language english" in {
      greetingSomeone("english", "Vicente", "Ayala") shouldBe "Hello Vicente Ayala"
    }

  "Function" should "Using a composition of functions, language spanish" in {
      greetingSomeone("spanish", "Martha", "Duque") shouldBe "Hola Martha Duque"
    }

  "Function" should "Using a composition of functions, language french" in {
      greetingSomeone("french", "Isabel", "Ayala") shouldBe "Salut Isabel Ayala"
    }

}
