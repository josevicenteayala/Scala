package triatImpl

import `trait`.{Hamburger, Ingredient}

class SimpleHamburger extends Hamburger {

  private val ingredientList : List[Ingredient] = List(new Tomato, new Meet)

  override val priceBase: Int = 10

  override def getPrice(ingredients: List[Ingredient]): Double = {
    ingredients match {
      case ::(head, tail) => {
        println("Case ingredients full")
        println("HEAD::: "+head)
        println("TAIL::: "+tail)
        ingredients.foldLeft(0.0)((result, ingredient) => result + ingredient.price * ingredient.quantity) + priceBase
      }
      case Nil => {
        println("Case ingredients empty")
        ingredientList.foldLeft(0.0)((result, ingredient) => result + ingredient.price * ingredient.quantity) + priceBase
      }
    }
  }

  override def addIngredient(ingredient: Ingredient): List[Ingredient] = {
    ingredientList :+ ingredient
  }
}
