package basics.scala.fundamentals.reduce

object ReduceReview {

  val numberList = List(1,2,3,4)
  val letterList = List("A","B","C","D")

  def main(args: Array[String]): Unit = {
    println("reduceLeft + "+letterList.reduceLeft(_ + _))
    println("reduceRight + "+letterList.reduceRight(_ + _))
    println("reduceRight + "+numberList.reduceRight(_ + _))
    println("reduceRight - "+numberList.reduceRight(_ - _))
    println("reduceLeft + "+numberList.reduceLeft(_ + _))
    println("reduceLeft - "+numberList.reduceLeft(_ - _))

    println("foldLeft")
    println("foldLeft + "+numberList.foldLeft(10)(_+_))
    println("foldLeft - "+numberList.foldLeft(10)(_-_))

    println("Reduce Left + ")
    println(numberList.reduceLeft((x,y)=>{
      println(x+", "+y)
      x+y
    }))

    println("Reduce Left - ")
    println(numberList.reduceLeft((x,y)=>{
      println(x+", "+y)
      x-y
    }))

    println("Reduce Right + ")
    println(numberList.reduceRight((x,y)=>{
      println(x+", "+y)
      x+y
    }))

    println("Reduce Right - ")
    println(numberList.reduceRight((x,y)=>{
      println(x+", "+y)
      x-y
    }))

    println("scanLeft")
    println(numberList.scanLeft(100)(_+_))
    println(numberList.scanLeft(100)(_-_))
    println(letterList.scanLeft("d")(_+_))
  }

}
