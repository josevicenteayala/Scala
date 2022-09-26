package basics.scala.codewars.replacealphabet

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class ReplaceAlphabetSpec extends AnyFlatSpec with should.Matchers {

  "ReplaceAlphabet" should "Replace string 'primera prueba' "in {
    val text = "primera prueba"
    assert(ReplaceAlphabet.alphabetPosition(text).equals("16 18 9 13 5 18 1 16 18 21 5 2 1") )
  }

  "ReplaceAlphabet" should "Replace string 'The sunset sets at twelve o' clock.' "in {
    val text = "The sunset sets at twelve o' clock."
    assert(ReplaceAlphabet.alphabetPosition(text).equals("20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11") )
  }

  "ReplaceAlphabet" should "Replace string 'uvqewpx3ue?i3m?nn' "in {
    val text = "uvqewpx3ue?i3m?nn"
    assert(ReplaceAlphabet.alphabetPosition(text).equals("21 22 17 5 23 16 24 21 5 9 13 14 14") )
  }

  /**
   * List(3, x, n, x, h, y, p, h, z, k, /, i, w, f, 6, ', g, (, w, ?, a, e, f, /, s, c, u, /, n, o)
   * HashMap(e -> 5, n -> 14, t -> 20, a -> 1, m -> 13, i -> 9, v -> 22, p -> 16, r -> 18, w -> 23, k -> 11, s -> 19,
   * x -> 24, j -> 10, y -> 25, u -> 21, f -> 6, q -> 17, b -> 2, g -> 7, l -> 12, c -> 3, h -> 8, o -> 15, z -> 26, d -> 4)
   */
  "ReplaceAlphabet" should "Replace string '3xnxhyphzk/iwf6'g(w?aef/scu/no' "in {
    val text = "3xnxhyphzk/iwf6'g(w?aef/scu/no"
    assert(ReplaceAlphabet.alphabetPosition(text).equals("24 14 24 8 25 16 8 26 11 9 23 6 7 23 1 5 6 19 3 21 14 15") )
  }

  "ReplaceAlphabet" should "Replace string 'primera prueba' V2"in {
    val text = "primera prueba"
    assert(ReplaceAlphabet.alphabetPositionV2(text).equals("16 18 9 13 5 18 1 16 18 21 5 2 1") )
  }

  "ReplaceAlphabet" should "Replace string 'The sunset sets at twelve o' clock.' V2"in {
    val text = "The sunset sets at twelve o' clock."
    assert(ReplaceAlphabet.alphabetPositionV2(text).equals("20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11") )
  }

  "ReplaceAlphabet" should "Replace string 'uvqewpx3ue?i3m?nn' V2"in {
    val text = "uvqewpx3ue?i3m?nn"
    assert(ReplaceAlphabet.alphabetPositionV2(text).equals("21 22 17 5 23 16 24 21 5 9 13 14 14") )
  }

  /**
   * List(3, x, n, x, h, y, p, h, z, k, /, i, w, f, 6, ', g, (, w, ?, a, e, f, /, s, c, u, /, n, o)
   * HashMap(e -> 5, n -> 14, t -> 20, a -> 1, m -> 13, i -> 9, v -> 22, p -> 16, r -> 18, w -> 23, k -> 11, s -> 19,
   * x -> 24, j -> 10, y -> 25, u -> 21, f -> 6, q -> 17, b -> 2, g -> 7, l -> 12, c -> 3, h -> 8, o -> 15, z -> 26, d -> 4)
   */
  "ReplaceAlphabet" should "Replace string '3xnxhyphzk/iwf6'g(w?aef/scu/no' V2"in {
    val text = "3xnxhyphzk/iwf6'g(w?aef/scu/no"
    assert(ReplaceAlphabet.alphabetPositionV2(text).equals("24 14 24 8 25 16 8 26 11 9 23 6 7 23 1 5 6 19 3 21 14 15") )
  }

  "ReplaceAlphabet" should "Replace string 'uvqewpx3ue?i3m?nn' V3"in {
    val text = "uvqewpx3ue?i3m?nn"
    assert(ReplaceAlphabet.alphabetPositionV3(text).equals("21 22 17 5 23 16 24 21 5 9 13 14 14") )
  }
}
