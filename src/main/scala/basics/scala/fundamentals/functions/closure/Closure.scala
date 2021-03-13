package basics.scala.fundamentals.functions.closure

/**
 * A closure is a function which uses one or more variables declared outside this function
 */
object Closure {

  def main(args: Array[String]): Unit = {
    val result: Int = add(20)
    println("impure closure "+result)
    println(number)
    println("pure closure "+add2(30))
  }

  //impure closure because number is a var variable
  var number = 10

  //pure closure because number is a val variable
  var number2 = 20

  val add = (x: Int)=> {
    number = x+number
    number
  }

  val add2 = (x:Int)=>{
    x +number2
  }
}
