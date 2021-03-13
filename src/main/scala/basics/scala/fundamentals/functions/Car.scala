package basics.scala.fundamentals.functions

class Car {

  def carColor(identifier: Int): String ={
    if(identifier>0) "Green" else "Red"
  }

  def carArray(): Unit ={
    val carArrayInt = new Array[Int](2)
    val carArrayString = new Array[String](2)

    carArrayInt.update(0,2)
    carArrayInt.update(1,3)
    carArrayString.update(0,"Nissan")
    carArrayString.update(1,"Mazda")
  }

}
