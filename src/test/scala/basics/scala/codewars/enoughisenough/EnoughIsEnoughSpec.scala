package basics.scala.codewars.enoughisenough

import org.scalatest.FunSuite

class EnoughIsEnoughSpec extends FunSuite {

  test("deleteNth") {
    assert(EnoughIsEnough.deleteNth(List(1, 2, 3, 1, 2, 1, 2, 3), 2).equals(List(1, 2, 3, 1, 2, 3)))
  }

  test("deleteNthV1") {
    assert(EnoughIsEnough.deleteNthV1(List(1, 2, 3, 1, 2, 1, 2, 3), 2).equals(List(1, 2, 3, 1, 2, 3)))
  }
}
