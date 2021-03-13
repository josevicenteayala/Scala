package basics.scala.fundamentals.functions.collections

import java.time.LocalDate

object CollectionsWithFunctions {

  def main(args: Array[String]): Unit = {
    //testGetEvens
    //functionsCreatedFromMethods
    //testFunctionAsParameter
    //testFunctionsReturnFunctions


  }

  private def testFunctionsReturnFunctions = {
    val hello: String => () => String = greeting("english")
    val hola: String => () => String = greeting(("spanish"))
    val strEnglish: () => String = hello("Vicente")
    println(strEnglish())
    println(hola("Vincent")())
  }

  def greeting(language:String): String => () => String = (name:String) => {
    language match {
      case "english" => {
        () => s"Hello $name"
      }
      case "spanish" => {
        () => s"Como me le va $name"
      }
    }
  }

  private def testFunctionAsParameter() = {
    val date = getNextExpirationDateMethod(getNextExpirationDate, LocalDate.now(), 5)
    println(s"Date result $date")

    exec(processedTwoInts,4,5)
    processedTwoStrings("String 1","String 2")
  }

  def getNextExpirationDateMethod(f:(LocalDate, Int)=>LocalDate, d:LocalDate, i:Int):LocalDate = f(d,i)
  def getNextExpirationDate(date:LocalDate, numberOfMonths:Int):LocalDate = date.withMonth(numberOfMonths)

  /**
   * This is a generic method that receives a function as parameter and two other values
   */
  def exec(f:(Any, Any) => Any, a:Any,b:Any): Any = f(a,b)

  //This is a function that receive two ints a return nothing
  val processedTwoInts: (Any, Any) => Unit = (x:Any, y:Any) => println(s" $x $y")

  //This is a function that receive two Strings a return nothing
  def processedTwoStrings: (String, String) => Unit = (x:String, y:String) => println(s" $x $y")

  /**
   * This is an example about how to create functions using methods already defined
   */
  private def functionsCreatedFromMethods = {
    val customCos: Double => Double = scala.math.cos _
    println(cos(4))
    println(customCos(4))

    val functionToUpperCase: String => String = upperString _

    val strInUpperCase = functionToUpperCase("this is a string")
    println(s"strInUpperCase $strInUpperCase")
  }

  def cos(x: Double): Double = java.lang.Math.cos(x)

  def upperString(str:String):String = str.toUpperCase

  /**
   * This method allow it to test a method that receives a function as parameter
   */
  private def testGetEvens = {
    val intToBoolean: Int => Boolean = (i: Int) => i % 2 == 0
    val intList = List.range(1, 10)
    val evens = getEvens(intList, intToBoolean)
    println(s"evens $evens")
  }

  private def getEvens(intList: List[Int], function: Int => Boolean):List[Int] = {
    intList.filter(function)
  }
}
