package functional

object ForComprenhension extends App{

  val pairs = for{
    num <- List(1,2,3)
    char <- List('a','b','c')
  } yield num +"-"+ char

  println(pairs)

  private val result: IndexedSeq[Int] = for (i <- 1 to 10000 if (i % 2 == 0)) yield i
  println(s" result $result")
}
