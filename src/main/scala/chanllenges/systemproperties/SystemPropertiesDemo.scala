package chanllenges.systemproperties

import scala.sys.SystemProperties

object SystemPropertiesDemo {

  def main(args: Array[String]): Unit = {
    getPrintProperties()
  }

  def getPrintProperties(): Unit = {
    val systemProperties = new SystemProperties()
    systemProperties.names.foreach(n => println(s"The property name is $n and the value is ${systemProperties.get(n).getOrElse("--")}"))
  }

}
