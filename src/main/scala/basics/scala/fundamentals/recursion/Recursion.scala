package basics.scala.fundamentals.recursion

object Recursion {

  def main(args: Array[String]): Unit = {
   // println(fibonacci(6))
    println(fibonacciTailRec(8))
  }

  def fibonacci(n:Int):Int = {
    println(s"fibonacci with $n")
    if(n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }

  def fibonacciTailRec(number:Int): Int ={

    def fiboTailRec(valueToCompute: Int, lastAcumulator: Int, secondLastAcumulator: Int): Int = {
      println(s"fiboTailRec valueToCompute $valueToCompute, lastAcumulator $lastAcumulator, secondLastAcumulator $secondLastAcumulator")
      if(valueToCompute >= number) {
        println(s"fiboTailRec final:: valueToCompute $valueToCompute >= number $number return $lastAcumulator")
        lastAcumulator
      }else {
        fiboTailRec(valueToCompute +1, lastAcumulator + secondLastAcumulator, lastAcumulator)
      }
    }
    if(number<=2) 1
    else fiboTailRec(2,1,1)
  }

}
