package basics.scala.codewars.fibonacci

/**
 * The Fibonacci sequence is traditionally used to explain tree recursion.
 * def fibonacci(n: Int): Int = n match {
 * case 0 | 1 => n
 * case _ => fibonacci(n - 1) + fibonacci(n - 2)
 * }
 * This algorithm serves welll its educative purpose but it's tremendously inefficient, not only because of recursion,
 * but because we invoke the fibonacci function twice, and the right branch of recursion (i.e. fibonacci(n-2)) recalculates
 * all the Fibonacci numbers already calculated by the left branch (i.e. fibonacci(n-1)).
 * This algorithm is so inefficient that the time to calculate any Fibonacci number over 50 is simply too much.
 * You may go for a cup of coffee or go take a nap while you wait for the answer.
 * But if you try it here in Code Wars you will most likely get a code timeout before any answers.
 * For this particular Kata we want to implement the memoization solution.
 * This will be cool because it will let us keep using the tree recursion algorithm while still keeping it sufficiently
 * optimized to get an answer very rapidly.
 * The trick of the memoized version is that we will keep a cache data structure (most likely an associative array)
 * where we will store the Fibonacci numbers as we calculate them. When a Fibonacci number is calculated,
 * we first look it up in the cache, if it's not there, we calculate it and put it in the cache,
 * otherwise we returned the cached number.
 *
 * Refactor the function into a recursive Fibonacci function that using a memoized data structure avoids the deficiencies
 * of tree recursion Can you make it so the memoization cache is private to this function?
 * Fiboncci example: 0,1,1,2,3,5,8,13,21,34
 *
 * https://www.codewars.com/kata/529adbf7533b761c560004e5/train/scala
 */

object Fibonacci extends App {

  def fibonacciFunction(currentNumber: BigInt, nextNumber: BigInt): LazyList[BigInt] = {
    println(s"currentNumber $currentNumber nextNumber $nextNumber")
    currentNumber #:: fibonacciFunction(nextNumber, currentNumber + nextNumber)
  }

  lazy val fib: LazyList[BigInt] = fibonacciFunction(BigInt(0), BigInt(1))

}
