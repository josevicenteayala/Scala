package chanllenges.palindrome

object Palindrome {

  def main(args: Array[String]): Unit = {
    println(s" the word kayak is palindrome: ${isPalindrome("kayak")}")
    println(s" the word anna is palindrome: ${isPalindrome("anna")}")
    println(s" the word house is palindrome: ${isPalindrome("house")}")

    println(s" the word kayak is palindrome: ${isPalindromeEnhancement("kayak")}")
    println(s" the word anna is palindrome: ${isPalindromeEnhancement("anna")}")
    println(s" the word house is palindrome: ${isPalindromeEnhancement("house")}")
  }

/**
 * Palindrome words, for example
 * Anna, civic, kayak, level
 * */
  def isPalindrome(word:String): Boolean = {
    word.length % 2 match {
      case 1 =>
        calculateWords(word.toLowerCase, word.length/2, word.length/2+1)
      case _ =>
        calculateWords(word.toLowerCase, word.length/2, word.length/2)
    }
  }

  def isPalindromeEnhancement(word:String):Boolean = word.toLowerCase == word.reverse.toLowerCase

  private def calculateWords(word:String,lengthInitialWord:Int, lengthSecondWord:Int):Boolean = {
    val word1 = word.substring(0, lengthInitialWord)
    val word2 = word.substring(lengthSecondWord)
    word1.reverse.equals(word2)
  }
}
