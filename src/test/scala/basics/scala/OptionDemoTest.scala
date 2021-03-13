package basics.scala

import org.scalactic.TripleEquals
import org.scalatest.FunSuite

class OptionDemoTest extends FunSuite{
  val capitals = Map("Colombia"->"Bogotá", "Perú"->"Lima")

  test("OptionDemo.show"){
    assert(TripleEquals.convertToEqualizer(OptionDemo.show(capitals.get("Colombia"))) === "Bogotá" );
  }

  test("OptionDemo.getValueFromOptionObject"){
    val value: Option[String] = capitals.get("Colombia")
    val option = Option(value)
    assert(TripleEquals.convertToEqualizer(OptionDemo.getValueFromOptionObject(value)) === "Bogotá");
  }

  test("Option.get"){
    val option: Option[String] = Option("some text")
    val value: String = option.get
    assert(value == "some text")
  }

  test("Option.getOrElse"){
    val option1: Option[Int] = Some(4)
    val optioNone: Option[Nothing] = None
    assert(option1.getOrElse(1) == 4)
    assert(option1.getOrElse(4) == 4)
    assert(optioNone.getOrElse(1) == 1)
  }

  test("Option.isEmpty"){
    val optioNone: Option[Nothing] = None
    assert(optioNone.isEmpty)
  }

  test("Option.productElement"){
    val option: Option[Int] = Some(9)
    assert(option.productElement(0) == 9)
  }

  test("Option.exists"){
    val option: Option[Int] = Some(9)
    assert(option.exists(num => num==9))
  }

  test("Option.filter"){
    val option: Option[Int] = Some(9)
    val maybeInt: Option[Int] = option.filter(num => num == 9)
    println(maybeInt)
    assert(maybeInt.get == 9)
  }

  test("Option.flatMap"){
    val option: Option[Int] = Some(9)
    val maybeInt = option.flatMap(num => Some(10))
    println(maybeInt)
    assert(maybeInt.get == 10)
  }

  test("Option.forEach"){
    val option: Option[Int] = Some(10)
    val unit = option.foreach(num => println(num*10))
    println(unit)
    println(option)
  }

}
