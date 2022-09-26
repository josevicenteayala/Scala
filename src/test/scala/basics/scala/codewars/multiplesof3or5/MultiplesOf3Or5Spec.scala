package basics.scala.codewars.multiplesof3or5

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MultiplesOf3Or5Spec extends AnyFlatSpec with should.Matchers {

  "MultiplesOf3Or5" should "Multiples of 3 or 5 of 10"in {
    assert(MultiplesOf3Or5.solution(10) == 23)
  }

  "MultiplesOf3Or5" should "Multiples of 3 or 5 of 2"in {
    assert(MultiplesOf3Or5.solution(2) == 0)
  }

  "MultiplesOf3Or5" should "Multiples of 3 or 5 of -10"in {
    assert(MultiplesOf3Or5.solution(89782) == 1880876039)
  }

  "MultiplesOf3Or5" should "Multiples of 3 or 5 of 10 V2"in {
    assert(MultiplesOf3Or5.solutionV2(10) == 23)
  }

  "MultiplesOf3Or5" should "Multiples of 3 or 5 of -10 V2"in {
    assert(MultiplesOf3Or5.solutionV2(-10) == 23)
  }

  "MultiplesOf3Or5" should "Multiples of 3 or 5 of 89782 V2"in {
    assert(MultiplesOf3Or5.solutionV2(89782) == 1880876039)
  }

  "MultiplesOf3Or5" should "Multiples of 3 or 5 of -1961650628 V2"in {
    assert(MultiplesOf3Or5.solutionV2(-1961650628) == 897883743019933544L)
  }

}
