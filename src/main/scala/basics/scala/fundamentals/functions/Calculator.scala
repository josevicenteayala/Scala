package basics.scala.fundamentals.functions

class Calculator {

  val factor = 10;

  def sum (number1: Int, number2: Int): Int={
    var sum = number1 + number2
    return sum
  }

  def multiplierWitFactor(number: Int): Int={
    //Create a function to multiply a number by a factor
    val multiplier = (i:Int) => i * factor
    return multiplier.apply(number)
  }

  def divide(dividend:Int, divisor:Int): Either[DivisionError, Int] ={
    if(divisor == 0) Left(new DivisionError("/ by zero is and error"))
    Right(dividend / divisor)
  }

}
