package basics.scala.fundamentals.functions

object OtherFunctions {

  def main(args: Array[String]): Unit = {
    capitalizeAll("Medellín","Antioquia")
    println(stringTest)
  }

  def capitalizeAll(strings:String*) = {
    val value: Seq[String] = strings.map {
      s => s.capitalize
    }
    println(value)
    println(strings)

    val stringArray: Array[String] = Array("Isa","Caqui","Vin")
  }

  def stringTest: String ={
    val value: () => Nothing = () => {
      return "This is a test"
    }
    //value()
    return "This is another test"
  }

  def getDate(date:String, usePredefined:Boolean): Unit = {

  }

}
