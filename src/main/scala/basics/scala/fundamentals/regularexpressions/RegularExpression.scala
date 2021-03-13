package basics.scala.fundamentals.regularexpressions

import scala.util.matching.Regex

object RegularExpression {
  val string = "This text appear just once"
  val stringNumber = "0123456789"
  val stringAndNumber = "This is a combined chain with 1234567890"

  def main(args: Array[String]): Unit = {
    val pattern: Regex = "once".r
    println("Find once:: "+pattern.findFirstIn(string))

    val pattern2: Regex = new Regex("(O|o)nce")
    val iterator = pattern2 findAllIn (string)
    println("Find (O|o)nce:: "+iterator.mkString(","))

    val pattern3: Regex = "(O|o)nce".r
    println((pattern3 replaceFirstIn(string,"two")))

    val pattern4 : Regex = "[0-9]]".r
    val iterator1 = pattern4 findAllIn (stringNumber)
    println(iterator1.mkString(","))
    println(s"pattern ${pattern4} "+pattern4 matches(stringNumber))
  }

}
