package basics.scala.codewars.replacealphabet

/**
 *You are required to, given a string, replace every letter with its position in the alphabet.
 *
 * If anything in the text isn't a letter, ignore it and don't return it.
 *
 * "a" = 1, "b" = 2, etc.
 * Example alphabetPosition("The sunset sets at twelve o' clock.")
 * Should return "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11" (as a string)
 *
 * https://www.codewars.com/kata/546f922b54af40e1e90001da/train/scala
 */
object ReplaceAlphabet extends App {

  def alphabetPosition(text: String): String = {
    text.toLowerCase.toList.flatMap(("abcdefghijklmnopqrstuvwxyz".toList zip List.range(1, 27)).toMap.get).mkString(" ")
  }

  def alphabetPositionV2(text: String): String = {
    text.toLowerCase.toList.flatMap((('a' to 'z').toList zip List.range(1, 27)).toMap.get).mkString(" ")
  }

  /**
   * This solution use a filter by only letters and then reduce to 1 in ascii table all letters in lower case.
   * The ascii value for 'a' is 97, reducing 96 to this ascci, character 'a' should be 1.
   * Visit https://www.ascii-code.com/ to check ascii values.
   * @param text
   * @return
   */
  def alphabetPositionV3(text: String): String = {
    text.filter(_.isLetter).map(_.toLower - 96).mkString(" ")
  }
}
