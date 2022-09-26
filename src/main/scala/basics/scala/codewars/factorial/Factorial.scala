package basics.scala.codewars.factorial

import scala.annotation.tailrec

/**
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
 * N! = 1 * 2 * 3 * ... * N
 * Be careful 1000! has 2568 digits...
 * For more info, see: http://mathworld.wolfram.com/Factorial.html
 *
 * zeros(6) = 1
 * # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero
 * zeros(12) = 2
 * # 12! = 479001600 --> 2 trailing zeros
 */
object Factorial extends App {

  def zeros(n: Int): Int = {

    @tailrec def factorialWitAccumulator(accumulator:BigInt, number: Int):BigInt = {
      println(s" $accumulator $number")
      number match {
        case 0 | 1 => accumulator
        case _ => factorialWitAccumulator(number * accumulator, number - 1)
      }
    }

    val int = factorialWitAccumulator(1, n)
    println(int)
    int.toString.reverse.split("").toList.takeWhile(s => s.equals("0")).length
  }

  def factorial(n: Int): String = {

    @tailrec def factorialWitAccumulator(accumulator:BigInt, number: Int):BigInt = {
      println(s" $accumulator $number")
      number match {
        case 0 | 1 => accumulator
        case _ => factorialWitAccumulator(number * accumulator, number - 1)
      }
    }
    factorialWitAccumulator(1, n).toString
  }

}
