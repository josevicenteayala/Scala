package basics.scala.fundamentals.pattern

object PatternReview {

  def main(args: Array[String]): Unit = {
    matchNumber(1)
    matchNumber(2)
    matchNumber(3)
    matchNumber("Test")
  }

  def matchNumber(number: Any): String = number match{
    case 1 => {
      println("One")
      "One"
    }
    case 2 => {
      println("Two")
      "Two"
    }
    case i:Int =>{
      println("scala.Int")
      "scala.Int"
    }
    case _ => {
      println("Many")
      "Many"
    }
  }

}
