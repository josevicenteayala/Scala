package basics.scala.options

import org.scalatest.FunSuite

class OptionBoolean extends FunSuite{

  private val messageTrue = "The variable is true"
  private val messageFalse = "The value is false"

  test("Boolean in pattern matching") {
    val potentialBoolean = Some(true)

    val response = potentialBoolean match {
      case Some(true) => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageTrue))
  }

  test("Boolean in pattern matching with value false") {
    val potentialBoolean = Some(false)

    val response = potentialBoolean match {
      case Some(true) => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageFalse))
  }

  test("Boolean in pattern matching with value true getting the option content") {
    val potentialBoolean = Some(true)

    val response = potentialBoolean match {
      case Some(content) if content => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageTrue))
  }

  test("Boolean boxing in pattern matching") {
    val potentialBoolean = Some(java.lang.Boolean.TRUE)

    val response = potentialBoolean match {
      case Some(content) if content => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageTrue))
  }

}
