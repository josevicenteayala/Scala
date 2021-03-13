package basics.scala.fundamentals.tuples

object TupleReview {

  def main(args: Array[String]): Unit = {
    val myTuple = (1,2,"String", true)
    val myTuple2 = new Tuple3("Some",3,false)
    val myTuple3 = new Tuple3(1,"hello", (3 -> "three"))

    println(myTuple)
    println(myTuple2)
    println("myTuple._3:: "+myTuple._3)

    myTuple.productIterator.foreach{
      i => println(i)
    }

    //join two elements
    val tuple = 1 -> "Vincent"
    println(tuple)

    println("myTuple3 "+myTuple3)
  }

}
