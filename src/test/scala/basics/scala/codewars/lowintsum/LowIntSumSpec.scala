package basics.scala.codewars.lowintsum

import org.scalatest.FunSuite

class LowIntSumSpec extends FunSuite {

  test("Sum lowest numbers in a array of Ints") {
    val numbers: List[Int] = List(19, 5, 42, 2, 77)
    assert(LowSumInt.sumTwoSmallest(numbers).equals(7))
  }

  test("Sum lowest numbers in a array of Ints for version 2") {
    val numbers: List[Int] = List(19, 5, 42, 2, 77)
    assert(LowSumInt.sumTwoSmallest2(numbers).equals(7))
  }

}
