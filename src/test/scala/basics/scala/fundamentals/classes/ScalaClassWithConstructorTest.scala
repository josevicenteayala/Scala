package basics.scala.fundamentals.classes

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ScalaClassWithConstructorTest extends AnyFlatSpec with should.Matchers{

  "ScalaClassWithConstructor" should "create objects" in {
    val scalaClassWithConstructor = new ScalaClassWithConstructor(value = 10,name = "Vincent")
    println(scalaClassWithConstructor)
    scalaClassWithConstructor.someMethod(12,"Vin")
    println("----")
    scalaClassWithConstructor.someFinalMethod(13,"Caqui")
    println("----")
    scalaClassWithConstructor._$12someMethod(14,"Isa")
    println("----")
    scalaClassWithConstructor.someMethod$(15,"Mary")
    println("----")
    scalaClassWithConstructor.someMethod1(16,"Jose")
    println("----")
    scalaClassWithConstructor.someMethod_(17,"Sandra")
  }

}
