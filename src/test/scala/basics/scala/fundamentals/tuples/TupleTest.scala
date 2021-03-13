package basics.scala.fundamentals.tuples

import org.scalatest.FunSuite

class TupleTest extends FunSuite{

  test("Tuple. two elements"){
    val tuple: (Int, String) = (1,"one")
    assert(tuple._1==1)
  }

  test("Tuple. twenty two elements"){
    val tuple: (Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String, Int, String) = (1,"one",2,"two",3,"three",4,"four",5,"five",6,"six",7,"seven",8,"eight",9,"nine",10,"ten",11,"eleven")
    assert(tuple._2=="one")
    assert(tuple._12=="six")
    assert(tuple._22=="eleven")
  }

  test("Tuple.swap"){
    val tuple: (Int, String) = (1,"one")
    val swapTuple: (String, Int) = tuple.swap
    assert(swapTuple._1=="one")
  }
}
