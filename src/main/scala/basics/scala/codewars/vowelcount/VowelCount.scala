package basics.scala.codewars.vowelcount

import java.util.stream.IntStream

/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, u as vowels for this Kata (but not y).
 * The input string will only consist of lower case letters and/or spaces.
 */
object VowelCount extends App {

  def getCount(inputStr: String): Int = {
    inputStr match {
      case s =>  s.count(_.equals('a')) + s.count(_.equals('e')) + s.count(_.equals('i')) + s.count(_.equals('o')) + s.count(_.equals('u'))
      case _ => 0
    }
  }

  def getCountV2(inputStr: String): Int = {
    inputStr.toCharArray.map("aeiou".toCharArray.contains(_)).filter(_.equals(true)).length
  }

  def getCountV3(inputStr: String): Int = {
    inputStr.count("aeiou".contains(_))
  }

  def getCountV4(inputStr: String): Int = {
    inputStr.count { c =>
      c match {
        case 'a' | 'e' | 'i' | 'o' | 'u' => true
        case _ => false
      }
    }
  }

  def getCountV5(inputStr: String): Int = {
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    inputStr.filter(vowels.contains).length
  }
}
