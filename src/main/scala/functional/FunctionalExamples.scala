package functional

object FunctionalExamples extends App{

  def sumNumberNTimes(f:Int=>Int,n:Int): (Int=> Int) = {
    if(n<=0) (x:Int) => x
    else (x:Int) => sumNumberNTimes(f,n-1)(f(x))
  }

  def plus1:Int=>Int = _ + 1
  def plus10Times1 = sumNumberNTimes(plus1,10)
  println(plus10Times1(1)) //result 11


  //curried functions
  val superAdder: Int => (Int => Int) = (x:Int) => (y:Int) => x+y
  val add3: Int => Int = superAdder(3)
  println(add3(6))// result 9
  println(superAdder(5)(10)) //result 15

  def curriedFormater(c:String)(d:Double):String=c.format(d)
  val standarFormat: (Double => String) = curriedFormater("%4.2f")
  val preciseFormat:(Double => String) = curriedFormater("%10.8f")

  println(standarFormat(Math.PI))
  println(preciseFormat(Math.PI))

}
