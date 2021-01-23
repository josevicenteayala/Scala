package `trait`

/**
 * Hamburger is a trait to emulate a real Hamburger
 */
trait Hamburger {
  val priceBase : Int
  def getPrice(ingredients:List[Ingredient] = List.empty) : Double
  def addIngredient(ingredient:Ingredient): List[Ingredient]
}
