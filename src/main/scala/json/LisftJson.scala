package json

import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.Serialization.write
import net.liftweb.http.rest.RestHelper
import net.liftweb.http.LiftRules
import net.liftweb.json.JsonAST._
import net.liftweb.json.JsonDSL._

case class Person(name: String, address: Address)
case class Address(city: String, state: String)

object LisftJson extends App {
  val p = Person("Alvin Alexander", Address("Talkeetna", "AK"))
  // create a JSON string from the Person, then print it
  implicit val formats = DefaultFormats
  val jsonString = write(p)
  println(jsonString)
}
