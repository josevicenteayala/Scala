package triatImpl

import `trait`.Ingredient

class Meet extends Ingredient{
  override def ingredient: String = "Meet"

  override val quantity: Int = 1
  override val price: Double = 5
}
