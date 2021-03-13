package basics.scala.fundamentals.arrays

/**
 * List can only have a data type
 * List are immutable
 */
object ListSomeReview {
  def main(args: Array[String]): Unit = {
    val list:List[String] = List("One","Two")
    println(list)

    val list2 = "One1" :: ("Two2" :: Nil)
    println(list2)

    //repeat the text "text" three times
    val list3 = List.fill(3)("text")
    println(list3)

    val squares = List.tabulate(3)(number => number * number)
    println("squares: "+ squares)
    val sq = squares.apply(2)
    println("sq "+sq)

    val multiplication = List.tabulate(3,3)(_ * _)
    println("multiplication: "+multiplication)
    val mul = multiplication.apply(2)
    println("mul "+mul)

    val list4: List[Int] = (1 to 20).toList
    println(list4)
  }
}
