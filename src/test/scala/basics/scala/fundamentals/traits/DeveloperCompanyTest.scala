package basics.scala.fundamentals.traits

import org.scalatest.FunSuite

class DeveloperCompanyTest extends FunSuite{

  test("DeveloperCompany.abs"){
    println(DeveloperCompany.abs(5))
    val developerCompany: DeveloperCompany.type = DeveloperCompany
    println(developerCompany.abs(-5))

  }

}
