package triatImpl

import `trait`.Ingredient

class Tomato extends Ingredient {
  override def ingredient: String = "Tomato"

  override val quantity: Int = 1
  override val price: Double = 2
}
