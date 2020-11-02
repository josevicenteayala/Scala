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
    override def apply(dividend: Int): Int = {
      number / dividend
    }
  }

  /**
   * This method use a PartialFunction in a collection
   * @return List with numbers divide by 2
   */
  def divideNumberByNumbersInList(number:Int): List[Int] = {
    val listOfDividends = List(1,2,3,4,5,6,7,8,9,10)
    listOfDividends collect (divide(number))
  }

  val isEven: PartialFunction[Int, Int] = {
    case x if x % 2 == 0 => x
  }

  val isOdd: PartialFunction[Int, Int] = {
    case x if x % 2 == 1 => x
  }
}
