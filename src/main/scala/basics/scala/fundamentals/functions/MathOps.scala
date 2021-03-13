package basics.scala.fundamentals.functions

object MathOps {

  def main(args: Array[String]): Unit = {
    val addTwonumbers: Int => Int = adder(4,_):Int
    //println(addTwonumbers(5))

    val curriedAdd: Int => Int => Int = (adder _).curried

    val addTwo: Int => Int = curriedAdd(2)
    println(addTwo(6))

    //add with default parameters
    println("add without parameters: "+add())
    println("add with paramters: "+add(40, 60))

    println("NARCISSISTIC*************************")
    println(s"153 is narcissistic? ${narcissistic(153)}")
    println(s"1652 is narcissistic? ${narcissistic(1652)}")
  }

  def multiply(m:Int)(n:Int):Int = m *n

  def adder(m:Int,n:Int): Int ={
    println("m is "+m+" n is "+n)
    m + n
  }

  def add(x:Int = 10, y:Int =20): Int = x + y

  def narcissistic(n: Int): Boolean = {

    val array: Array[String] = n.toString.split("")
    val base = array.length
    array.map(_.toInt).map(Math.pow(_,base)).sum.toInt.equals(n)
  }

}
