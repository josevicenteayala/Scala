package basics.scala

case class Customer(firstName: String, lastName: String) {

  def fullName = firstName + " " + lastName
}
