package basics.scala.options

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class OptionBoolean extends AnyFlatSpec with should.Matchers{

  private val messageTrue = "The variable is true"
  private val messageFalse = "The value is false"

  "OptionBoolean" should "Boolean in pattern matching" in {
    val potentialBoolean = Some(true)

    val response = potentialBoolean match {
      case Some(true) => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageTrue))
  }

  "OptionBoolean" should "Boolean in pattern matching with value false" in {
    val potentialBoolean = Some(false)

    val response = potentialBoolean match {
      case Some(true) => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageFalse))
  }

  "OptionBoolean" should "Boolean in pattern matching with value true getting the option content" in {
    val potentialBoolean = Some(true)

    val response = potentialBoolean match {
      case Some(content) if content => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageTrue))
  }

  "OptionBoolean" should "Boolean boxing in pattern matching" in {
    val potentialBoolean = Some(java.lang.Boolean.TRUE)

    val response = potentialBoolean match {
      case Some(content) if content => messageTrue
      case _ => messageFalse
    }
    assert(response.equals(messageTrue))
  }

}
