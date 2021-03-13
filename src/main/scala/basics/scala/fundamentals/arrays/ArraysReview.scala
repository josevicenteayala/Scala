package basics.scala.fundamentals.arrays

object ArraysReview {

  def main(args: Array[String]): Unit = {
    var array:Array[String]= new Array[String](4)
    array(0) = "one"
    array(1) = "two"
    array(2) = "three"
    array(2) = "three3"
    array(3) = "four"
    println(array.apply(2))

    var array2  = Array("One","Two","Three");
    println(array2)

    var bothArrays: List[String] = array.toList ::: array2.toList
    println(bothArrays)

    //Multidimensional
    var multidimensional = Array.ofDim[Int](2,2)
    multidimensional(0)(0) = 1
    multidimensional(0)(1) = 2
    multidimensional(1)(0) = 3
    multidimensional(1)(1) = 4
    println(multidimensional(0).toList)
    println(multidimensional(1).toList)



  }
}
