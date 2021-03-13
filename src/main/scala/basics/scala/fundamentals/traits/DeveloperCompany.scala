package basics.scala.fundamentals.traits

object DeveloperCompany {

  def main(args: Array[String]): Unit = {
    println("test")

    val scalaDeveloper: ScalaDeveloper = new ScalaDeveloper
    val javaDeveloper: JavaDeveloper = new JavaDeveloper

    println(scalaDeveloper.knowBothLanguages(javaDeveloper))
    println(scalaDeveloper.knowBothLanguages(scalaDeveloper))
    println(formatResult("Abrolute value", -45, abs))
    println(formatResult("Factorial", 7, factorial))

    println("the array is sorted "+isSorted(Array(2,1),(n1:Int,n2:Int) => n1 <= n2))

    //curry
    val curryResult: Int => Int => Int = curry((x:Int, y:Int) => x*y)
    val intToInt: Int => Int = curryResult(4)
    val result: Int = intToInt(3)
    println("curry "+result)


    //uncurry
    def f(a:Int,b:Int):Int = a+b
    def f2(a:Int):Int=>Int = {(x:Int)=>x*a}

    val f3 = uncurry(f2)
    val valor = f3(2,3)
    println(valor)



  }

  override def equals(o: Any): Boolean = super.equals(o)

  def abs(n:Int):Int={
    if(n.< {
      0
    }) -n
    else n
  }

  def factorial(n: Int): Int = {
    def go(n:Int, acc:Int): Int ={
      println(s" n : $n acc: $acc")
      if(n <= 0) acc
      else go(n-1,acc*n)
    }
    go(n,1)
  }

  def formatResult(name:String, n:Int, f: Int => Int)={
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def isSorted[A] (arrayOfA: Array[A], ordered: (A,A)=> Boolean):Boolean ={
    def loopOverArray(n:Int): Boolean={
      if(n >= arrayOfA.length-1) true
        else ordered(arrayOfA(n),arrayOfA(n+1))
    }
    loopOverArray(0)
  }

  def curry[A,B,C](f:(A,B) => C):A => (B =>C)= (a:A) => ((b:B) => f(a,b))

  def uncurry[A,B,C](f:A=>B=>C):(A,B) => C= (a:A,b:B) => f(a)(b)

  def compose[A,B,C](f:B=>C, g:A=>B): A =>C = (a:A)=>f(g(a))

}
