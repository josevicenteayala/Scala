package `trait`

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import triatImpl.{Meet, SimpleHamburger}

class HamburgerSpec extends AnyFlatSpec with should.Matchers {

  "Hamburger" should
    "Get the price 22 for a Hamburger with 2 Meet and 2 Tomato: Hamburger price is 10, Tomato 2 and Meet 5*2" in {
      val simpleHamburger:Hamburger = new SimpleHamburger
      val ingredientList: List[Ingredient] = simpleHamburger.addIngredient(new Meet)
      simpleHamburger.getPrice(ingredientList) shouldBe(22.0)
    }

    "Hamburger" should "Get the price 17 for a Simple Hamburger with 1 Meet and 1 Tomato: Hamburger price is 10, Tomato 2 and Meet 5" in {
      val simpleHamburger:Hamburger = new SimpleHamburger

      simpleHamburger.getPrice(List.empty) shouldBe(17.0)
    }

}
