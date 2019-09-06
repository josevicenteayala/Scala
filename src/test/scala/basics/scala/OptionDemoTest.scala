package basics.scala

import org.scalactic.TripleEquals
import org.scalatest.FunSuite

class OptionDemoTest extends FunSuite{

  test("OptionDemo.show"){
    val capitals = Map("Colombia"->"Bogotá", "Perú"->"Lima")
    assert(TripleEquals.convertToEqualizer(OptionDemo.show(capitals.get("Colombia"))) === "Bogotá" );
  }

}
