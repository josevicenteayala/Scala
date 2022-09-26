package basics.scala.codewars.lowintsum

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class LowIntSumSpec extends AnyFlatSpec with should.Matchers {

  "LowIntSumSpec" should "Sum lowest numbers in a array of Ints" in {
    val numbers: List[Int] = List(19, 5, 42, 2, 77)
    assert(LowSumInt.sumTwoSmallest(numbers).equals(7))
  }

  "LowIntSumSpec" should "Sum lowest numbers in a array of Ints for version 2" in {
    val numbers: List[Int] = List(19, 5, 42, 2, 77)
    assert(LowSumInt.sumTwoSmallest2(numbers).equals(7))
  }

}
