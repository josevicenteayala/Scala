package basics.scala

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}


object CustomerFeatureSpec extends FeatureSpec with GivenWhenThen with Matchers {
  info("As a Customer")
  info("I should have my Full Name composed from first and last names")
  feature("Customer Full Name") {
    scenario("Customer has correct Full Name representation") {
      Given("A Customer with first and last name")
      val customer = Customer("John", "Smith")
      When("full name is queried")
      val fullName = customer.fullName
      Then("first and last names should be returned")
      fullName should be ("John Smith")
    }
  }
}
