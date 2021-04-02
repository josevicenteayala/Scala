package basics.scala.codewars.fibonacci

import org.scalatest.FunSuite

class FibonacciSpec extends FunSuite {

  test("Fibonacciof 6") {
    assert(Fibonacci.fib(6).toString.equals("8"))
  }

  test("Fibonacciof 50") {
    assert(Fibonacci.fib(4).toString.equals("12586269025"))
  }
}
