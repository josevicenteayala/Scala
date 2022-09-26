package basics.scala.codewars.enoughisenough

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class EnoughIsEnoughSpec extends AnyFlatSpec with should.Matchers {

  "EnoughIsEnough" should "deleteNth"in {
    assert(EnoughIsEnough.deleteNth(List(1, 2, 3, 1, 2, 1, 2, 3), 2).equals(List(1, 2, 3, 1, 2, 3)))
  }

  "EnoughIsEnough" should "deleteNthV1"in {
    assert(EnoughIsEnough.deleteNthV1(List(1, 2, 3, 1, 2, 1, 2, 3), 2).equals(List(1, 2, 3, 1, 2, 3)))
  }
}
