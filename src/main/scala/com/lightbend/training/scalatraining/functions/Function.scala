package com.lightbend.training.scalatraining.functions

object Function {

  /**
   * concrete function
   * @param f
   * @param x
   * @param y
   * @return
   */
  def executeFunction(f:(Int, Int) => Boolean, x:Int,y:Int): Boolean = f(x, y)

  val greaterThan = (x: Int, y: Int) => x >= y

  val lessThan = (x: Int, y: Int) => x <= y

  /**
   * Generic function
   * @param genericFunction
   * @param a
   * @tparam A
   * @tparam B
   * @return
   */
  def executeGenericFunction[A,B](genericFunction:A => B, a:A): B = genericFunction(a)

  val sumTen = (x:Int) => x +10

  val sayHelloTo = (s:String) => s"Hello $s"


  /**
   * Function that returns a function
   */

  def sayHi(greeting:String): String => String = (string:String) => s"$greeting $string"

  val sayHelloToSomeone: String => String = sayHi("Hello")

  /**
   * Factory of functions
   * @param language
   * @return
   */
  def factoryGreetings(language:String): String => String => String = (name:String) => {
    language match {
      case "english" => sayHi(s"Hello $name")
      case "spanish" => sayHi(s"Hola $name")
      case "french" => sayHi(s"Salut $name")
    }
  }

  /**
   * Using a functions in a composition
   * @param language
   * @param name
   * @param lastName
   * @return
   */
  def greetingSomeone(language:String, name:String, lastName :String): String = {
    val functionToGreeting: String => String => String = factoryGreetings(language)
    val greetingSomeone: String => String = functionToGreeting(name)
    greetingSomeone(lastName)
  }

}
