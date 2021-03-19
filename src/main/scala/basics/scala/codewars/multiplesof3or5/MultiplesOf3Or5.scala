package basics.scala.codewars.multiplesof3or5

import scala.annotation.tailrec

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * Note: If the number is a multiple of both 3 and 5, only count it once. Also, if a number is negative, return 0(for languages that do have them)
 */
object MultiplesOf3Or5 extends App {

  def solution(number: Int): Long = {
    (3 to number-1).foldLeft(List.empty[Long]) {
      (list, item) =>
        if (item % 3 == 0) item :: list
        else if (item % 5 == 0) item :: list
        else list
    }.sum
  }

  def solutionV2(number: Int): Long = {
    @tailrec
    def sum3Or5(num:Int, accumulator: BigInt): BigInt  = {
      if(num <= 0) accumulator
      else if (num % 3 == 0 || num % 5 == 0) sum3Or5(num - 1, accumulator + num )
      else sum3Or5(num-1, accumulator)
    }
    sum3Or5(Math.abs(number)-1, 0).longValue
  }

  def solutionV3(number: Int): Long =
    (1 until number).view.filter(x => x % 3 == 0 || x % 5 == 0).foldLeft(0L)(_ + _)

  def solutionV4(number: Int): Long = (1L until number).filter(x => x % 3 == 0 || x % 5 == 0).sum

}
