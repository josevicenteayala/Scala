package functional

object ForComprenhension extends App{

  val pairs = for{
    num <- List(1,2,3)
    char <- List('a','b','c')
  } yield num +"-"+ char

  println(pairs)
}
