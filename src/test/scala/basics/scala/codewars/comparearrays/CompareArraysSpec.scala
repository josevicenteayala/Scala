package basics.scala.codewars.comparearrays

import org.scalatest.FunSuite

class CompareArraysSpec extends FunSuite{

  val array1: Seq[Int] = Seq(1,2,3,4)
  val array2: Seq[Int] = Seq(1,2,3,4)

  test("Compare with first array null") {
    assert(CompareArrays.compareSameArrays(seq1 = null, seq2 = array2) == false)
  }

}
