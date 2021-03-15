package basics.scala.codewars.comparearrays

import org.scalatest.FunSuite

class CompareArraysSpec extends FunSuite{

  val array1: Seq[Int] = Seq(10,2,4,3,1)
  val array2: Seq[Int] = Seq(2,1,10,4,3)
  val arrayValid1: Seq[Int] = Seq(121, 144, 19, 161, 19, 144, 19, 11)
  val arrayValid2: Seq[Int] = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)

  test("Compare with first array null") {
    assert(!CompareArrays.compareSameArrays(seq1 = null, seq2 = array2))
  }

  test("Compare with second array null") {
    assert(!CompareArrays.compareSameArrays(seq1 = array1, seq2 = null))
  }

  test("Compare with both arrays null") {
    assert(!CompareArrays.compareSameArrays(seq1 = null, seq2 = null))
  }

  test("Compare with first array empty") {
    assert(!CompareArrays.compareSameArrays(seq1 = Seq.empty, seq2 = array2))
  }

  test("Compare with second array empty") {
    assert(!CompareArrays.compareSameArrays(seq1 = array1, seq2 = Seq.empty))
  }

  test("Compare with both arrays empty") {
    assert(CompareArrays.compareSameArrays(seq1 = Seq.empty, seq2 = Seq.empty))
  }

  test("Compare two arrays with different length") {
    assert(!CompareArrays.compareSameArrays(seq1 = array1.filter(_ % 2 == 0), seq2 = array2))
  }

  test("Compare two arrays with same length") {
    assert(CompareArrays.compareSameArrays(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  test("Compare valid arrays"){
    assert(CompareArrays.compareSameArrays(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  test("Invalid array1, missing 1 value") {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArrays(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

  test("Invalid array2 , missing 1 value") {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*12, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArrays(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

  test("Compare with first array null with V2 function") {
    assert(!CompareArrays.compareSameArraysV2(seq1 = null, seq2 = array2))
  }

  test("Compare with second array null with V2 function") {
    assert(!CompareArrays.compareSameArraysV2(seq1 = array1, seq2 = null))
  }

  test("Compare with both arrays null with V2 function") {
    assert(!CompareArrays.compareSameArraysV2(seq1 = null, seq2 = null))
  }

  test("Compare with first array empty with V2 function") {
    assert(!CompareArrays.compareSameArraysV2(seq1 = Seq.empty, seq2 = array2))
  }

  test("Compare with second array empty with V2 function") {
    assert(!CompareArrays.compareSameArraysV2(seq1 = array1, seq2 = Seq.empty))
  }

  test("Compare with both arrays empty with V2 function") {
    assert(CompareArrays.compareSameArraysV2(seq1 = Seq.empty, seq2 = Seq.empty))
  }

  test("Compare two arrays with different length with V2 function") {
    assert(!CompareArrays.compareSameArraysV2(seq1 = array1.filter(_ % 2 == 0), seq2 = array2))
  }

  test("Compare two arrays with same length with V2 function") {
    assert(CompareArrays.compareSameArraysV2(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  test("Compare valid arrays with V2 function"){
    assert(CompareArrays.compareSameArraysV2(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  test("Invalid array1, missing 1 value with V2 function") {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArraysV2(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

  test("Invalid array2 , missing 1 value with V2 function") {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*12, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArraysV2(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

}
