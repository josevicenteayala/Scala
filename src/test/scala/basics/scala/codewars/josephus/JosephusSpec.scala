package basics.scala.codewars.josephus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class JosephusSpec extends AnyFlatSpec with should.Matchers {

  "Josephus" should "Survive in list 7 with kill by 3 should be 4" in {
    assert(Josephus.josephusSurvivor(7,3) == 4)
  }
}
