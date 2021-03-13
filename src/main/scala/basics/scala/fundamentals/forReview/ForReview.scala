package basics.scala.fundamentals.forReview

object ForReview {

  def main(args: Array[String]): Unit = {
    forTo
    forUntil
    forMultipleLoop
    forMultipleLoop2
    forWithFilters
    forYield
  }

  def forTo = {
    for (i <- 1 to 6) {
      println("using to 6 " + i)
    }
  }

  def forUntil:Unit ={
    for(i <- 1 until 6){
      println("using until 6 "+i)
    }
  }

  def forMultipleLoop:Unit ={
    for(i <- 1 to 5; j <- 1 until 4){
      println("multiple loop i:: "+i+" j:: "+j)
    }
  }

  def forMultipleLoop2:Unit ={
    for(i <- 1 to 5; j <- 1 until 4; g <- 1 to 3){
      println("multiple loop i:: "+i+" j:: "+j+" g:: "+g)
    }
  }

  def forWithFilters:Unit ={
    for(i <- 1 to 10; if i == 5){
      println("for with filter "+i)
    }
  }

  val list = List(1,2,3,4,5,6,7,8,9,0)

  def forYield:Unit ={
    val result = for{i <- list;if i<6} yield {
      i * i
    }
    println("Result of yield a list: "+result)
  }
}
