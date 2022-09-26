package basics.scala.codewars.comparearrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CompareArraysSpec extends AnyFlatSpec with should.Matchers{

  val array1: Seq[Int] = Seq(10,2,4,3,1)
  val array2: Seq[Int] = Seq(2,1,10,4,3)
  val arrayValid1: Seq[Int] = Seq(121, 144, 19, 161, 19, 144, 19, 11)
  val arrayValid2: Seq[Int] = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)

  "CompareArrays" should "Compare with first array null" in {
    assert(!CompareArrays.compareSameArrays(seq1 = null, seq2 = array2))
  }

  "CompareArrays" should "Compare with second array null" in {
    assert(!CompareArrays.compareSameArrays(seq1 = array1, seq2 = null))
  }

  "CompareArrays" should "Compare with both arrays null" in {
    assert(!CompareArrays.compareSameArrays(seq1 = null, seq2 = null))
  }

  "CompareArrays" should "Compare with first array empty" in {
    assert(!CompareArrays.compareSameArrays(seq1 = Seq.empty, seq2 = array2))
  }

  "CompareArrays" should "Compare with second array empty" in {
    assert(!CompareArrays.compareSameArrays(seq1 = array1, seq2 = Seq.empty))
  }

  "CompareArrays" should "Compare with both arrays empty" in {
    assert(CompareArrays.compareSameArrays(seq1 = Seq.empty, seq2 = Seq.empty))
  }

  "CompareArrays" should "Compare two arrays with different length" in {
    assert(!CompareArrays.compareSameArrays(seq1 = array1.filter(_ % 2 == 0), seq2 = array2))
  }

  "CompareArrays" should "Compare two arrays with same length" in {
    assert(CompareArrays.compareSameArrays(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  "CompareArrays" should "Compare valid arrays" in {
    assert(CompareArrays.compareSameArrays(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  "CompareArrays" should "Invalid array1, missing 1 value" in {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArrays(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

  "CompareArrays" should "Invalid array2 , missing 1 value" in {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*12, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArrays(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

  "CompareArrays" should "Compare with first array null with V2 function" in {
    assert(!CompareArrays.compareSameArraysV2(seq1 = null, seq2 = array2))
  }

  "CompareArrays" should "Compare with second array null with V2 function" in {
    assert(!CompareArrays.compareSameArraysV2(seq1 = array1, seq2 = null))
  }

  "CompareArrays" should "Compare with both arrays null with V2 function" in {
    assert(!CompareArrays.compareSameArraysV2(seq1 = null, seq2 = null))
  }

  "CompareArrays" should "Compare with first array empty with V2 function" in {
    assert(!CompareArrays.compareSameArraysV2(seq1 = Seq.empty, seq2 = array2))
  }

  "CompareArrays" should "Compare with second array empty with V2 function" in {
    assert(!CompareArrays.compareSameArraysV2(seq1 = array1, seq2 = Seq.empty))
  }

  "CompareArrays" should "Compare with both arrays empty with V2 function" in {
    assert(CompareArrays.compareSameArraysV2(seq1 = Seq.empty, seq2 = Seq.empty))
  }

  "CompareArrays" should "Compare two arrays with different length with V2 function" in {
    assert(!CompareArrays.compareSameArraysV2(seq1 = array1.filter(_ % 2 == 0), seq2 = array2))
  }

  "CompareArrays" should "Compare two arrays with same length with V2 function" in {
    assert(CompareArrays.compareSameArraysV2(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  "CompareArrays" should "Compare valid arrays with V2 function" in {
    assert(CompareArrays.compareSameArraysV2(seq1 = arrayValid1, seq2 = arrayValid2))
  }

  "CompareArrays" should "Invalid array1, missing 1 value with V2 function" in {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArraysV2(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

  "CompareArrays" should "Invalid array2 , missing 1 value with V2 function" in {
    val arrayInvalid1: Seq[Int] = Seq(122, 144, 19, 161, 19, 144, 19, 11)
    val arrayInvalid2: Seq[Int] = Seq(11*12, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    assert(!CompareArrays.compareSameArraysV2(seq1 = arrayInvalid1, seq2 = arrayInvalid2))
  }

}
