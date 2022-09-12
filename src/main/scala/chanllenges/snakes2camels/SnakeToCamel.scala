package chanllenges.snakes2camels

import scala.util.matching.Regex

object SnakeToCamel {

  def main(args: Array[String]): Unit = {
    println(snakeToCamel("this_is_an_string"))
    println(snakeToCamelEnhance("this_is_an_string"))
  }

  def snakeToCamel(string: String): String = string.split("_").foldLeft(""){
    (camel, word) => camel + word.charAt(0).toUpper + word.substring(1)
  }

  def snakeToCamelEnhance(string: String): String = {
    val regex: Regex = "_(.)".r
    regex.replaceAllIn(string, matched => {
      matched.group(1).toUpperCase
    })
  }

}
