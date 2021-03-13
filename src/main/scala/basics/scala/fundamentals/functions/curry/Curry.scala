package basics.scala.fundamentals.functions.curry

/**
 *Currying is the technique of transforming a function that takes multiple arguments into a function that takes a single argument
 */
object Curry {

  def main(args: Array[String]): Unit = {
    val sumNumber: Int=>Int = addCurrying(10)
    val sumResult = sumNumber(20)
    println(s"result of sum = $sumResult")

    val multCurrying2: Int => Int => Int = multCurrying(2)
    val multCurrying3: Int => Int = multCurrying2(4)
    val result: Int = multCurrying3(5)
    println(s" result=> $result")

    val curry1: Int => Int => Int = curry((x:Int, y:Int)=>x*y)
    val curry2: Int => Int = curry1(4)
    val curryResult: Int = curry2(20)
    println(curryResult)

    val curryString: String => String => String = curry((s1:String, s2:String)=> s1.replace(' ','@').concat(s1))
    val curryString2: String => String = curryString("This is a funny string ")
    val curryString3: String = curryString2(" the scala course is so good ")
    println(s"curryString3 $curryString3")

    val customCurry1: Int => (Int, Int) => Int = customCurry((x:Int, y:Int, z:Int)=>x+y+z)
    val customCurry2: (Int, Int) => Int = customCurry1(10)
    val customCurry3: Int = customCurry2(20,30)
    println(customCurry3)
  }

  /*
    function that take two arguments to sum two numbers
  * */
  def add(x:Int,y:Int)= x+y

  /*
  This function takes an Int and return another function that takes another Int
   */
  def addCurrying(x:Int): Int => Int = (y:Int) => x + y

  /*
  This function takes an Int and return another function that multiple three numbers
   */
  def multCurrying(x:Int): Int => Int => Int = (y:Int)=>((z:Int)=>x*y*z)


  def curry[A,B,C](f:(A,B) => C):A => (B =>C)= (a:A) => ((b:B) => f(a,b))

  def customCurry[A,B,C,D](func:(A,B,C)=>D): A => (B, C) => D = (a:A) => ((b:B, c:C)=>func(a,b,c))
}
