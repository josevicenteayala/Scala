package com.lightbend.training.scalatraining.functions

object Function {

  def executeFunction(f:(Int, Int) => Boolean, x:Int,y:Int): Boolean = f(x, y)

  val greaterThan = (x: Int, y: Int) => x >= y

  val lessThan = (x: Int, y: Int) => x <= y

  def executeGenericFunction[A,B](genericFunction:A => B, a:A): B = genericFunction(a)

  val sumTen = (x:Int) => x +10

  val sayHelloTo = (s:String) => s"Hello $s"
}
