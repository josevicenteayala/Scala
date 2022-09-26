package basics.scala

import org.scalactic.TripleEquals
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class OptionDemoTest extends AnyFlatSpec with should.Matchers {
  val capitals = Map("Colombia"->"Bogotá", "Perú"->"Lima")

  "OptionDemo.show" should "convert to Equalizer" in {
    assert(TripleEquals.convertToEqualizer(OptionDemo.show(capitals.get("Colombia"))) === "Bogotá" );
  }

  "OptionDemo.show" should "get value from digit option object" in{
    val value: Option[String] = capitals.get("Colombia")
    val option = Option(value)
    assert(TripleEquals.convertToEqualizer(OptionDemo.getValueFromOptionObject(value)) === "Bogotá");
  }

  "OptionDemo.show" should "get" in{
    val option: Option[String] = Option("some text")
    val value: String = option.get
    assert(value == "some text")
  }

  "OptionDemo.show" should "get or else" in{
    val option1: Option[Int] = Some(4)
    val optioNone: Option[Nothing] = None
    assert(option1.getOrElse(1) == 4)
    assert(option1.getOrElse(4) == 4)
    assert(optioNone.getOrElse(1) == 1)
  }

  "OptionDemo.show" should "is empty" in{
    val optioNone: Option[Nothing] = None
    assert(optioNone.isEmpty)
  }

  "OptionDemo.show" should "validate if the product 9 exists" in{
    val option: Option[Int] = Some(9)
    assert(option.productElement(0) == 9)
  }

  "OptionDemo.exists" should "validate if the product 9 exists but using a function" in{
    val option: Option[Int] = Some(9)
    assert(option.exists(num => num==9))
  }

  "OptionDemo.filter" should "filter with a function" in{
    val option: Option[Int] = Some(9)
    val maybeInt: Option[Int] = option.filter(num => num == 9)
    println(maybeInt)
    assert(maybeInt.get == 9)
  }

  "OptionDemo.show" should "flat map" in{
    val option: Option[Int] = Some(9)
    val maybeInt = option.flatMap(_ => Some(10))
    println(maybeInt)
    assert(maybeInt.get == 10)
  }

  "OptionDemo.show" should "traverse the option" in{
    val option: Option[Int] = Some(10)
    val unit = option.foreach(num => println(num*10))
    println(unit)
    println(option)
  }

}
