package com.lightbend.training.scalatraining.functions.closure.sales

trait ProductSale {

  val name:String

  def price(sale:Sale): Double
}
