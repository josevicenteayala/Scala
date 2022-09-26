package basics.scala.fundamentals.functions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class CalculatorTest extends AnyFlatSpec with should.Matchers{

  "Calculator" should "Calculator.sum" in {
    val calculator = new Calculator
    val sum = calculator.sum(10,20)
    assert(sum == 30)
  }

  "Calculator" should "Calculator.multiplier" in {
    val calculator = new Calculator
    val multiplier: Int = calculator.multiplierWitFactor(2)
    assert(20 == multiplier)
  }

  "Calculator" should "Calculator.divide" in {
    val calculator = new Calculator
    val result: Either[DivisionError, Int] = calculator.divide(4,2)
    println(result.productElement(0))
  }

  "Calculator" should "Calculator.divide by cero" in {
    val calculator = new Calculator
    val result: Either[DivisionError, Int] = calculator.divide(4,0)
    println(result.productElement(0))
  }

  "Calculator" should "Module examples" in {
    assert(0 % 7 == 0)
    assert(4 % 7 == 4)
    assert(6 % 7 == 6)
    assert(7 % 7 == 0)
    assert(8 % 7 == 1)
    assert(10 % 7 == 3)
    assert(13 % 7 == 6)
    assert(14 % 7 == 0)
  }
}
