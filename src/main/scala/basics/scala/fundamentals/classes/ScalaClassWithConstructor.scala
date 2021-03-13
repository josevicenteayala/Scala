package basics.scala.fundamentals.classes

class ScalaClassWithConstructor (value:Int, name: String){

  def someMethod(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  private def somePrivateMethod(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  final def someFinalMethod(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  private final def somePrivateFinalMethod(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  protected def someProtectedMethod(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  def someMethod1(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  def someMethod_(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  def someMethod$(identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }

  def _$12someMethod (identifier: Int, name: String): Unit ={
    println(identifier)
    println(name)
  }
}
