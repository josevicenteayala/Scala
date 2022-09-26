package basics.scala.fundamentals.companion

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class CompanionClassSpec extends AnyFlatSpec with should.Matchers {

  "CompanionClass" should "gets access to private val" in {
    val companionClass = new CompanionClass
    assert(companionClass.companionClassName.equals("CompanionClass") )
  }

}
