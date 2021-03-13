package basics.scala.options

import org.scalatest.FunSuite

class OptionReadString extends FunSuite {

  test("Read string in an option an split it") {
    val config = "evaluated_days=expiring_today,expiring_in_a_week,expiring_in_a_month;another_config=new-configuration"
    val optionReadString = Some(config)
    val maybeStrings = optionReadString.map(_.toUpperCase.split(","))
    println(s"maybeStrings $maybeStrings")

    val finalResult = maybeStrings match {
      case Some(Array(rule1,rule2,rule3)) => {
        println(Some(rule1))
        println(Some(rule2))
        println(Some(rule3))
        (Some(rule1), Some(rule2), Some(rule3))
      }
      case Some(Array(rule1,rule2))       => (Some(rule1), Some(rule2))
      case Some(Array(rule1))             => (Some(rule1))
      case _                              => PointsExpiringRule.EXPIRING_IN_A_MONTH
    }
    println(s"finalResult $finalResult")
    println(s"finalResult $finalResult._")
    println(stringToConfigMap(config))
  }

  def stringToConfigMap(config: String): Map[String, String] = {
    val strings = config
      .split(";")

    strings.foreach(println)

    strings
      .map(_.split("=") match {
        case Array(key, value) => (key.trim, value.trim)
        case _                 => ("", "")
      })
      .toMap
  }

}

object PointsExpiringRule {

  object EXPIRING_TODAY {
    val name = "EXPIRING_TODAY"
  }

  object EXPIRING_IN_A_WEEK {
    val name = "EXPIRING_IN_A_WEEK"
  }

  object EXPIRING_IN_A_MONTH {
    val name = "EXPIRING_IN_A_MONTH"
  }

  object UNKNOWN_RULE {
    val name = "UNKNOWN_RULE"
  }

}

