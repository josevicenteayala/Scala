package basics.scala.fundamentals.exceptions

final case class CustomException(private val message: String = "", private val cause: Throwable = None.orNull) extends Exception(message,cause){



}
