package basics.scala.codewars.consecutivestrings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ConsecutiveStringsSpec extends AnyFlatSpec with should.Matchers {

  "ConsecutiveStrings" should "ConsecutiveStrings returns folingtrashy"in {
    val strarr = Array("tree", "foling", "trashy", "blue", "abcdef", "uvwxyz")
    assert(ConsecutiveStrings.longestConsec(strarr,2).equals("folingtrashy"))
  }

  "ConsecutiveStrings" should "ConsecutiveStrings returns abigailtheta"in {
    val strarr = Array("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail")
    assert(ConsecutiveStrings.longestConsec(strarr,2).equals("abigailtheta"))
  }

  "ConsecutiveStrings" should "ConsecutiveStrings returns empty with k > array size"in {
    val strarr = Array("it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz")
    val str = ConsecutiveStrings.longestConsec(strarr, 15)
    assert(str.equals(""))
  }

  "ConsecutiveStrings" should "ConsecutiveStrings ejjjjmmtthh,zxxuueeg,aanlljrrrxx,dqqqaaabbb,oocccffuucccjjjkkkjyyyeehh"in {
    val strarr = Array("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    assert(ConsecutiveStrings.longestConsec(strarr,1).equals("oocccffuucccjjjkkkjyyyeehh"))
  }

  "ConsecutiveStrings" should "ConsecutiveStringsV2 ejjjjmmtthh,zxxuueeg,aanlljrrrxx,dqqqaaabbb,oocccffuucccjjjkkkjyyyeehh"in {
    val strarr = Array("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    assert(ConsecutiveStrings.longestConsecV2(strarr,1).equals("oocccffuucccjjjkkkjyyyeehh"))
  }
}
