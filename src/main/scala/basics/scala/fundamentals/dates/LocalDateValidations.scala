package basics.scala.fundamentals.dates

import java.time.{LocalDate, Month}

object LocalDateValidations {

  private val FIRST_DAY_OF_MONTH = 1

  def main(args: Array[String]): Unit = {
    exploreLocalDate()
  }

  var program = Program(id="JAPON")

  def exploreLocalDate(): Unit = {
    val localDate = LocalDate.now()
    println(localDate)
    val month: Month = localDate.getMonth
    println(s"month $month")

    val newDate = localDate.withDayOfMonth(1).plusMonths(1)

    println(s"The new date is $newDate")

    val dayOfMonth: Int = localDate.getDayOfMonth

    println(s"dayOfMonth $dayOfMonth")
    println(s"dayOfMonth newDate ${newDate.getDayOfMonth}")

    (localDate.getDayOfMonth, program.id) match {
      case (FIRST_DAY_OF_MONTH, "JAPON") => println("Lets send two messages")
      case _ => println("Lets send just one message")
    }

  }


  case object Program {
    def apply(id:String): Program = new Program(id)

    case class Program(id: String)

  }

}
