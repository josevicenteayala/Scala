package com.lightbend.training.scalatraining.generators

import org.scalatest.{Matchers, WordSpec}

class GeneratorTest extends WordSpec with Matchers{

  "Since a pattern in generator with map structure" should {
    "create a new structure" in {
      val vec = for(
        (key, value) <- Vector("a"->1, "b"->2, "c"->3)
      )yield key+value
      vec.head shouldBe("a1")
    }
  }

}
