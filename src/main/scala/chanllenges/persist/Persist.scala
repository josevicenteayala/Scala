package chanllenges.persist

import scala.annotation.tailrec

/**
 * This method takes in a positive parameter num and returns its multiplicative persistence,
 * which is the number of times you must multiply the digits in num until you reach a single digit.
 *
 * For example (Input --> Output):
 *
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
 * 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
 * 4 --> 0 (because 4 is already a one-digit number)
 */
object Persist {

  def persistence(n:Int): Int = if(n< 10) 0
  else {
    val multiplication = n.toString.chars().map(c => c - '0').reduce((c,d)=> c * d).orElse(1)
    1 + persistence(multiplication)
  }

  def persistence2(n:Int): Int = {

    @tailrec
    def timesToBePersisted(number:Int, counter :Int): Int = {
      if(number < 10) counter
      else {
        val multiplication = number.toString.chars().map(c => c - '0').reduce((c,d)=> c * d).orElse(1)
        timesToBePersisted(multiplication, counter+1)
      }
    }
    timesToBePersisted(n,0)
  }

  @tailrec
  def persistenceEnhanced(n: Int, depth: Int = 0): Int =
    if (n < 10) depth else persistenceEnhanced(n.toString.map(_.asDigit).product, depth+1)

  def multiplyDigits(n: Int): Int = if (n >= 10) n % 10 * multiplyDigits(n/10) else n

  def persistenceUsingMultiplyDigits(n: Int): Int = if (n >= 10) persistenceUsingMultiplyDigits(multiplyDigits(n)) + 1 else 0

}
