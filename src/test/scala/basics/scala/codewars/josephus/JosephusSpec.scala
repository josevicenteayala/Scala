package basics.scala.codewars.josephus

import org.scalatest.FunSuite

class JosephusSpec extends FunSuite {

  test("Survive in list 7 with kill by 3 should be 4") {
    assert(Josephus.josephusSurvivor(7,3) == 4)
  }
}
