package implicits

import implicits.useimplicits.UseImplicits
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ImplicitsSpec extends AnyFlatSpec with should.Matchers {
  val stringToTest = "This is a simple character "

  "Implicits" should "count number of 'a' in a string" in {
      UseImplicits.countSpecificCharacter(stringToTest, 'a') shouldBe 3
    }

  "Implicits" should "replace spaces with underscore" in {
      UseImplicits.replaceSpacesWithUnderscore(stringToTest) shouldBe "This_is_a_simple_character_"
    }
}
