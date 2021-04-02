package basics.scala.codewars.fibonacci

import org.scalatest.FunSuite

class FibonacciSpec extends FunSuite {

  test("FibonacciOf 6") {
    assert(Fibonacci.fib(6).toString.equals("8"))
  }

  test("FibonacciOf 50") {
    assert(Fibonacci.fib(50).toString.equals("12586269025"))
  }

  test("FibonacciOf 60") {
    assert(Fibonacci.fib(60).toString.equals("1548008755920"))
  }

  test("FibonacciOf 70") {
    assert(Fibonacci.fib(70).toString.equals("190392490709135"))
  }
}
