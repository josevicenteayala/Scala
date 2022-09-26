package implicits

import implicits.useimplicits.UseImplicits
import org.scalatest.{Matchers, WordSpec}

class ImplicitsSpec extends WordSpec with Matchers{
  val stringToTest = "This is a simple character "

  "Implicits" should {
    "count number of 'a' in a string" in {
      UseImplicits.countSpecificCharacter(stringToTest, 'a') shouldBe 3
    }

    "replace spaces with underscore" in {
      UseImplicits.replaceSpacesWithUnderscore(stringToTest) shouldBe "This_is_a_simple_character_"
    }
  }
}
