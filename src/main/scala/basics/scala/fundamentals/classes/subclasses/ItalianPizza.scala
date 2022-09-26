package basics.scala.fundamentals.classes.subclasses

class ItalianPizzaWithoutConstructor extends Pizza("Italian") {

}

class ItalianPizzaWithConstructor(name:String) extends Pizza(name) {

}

class ItalianPizzaWithAdditionalConstructor(name:String, quantity:Int) extends Pizza(name) {

}
