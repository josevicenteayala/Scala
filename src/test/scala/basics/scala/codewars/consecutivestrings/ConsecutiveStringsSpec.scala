package basics.scala.codewars.consecutivestrings

import org.scalatest.FunSuite

class ConsecutiveStringsSpec extends FunSuite {

  test("ConsecutiveStrings returns folingtrashy") {
    val strarr = Array("tree", "foling", "trashy", "blue", "abcdef", "uvwxyz")
    assert(ConsecutiveStrings.longestConsec(strarr,2).equals("folingtrashy"))
  }

  test("ConsecutiveStrings returns abigailtheta") {
    val strarr = Array("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail")
    assert(ConsecutiveStrings.longestConsec(strarr,2).equals("abigailtheta"))
  }

  test("ConsecutiveStrings returns empty with k > array size") {
    val strarr = Array("it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz")
    val str = ConsecutiveStrings.longestConsec(strarr, 15)
    assert(str.equals(""))
  }

  test("ConsecutiveStrings ejjjjmmtthh,zxxuueeg,aanlljrrrxx,dqqqaaabbb,oocccffuucccjjjkkkjyyyeehh") {
    val strarr = Array("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    assert(ConsecutiveStrings.longestConsec(strarr,1).equals("oocccffuucccjjjkkkjyyyeehh"))
  }

  test("ConsecutiveStringsV2 ejjjjmmtthh,zxxuueeg,aanlljrrrxx,dqqqaaabbb,oocccffuucccjjjkkkjyyyeehh") {
    val strarr = Array("ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh")
    assert(ConsecutiveStrings.longestConsecV2(strarr,1).equals("oocccffuucccjjjkkkjyyyeehh"))
  }
}
