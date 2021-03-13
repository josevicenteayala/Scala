package basics.scala.fundamentals.arrays

/**
 * The elements must be unique
 * by default a set is immutable
 * no order is present in set
 */
object SetRiview {

  def main(args: Array[String]): Unit = {
    var set: Set[Nothing] = Set()
    var set2: Set[Int] = Set()
    var set3: Set[Int] = Set(0,1,2,3,4)

    var set4 = Set(1,2,3,4,4,5,6)
    println(set4)

    var set5 = set ++ set2

    //intersection between two sets
    println("intersection " +(set3 & set4))
    println("intersection2 " +(set3 intersect set4))
  }

}
