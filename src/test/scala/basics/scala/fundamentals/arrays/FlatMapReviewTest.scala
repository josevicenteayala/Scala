package basics.scala.fundamentals.arrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class FlatMapReviewTest extends AnyFlatSpec with should.Matchers{

  "FlatMapReview" should "Convert a list into another list applying this function: def f(x: Int): List[Int] = List(x - 1, x, x + 1)" in {
    val result = FlatMapReview.convertAListIntoConsecutiveNumbersList(List(1, 2, 3))
    assert(result == List(0,1,2,1,2,3,2,3,4))
  }

  "FlatMapReview" should "Convert a list of list applying this function: def f(x: Int): List[Int] = List(x - 1, x, x + 1)" in {
    val result = FlatMapReview.convertSomeListIntoConsecutiveNumbers(List(List(1,2),List(3,4)))
    assert(result == List(List(0, 1, 2), List(1, 2, 3), List(2, 3, 4), List(3, 4, 5)))
  }

  "FlatMapReview" should "Convert a list of list applying this function: def f(x: Int): List[Int] = List(x - 1, x, x + 1) but using flatMap internally" in {
    val result = FlatMapReview.convertSomeListIntoConsecutiveNumbersUsingFlatMap(List(List(1,2),List(3,4)))
    assert(result == List(0, 1, 2,1, 2, 3,2, 3, 4,3, 4, 5))
  }
}
