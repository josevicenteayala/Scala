package basics.scala.codewars.fibonacci

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class FibonacciSpec extends AnyFlatSpec with should.Matchers {

  "Fibonacci" should "FibonacciOf 6"in {
    assert(Fibonacci.fib(6).toString.equals("8"))
  }

  "Fibonacci" should "FibonacciOf 50"in {
    assert(Fibonacci.fib(50).toString.equals("12586269025"))
  }

  "Fibonacci" should "FibonacciOf 60"in {
    assert(Fibonacci.fib(60).toString.equals("1548008755920"))
  }

  "Fibonacci" should "FibonacciOf 70"in {
    assert(Fibonacci.fib(70).toString.equals("190392490709135"))
  }

  "Fibonacci" should "FibonacciOf 6 with fibonacciV2"in {
    assert(Fibonacci.fibonacciV2(6).toString.equals("8"))
  }

  "Fibonacci" should "FibonacciOf 50 with fibonacciV2"in {
    assert(Fibonacci.fibonacciV2(50).toString.equals("12586269025"))
  }

  "Fibonacci" should "FibonacciOf 60 with fibonacciV2"in {
    assert(Fibonacci.fibonacciV2(60).toString.equals("1548008755920"))
  }

  "Fibonacci" should "FibonacciOf 70 with "in {
    assert(Fibonacci.fib(70).toString.equals("190392490709135"))
  }

}
