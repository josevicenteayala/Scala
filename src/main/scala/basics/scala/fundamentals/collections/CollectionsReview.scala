package basics.scala.fundamentals.collections

object CollectionsReview extends App {
  case class User(name:String, age:Int)

  val userList = List(User("Vincent", 45), User("Caqui",47), User("Isa",12))

  /**
   * Sor a collection
   */
  println(userList.sortBy(_.age)) //should print List(User(Isa,12), User(Vincent,45), User(Caqui,47))

  /**
   * groupBy a collection
   */

  println(userList.groupBy(_.age > 20)) //HashMap(false -> List(User(Isa,12)), true -> List(User(Vincent,45), User(Caqui,47)))

  /**
   * fold method
   */

  println(s" divide each number by itself using fold method ${List(1,2,3).fold(1)(_ * _)}")

  /**
   * reduce method
   */

  println(s" divide each number by itself through reduce method ${List(1,2,3).reduce(_ * _)}")
}
