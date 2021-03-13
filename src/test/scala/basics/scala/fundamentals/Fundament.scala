package basics.scala.fundamentals

/*
* This is a singleton Object
*/

object Fundament {

  def main(args: Array[String]): Unit = {
    concaList
  }


  private def concaList = {
    val arrayNumbers: List[Int] = List(1, 2)
    val another = 3 :: arrayNumbers
    println(another)

    val arrayNumbers2 = List(5, 6)
    val bigArray = arrayNumbers ::: arrayNumbers2
    println(bigArray)

    val quickList: List[String] = "One" :: "Two" :: "3" :: Nil
    println(quickList)

  }

  private def readArray = {
    val array = new Array[Int](10)
    for (i <- 0.to(9)) {
      array.update(i, i)
    }
    array.foreach(i => println(i))
  }
}
