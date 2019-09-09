package basics.scala

/*
Objtet to show how Option funcionality works
 */
object OptionDemo {

  /*
  function to test the class
   */
  def main(args: Array[String]): Unit ={
    val capitlas = Map("Colombia"->"Bogotá", "Perú"->"Lima")
    println("Capital de Colombia: "+show(capitlas.get("Colombia")))
    println("Capital de Perú: "+show(capitlas.get("Perú")))
    println("Capital de Chile: "+show(capitlas.get("Chile")))
  }

  /*
    function to show the value in an option object
   */
  def show(value: Option[String])= value match{
    case Some(city)=>city
    case None => "?"
  }

  def getValueFromOptionObject(value: String): String{
    val response: Option[String] = Some(value)
  }

}
