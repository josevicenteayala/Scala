package basics.scala.fundamentals.dates

import java.time.LocalDate

object Dates {
  def main(args: Array[String]): Unit = {
    /*LocalDate*/

    val localDate = LocalDate.now()

    val localDateResult = localDate.withMonth(1).plusMonths(1)
    println("LocalDate localDateResult "+localDateResult)
    val arrayStrings: Array[String] = "points-expiring-month=0,points-expiring-day=2,another-chain=3".split(",").map(_.trim).filter(_.contains("points-expiring"))

    val pointsExpiringMonth = arrayStrings.filter(_.contains("points-expiring-month")).flatMap(_.split("=")) match {
      case Array(pointsExpiringMonth, month) => {
        println(s"$pointsExpiringMonth is $month")
        month
      }
      case _ => "1-default-points-expiring-month"
    }

    val pointsExpiringDay = arrayStrings.filter(_.contains("points-expiring-day")).flatMap(_.split("=")) match {
      case Array(pointsExpiringDay, day) => {
        println(s"$pointsExpiringDay is $day")
        day
      }
      case _ => "1-default-points-expiring-day"
    }

    println(s"pointsExpiringMonth $pointsExpiringMonth")
    println(s"pointsExpiringDay $pointsExpiringDay")
  }
}
