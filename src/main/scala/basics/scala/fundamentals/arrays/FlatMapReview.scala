package basics.scala.fundamentals.arrays

object FlatMapReview {
  def main(args: Array[String]): Unit = {
    convertAListIntoConsecutiveNumbersList(List(1, 2, 3))
  }

  def f(x: Int): List[Int] = List(x - 1, x, x + 1)

  def convertAListIntoConsecutiveNumbersList(numbers:List[Int]): List[Int] = numbers.flatMap(x => f(x))

  def convertSomeListIntoConsecutiveNumbers(lists:List[List[Int]]) = lists.flatMap(list=>list.map(number =>f(number)))

  def convertSomeListIntoConsecutiveNumbersUsingFlatMap(lists:List[List[Int]]) = lists.flatMap(list=>list.flatMap(number =>f(number)))
}
