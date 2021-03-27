package basics.scala.codewars.splitstrings

import org.scalatest.FunSuite

class SplitStringsSpec extends FunSuite {

  test("split string abcdef") {
    StringSplits.solution("abcdef") == List("ab","cd","ef")
  }

  test("split string abc") {
    StringSplits.solution("abc") == List("ab","c")
  }

  test("split string empty") {
    StringSplits.solution("") == List.empty
  }

  test("test solution 2") {
    "abcdefg".grouped(2).map(_.padTo(2,'_')).toList == List("ab","cd","ef")
  }
}
