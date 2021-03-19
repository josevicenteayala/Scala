package basics.scala.codewars.multiplesof3or5

import org.scalatest.FunSuite

class MultiplesOf3Or5Spec extends FunSuite {

  test("Multiples of 3 or 5 of 10") {
    assert(MultiplesOf3Or5.solution(10) == 23)
  }

  test("Multiples of 3 or 5 of 2") {
    assert(MultiplesOf3Or5.solution(2) == 0)
  }

  test("Multiples of 3 or 5 of -10") {
    assert(MultiplesOf3Or5.solution(89782) == 1880876039)
  }

  test("Multiples of 3 or 5 of 10 V2") {
    assert(MultiplesOf3Or5.solutionV2(10) == 23)
  }

  test("Multiples of 3 or 5 of -10 V2") {
    assert(MultiplesOf3Or5.solutionV2(-10) == 23)
  }

  test("Multiples of 3 or 5 of 89782 V2") {
    assert(MultiplesOf3Or5.solutionV2(89782) == 1880876039)
  }

  test("Multiples of 3 or 5 of -1961650628 V2") {
    assert(MultiplesOf3Or5.solutionV2(-1961650628) == 897883743019933544L)
  }

}
