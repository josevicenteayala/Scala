package basics.scala.fundamentals.traits

class JavaDeveloper extends Develop {
  override def isScalaDevelop(x: Any): Boolean = {
    println(s"x is not Scala Developer $x")
    false
  }

  override def isJavaDevelop(x: Any): Boolean = {
    println(s"x is a Java Developer $x")
    true
  }
}
