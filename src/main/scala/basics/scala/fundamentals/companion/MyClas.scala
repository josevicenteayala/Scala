package basics.scala.fundamentals.companion

case class MyClass(additionalStatement:String) {
  private val description:String = MyClass.description + " This is the description of MyClass "

}

object MyClass {
  private val description:String = " This is the description of MyClass Object "
}