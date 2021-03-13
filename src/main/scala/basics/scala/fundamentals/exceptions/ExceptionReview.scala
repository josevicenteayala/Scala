package basics.scala.fundamentals.exceptions

object ExceptionReview {
  def main(args: Array[String]): Unit = {
    try{
      println("begin the method")
      val exception = CustomException("Some error", new Throwable)
      throw exception
    }catch{
      case cex:CustomException=>{
        println(cex.printStackTrace())
      }
      case ex:Exception =>{
        println(ex.getStackTrace)
      }
    }
  }
}
