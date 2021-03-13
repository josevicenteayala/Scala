package basics.scala.fundamentals.valvar

import org.scalatest.FunSuite

class ValVarTest extends FunSuite{

  test("ValVar.variableMessage"){
    /*finalMessage can't be modified*/
    println(ValVar.finalMessage)
    println(ValVar.variableMessage)
    ValVar.variableMessage = "The variable message has changed"
    println(ValVar.variableMessage)
  }

}
