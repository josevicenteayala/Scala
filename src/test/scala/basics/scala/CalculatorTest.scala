package basics.scala

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite{
  test("Calculator.cube"){
    assert(Calculator.cube(2) === 8)
  }

  test("Calculator.cube, by cero"){
    assert(Calculator.cube(0) === 0)
  }
}
