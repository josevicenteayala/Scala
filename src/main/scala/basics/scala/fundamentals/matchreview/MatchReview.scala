package basics.scala.fundamentals.matchreview

object MatchReview {

  def main(args: Array[String]): Unit = {
    val age = "10"
    val ageResult = age match {
      case "10" => age
      case "3" => age * 2
      case _ => "None of above"
    }

    println("age "+age+" ageResult "+ageResult)

    val number =4

    number match {
      case 1|3|5|7|9 => println(s"$number is an odd")
      case 2|4|6|8|0 => println(s"$number is an even")
    }
  }
}
