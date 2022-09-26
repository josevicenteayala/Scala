package basics.scala.fundamentals.valvar

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ValVarTest extends AnyFlatSpec with should.Matchers{

  "ValVar" should "ValVar.variableMessage" in {
    /*finalMessage can't be modified*/
    println(ValVar.finalMessage)
    println(ValVar.variableMessage)
    ValVar.variableMessage = "The variable message has changed"
    println(ValVar.variableMessage)
  }

}
