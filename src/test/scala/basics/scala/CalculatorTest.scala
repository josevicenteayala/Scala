package basics.scala

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CalculatorTest extends AnyFlatSpec with should.Matchers {
  "Calculator.cube" should "calculate the cube" in {
    assert(Calculator.cube(2) === 8)
  }

  "Calculator.cube" should "calculate the cube by zero" in {
    assert(Calculator.cube(0) === 0)
  }
}
