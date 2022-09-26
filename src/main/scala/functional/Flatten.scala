package functional

object Flatten extends App {

  val movieList: List[String] = List("Avengers infinity", "Avengers end game", "Captain America the winter solder", "Spiderman in amazing world")
  println(movieList.flatten)
  private val listSplit: List[String] = movieList.flatMap(line => line.split(" "))
  println(listSplit)
  println(listSplit.flatten)
  println(List(List(1,2,3),List("one","two","three"),List(true, false)).flatten)
}
