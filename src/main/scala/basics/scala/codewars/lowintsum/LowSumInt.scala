package basics.scala.codewars.lowintsum

/**
 * Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 positive integers.
 * No floats or non-positive integers will be passed.
 * For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.
 * [10, 343445353, 3453445, 3453545353453] should return 3453455.
 */
object LowSumInt extends App {

  /**
   * Return the sum of lowest positive numbers
   * @param numbers list
   * @return Int with the sum
   */
  def sumTwoSmallest(numbers: List[Int]): Int = {
    numbers.sortWith(_ < _).grouped(2).toList.head.sum
  }

  /**
   * Return the sum of lowest positive numbers
   * @param numbers list
   * @return Int with the sum
   */
  def sumTwoSmallest2(numbers: List[Int]): Int = {
    numbers.sortWith(_ < _).take(2).sum
  }
}
