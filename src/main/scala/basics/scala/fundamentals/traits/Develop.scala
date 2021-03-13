package basics.scala.fundamentals.traits

/*
If the behavior will not be reused, then make it a concrete class. It is not reusable behavior after all.

If it might be reused in multiple, unrelated classes, make it a trait. Only traits can be mixed into different parts of the class hierarchy.

If you want to inherit from it in Java code, use an abstract class.

If you plan to distribute it in compiled form, and you expect outside groups to write classes inheriting from it, you might lean towards using an abstract class.

If efficiency is very important, lean towards using a class.
 */
trait Develop {

  def isScalaDevelop(x: Any): Boolean
  def isJavaDevelop(x: Any): Boolean
  def knowBothLanguages(x: Any): Boolean = isScalaDevelop(x) && isJavaDevelop(x)
}

object Develop {
}
