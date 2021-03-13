package basics.scala.codewars.narcissistic

import org.scalatest.FunSuite

import java.time.{Clock, Instant}

class NarcissisticTest extends FunSuite{

  val numberToTest153 = 153
  val numberToTest1652 = 1652

  test("narcissisticV1") {
    assert(Narcissistic.narcissisticV1(numberToTest153))
    assert(!Narcissistic.narcissisticV1(numberToTest1652))

    val clock = Clock.systemUTC()
    val instant1 = Instant.now(clock)

    Thread.sleep(1)

    val clock2 = Clock.systemUTC()
    val instant2 = Instant.now(clock2)

    println(s" instant1 $instant1")
    println(s" instant2 $instant2")

    val map = Map("removeDate"->"empty")
    val date = map.get("removeDate") match {
      case Some(date) => Instant.parse(date)
      case _ => None
    }
    println(date)


  }

  test("narcissisticV2") {
    assert(Narcissistic.narcissisticV2(numberToTest153))
    assert(!Narcissistic.narcissisticV2(numberToTest1652))
  }

  test("narcissisticV3") {
    assert(Narcissistic.narcissisticV3(numberToTest153))
    assert(!Narcissistic.narcissisticV3(numberToTest1652))
  }

  test("narcissisticV4") {
    assert(Narcissistic.narcissisticV4(numberToTest153))
    assert(!Narcissistic.narcissisticV4(numberToTest1652))
  }
}
