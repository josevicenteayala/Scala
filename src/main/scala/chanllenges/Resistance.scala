package chanllenges

object Resistance {

  def main(args: Array[String]): Unit = {
    val resistors = List(
      TenOhm(10.0,10.0),
      FifteenOhm(15.0,15.0),
      TwentyTwoOhm(20.0,20.0),
      TwentyTwoOhm(13.0,13.0),
      FortySevenOhm(40.0,40.0),
      SixtyEightOhm(60.0,60.0),
      EightyTwoOhm(80.0,80.0)
    )
    println(range(resistors))
  }

  def range(resistors:List[Resistor]):(Double, Double) = {
    resistors.foldLeft((0.0,0.0)){
      (accumulator, resistor) =>
        val (resistanceTotal, toleranceTotal) = accumulator
        val resistanceCalc = resistor.resistance
        val toleranceCalc = resistor.tolerance

        (resistanceTotal + resistanceCalc, toleranceTotal + toleranceCalc)
    }

  }
}

sealed trait Resistor{
  def resistance: Double
  def tolerance: Double
}

case class TenOhm(resistance: Double, tolerance:Double) extends Resistor
case class FifteenOhm(resistance: Double, tolerance:Double) extends Resistor
case class TwentyTwoOhm(resistance: Double, tolerance:Double) extends Resistor
case class ThirtyThreeOhm(resistance: Double, tolerance:Double) extends Resistor
case class FortySevenOhm(resistance: Double, tolerance:Double) extends Resistor
case class SixtyEightOhm(resistance: Double, tolerance:Double) extends Resistor
case class EightyTwoOhm(resistance: Double, tolerance:Double) extends Resistor
