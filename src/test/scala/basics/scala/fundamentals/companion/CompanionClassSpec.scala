package basics.scala.fundamentals.companion

import org.scalatest.FunSuite

class CompanionClassSpec extends FunSuite {

  test("CompanionClass can access to private val") {
    val companionClass = new CompanionClass
    assert(companionClass.companionClassName.equals("CompanionClass") )
  }

}
