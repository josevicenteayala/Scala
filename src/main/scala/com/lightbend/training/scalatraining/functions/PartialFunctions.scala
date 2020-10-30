package com.lightbend.training.scalatraining.functions

class PartialFunctions {

  def divide(number:Int): PartialFunction[Int, Int] = new PartialFunction[Int, Int] {
    /**
     * This method should be called first to guarantee the division
     * @param dividend
     * @return
     */
    override def isDefinedAt(dividend: Int): Boolean = dividend != 0

    /**
     * This method makes the division
     * @param dividend
     * @return
     */
    override def apply(dividend: Int): Int = number / dividend
  }

}
