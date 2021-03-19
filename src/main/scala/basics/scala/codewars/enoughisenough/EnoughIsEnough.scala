package basics.scala.codewars.enoughisenough

import scala.::

/**
 * https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/scala
 *
 * Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering.
 * For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2]
 * since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
 */
object EnoughIsEnough extends App {

  def deleteNth(elements: List[Int], maxOccurrences: Int): List[Int] = {
    val finalList = elements.foldLeft(List.empty[Int]) {
      (list, item) =>
        if (list.count(x => x.equals(item)) < maxOccurrences) {
          item :: list
        } else list
    }
    finalList.reverse
  }

  def deleteNthV1(elements: List[Int], maxOccurrences: Int): List[Int] = {
    elements.foldLeft(List.empty[Int]) {
      case (list, item) if (list.count(x => x.equals(item)) < maxOccurrences) => item :: list
      case (list, _) => list
    }.reverse
  }

}
