package basics.scala.fundamentals.functions.higherorderfunctions

object HigherOrderFunction {

  def main(args: Array[String]): Unit = {
    val sum: Int = math(2,3, (x, y)=>x+y)
    println(sum)

    val sum2:Int = math3Args(2,2,3,(x,y)=>x+y)
    println(sum2)

    val sum3:Int = math3Args(4,2,3,_+_)
    println(sum3)
  }

  def math(x:Int,y:Int, func:(Int,Int)=>Int):Int = func(x,y)

  def math3Args(x:Int,y:Int,z:Int, func:(Int,Int)=>Int):Int = func(func(x,y),z)
}
