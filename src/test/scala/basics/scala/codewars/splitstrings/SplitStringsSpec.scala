package basics.scala.codewars.splitstrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class SplitStringsSpec extends AnyFlatSpec with should.Matchers {

  "SplitStrings" should "split string abcdef" in {
    StringSplits.solution("abcdef") == List("ab","cd","ef")
  }

  "SplitStrings" should "split string abc" in {
    StringSplits.solution("abc") == List("ab","c")
  }

  "SplitStrings" should "split string empty" in {
    StringSplits.solution("") == List.empty
  }

  "SplitStrings" should "test solution 2" in {
    "abcdefg".grouped(2).map(_.padTo(2,'_')).toList == List("ab","cd","ef")
  }
}
