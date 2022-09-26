package com.lightbend.training.scalatraining.generators

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class GeneratorTest extends AnyFlatSpec with should.Matchers {
  "Generator" should "Since a pattern in generator with map structure" in {
      val vec = for(
        (key, value) <- Vector("a"->1, "b"->2, "c"->3)
      )yield key+value
      vec.head shouldBe("a1")
  }

}
