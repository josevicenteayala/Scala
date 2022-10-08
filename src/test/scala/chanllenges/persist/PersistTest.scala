package chanllenges.persist

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersistTest extends AnyFlatSpec with Matchers {

  "Persist" should "return 4 times when the number is 999" in {
    Persist.persistence(999) shouldBe 4
  }

  "Persist" should "return 3 times when the number is 39" in {
    Persist.persistence(39) shouldBe 3
  }

  "Persist" should "return 0 times when the number is 4" in {
    Persist.persistence(4) shouldBe 0
  }

  "Persist" should "return 1 times when the number is 123" in {
    Persist.persistence(123) shouldBe 1
  }

  "Persist.persistence2" should "return 4 times when the number is 999" in {
    Persist.persistence2(999) shouldBe 4
  }

  "Persist.persistence2" should "return 3 times when the number is 39" in {
    Persist.persistence2(39) shouldBe 3
  }

  "Persist.persistence2" should "return 0 times when the number is 4" in {
    Persist.persistence2(4) shouldBe 0
  }

  "Persist.persistence2" should "return 1 times when the number is 123" in {
    Persist.persistence2(123) shouldBe 1
  }

  "Persist.persistenceEnhanced" should "return 1 times when the number is 123" in {
    Persist.persistenceEnhanced(123) shouldBe 1
  }
}
