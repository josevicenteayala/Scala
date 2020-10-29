package com.lightbend.training.scalatraining.functions.closure.sales

class ClosureStore (initialSale:Int = 0, maxDiscount:Int = 0) {

  /**
   * All products with ten percent off
   * */
  val sale:Sale = Sale(initialSale)

  /**
   * Function to control max sale
   */
  val saleRestriction: () => Sale = () => {
    if(sale.salePercent > maxDiscount) Sale(maxDiscount)
    else sale
  }

  /**
   * Choosing the right sale
   * @param restriction
   * @return Sale
   */
  def calculateSale(restriction: () => Sale): Sale = restriction()

  /**
   * Calculate all price for all products
   * */
  def basketPrice(products:List[ProductSale]):Double = {
    products.foldLeft(0.0)((accumulator, product)=> accumulator + product.price(calculateSale(saleRestriction)))
  }

}
