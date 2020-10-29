package com.lightbend.training.scalatraining.functions.closure.sales

class Jean(initialPrice:Double) extends ProductSale {

  override val name: String = this.getClass.getName

  override def price(sale: Sale): Double = {
    sale.salePercent match {
      case 0 => initialPrice
      case _ =>initialPrice - (initialPrice / sale.salePercent)
    }
  }
}
