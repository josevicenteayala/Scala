package basics.scala.codewars.comparearrays

/**
 * https://www.codewars.com/kata/550498447451fbbd7600041c/train/scala
 *
 * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 * Examples
 * Valid arrays
 * a = [121, 144, 19, 161, 19, 144, 19, 11]
 * b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
 */
object CompareArrays extends App {
  /**
   * Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
   * @param seq1
   * @param seq2
   * @return compareSameArrays(a, b) returns true because in b 121 is the square of 11, 14641 is the square of 121, 20736 the square of 144, 361 the square of 19, 25921 the square of 161, and so on. It gets obvious if we write b's elements in terms of squares:
   */
  def compareSameArrays(seq1: Seq[Int], seq2: Seq[Int]):Boolean ={
    println(seq1)
    println(seq2)
    (seq1, seq2) match {
      case (sequence1, sequence2) => {
        println(s"seq1-----------------> $seq1")
        true
      }
      case _ => false
    }
  }

}
