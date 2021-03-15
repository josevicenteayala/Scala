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
    (Some(seq1), Some(seq2)) match {
      case (sequence1, sequence2) if !sequence1.isEmpty && !sequence2.isEmpty
        && seq1.isInstanceOf[Seq[Int]] && seq2.isInstanceOf[Seq[Int]]
        && seq1.length.equals(seq2.length)
        => {
        val seq1Sorted = seq1.sortWith(_.compareTo(_) < 0)
        val seq2Sorted = seq2.sortWith(_.compareTo(_) < 0)
        compare(seq1Sorted,seq2Sorted)
      }
      case _ => false
    }
  }

  private def compare(seq1Sorted: Seq[Int], seq2Sorted: Seq[Int]): Boolean = {
    if(seq1Sorted.isEmpty) {
      return true
    }
    val head: Int = seq1Sorted.head
    if(seq2Sorted.contains(head*head)){
      compare(seq1Sorted.drop(1),seq2Sorted.drop(1))
    } else false
  }

  def compareSameArraysV2(seq1: Seq[Int], seq2: Seq[Int]):Boolean ={
    (seq1, seq2) match {
      case(null, _) => false
      case (_, null) =>false
      case(s1, s2)=> s1.map{x => x * x }.sorted.equals(s2.sorted)
    }
  }

}
