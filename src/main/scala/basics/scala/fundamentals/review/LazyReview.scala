package basics.scala.fundamentals.review


class Strict{
  val e = {
    println("strict")
    9
  }
}

class LazyVal{
  lazy val l = {
    println("lazy")
    9
  }
}

object LazyReview {

  def main(args: Array[String]): Unit = {
    val strict:Strict = new Strict
    //doesn't print any value
    val lazyEval: LazyVal = new LazyVal

    val add = (a:Int,b:Int) =>{
      println("Add")
      a + b
    }

    method1(add(5,6))
    method2(add(5,6))
  }

  //method call by value parameter
  def method1(n:Int): Unit ={
    println(s"Method1::n $n")
  }

  //method call by name parameter
  def method2(n: => Int): Unit ={
    println(s"Method2::n $n")
  }
}
