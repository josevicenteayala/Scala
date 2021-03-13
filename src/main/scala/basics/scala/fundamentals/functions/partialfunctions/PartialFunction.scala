package basics.scala.fundamentals.functions.partialfunctions

import java.util.Date

object PartialFunction {

  def main(args: Array[String]): Unit = {
    val sum2 = sum(5,2,_: Int)
    println(sum2(10))

    val date = new Date()
    val newLog = log(date,_:String)
    newLog("Message 1")
    newLog("Message 2")
    newLog("Message 3")
    newLog("Message 4")

    val divide2: PartialFunction[Int, Int] = {
      case d: Int if d != 0 => 42 / d
    }
    val divisionResult: Int = divide2(4)
    println(s"divisionResult $divisionResult")
  }

  def sum (z:Int,x:Int, y: Int):Int = {
    z + x + y
  }

  def sum2 = sum(1,2,_)

  def log(date: Date, message:String) = {
    println(date+"  "+message)
  }
}
