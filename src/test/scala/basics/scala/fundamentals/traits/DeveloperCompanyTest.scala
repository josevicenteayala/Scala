package basics.scala.fundamentals.traits

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class DeveloperCompanyTest extends AnyFlatSpec with should.Matchers{

  "DeveloperCompany.abs" should "calculate absolute value" in {
    println(DeveloperCompany.abs(5))
    val developerCompany: DeveloperCompany.type = DeveloperCompany
    println(developerCompany.abs(-5))

  }

}
