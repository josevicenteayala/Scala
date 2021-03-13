package basics.scala.options

object OptionReview {

  val list = List(1,2,3,4)
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "Jhon")

  def main(args: Array[String]): Unit = {
    //Print None, because hope anything greater than 5
    println(list.find(_ > 5))
    //Print 2 that is the next number grater than 1
    println(list.find(_ > 1))

    //key exist
    println(map.get(2).get)

    try{
      //key doesn't exist and throw exception
      println(map.get(5).get)
    }catch {
      case ex:Exception => ex.printStackTrace()
    }

    //key doesn't exist and control exception
    println(map.get(5).getOrElse("No name found"))

    val opt: Option[Int] = Some(5)
    val opt2: Option[Int] = None

    println(opt)
    println(opt2)
  }
}
