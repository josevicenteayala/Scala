package basics.scala.fundamentals.traits

class ScalaDeveloper extends Develop {
  override def isScalaDevelop(x: Any): Boolean = {
    println(s"x is Scala Developer $x")
    true
  }

  override def isJavaDevelop(x: Any): Boolean = {
    println(s"x is not Java Developer $x")
    false
  }

}
