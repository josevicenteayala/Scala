package basics.scala.fundamentals.arrays

object FlatMapReview {
  def main(args: Array[String]): Unit = {
    flatMapExample1
  }

  def flatMapExample1: List[Int] = {
    val numbers = List(1, 2, 3)

    def f(x: Int): List[Int] = List(x - 1, x, x + 1)

    val result = numbers.flatMap(x => f(x))
    println(s"result $result")
    result
  }
}
