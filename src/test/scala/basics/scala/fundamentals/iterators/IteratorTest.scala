package basics.scala.fundamentals.iterators

import org.scalatest.FunSuite

class IteratorTest extends FunSuite{

  test("Iterator iterate over collection"){
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    while(iterator.hasNext){
      println(iterator.next())
    }
  }

  test("Iterator.max"){
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator.max == 6)
  }

  test("Iterator.min"){
    val iterator2: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator2.min == 1)
  }

  test("Iterator.size-length"){
    val iterator2: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator2.size == 6)
    assert(iterator2.length == 6)
  }

  test("Iterator.contains"){
    val iterator2: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator2.contains(5))
    assert(!iterator2.contains(7))
  }

  test("Iterator.count"){
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator.count(i=>i%2==0) == 3)
  }

  test("Iterator.duplicate"){
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    val duplicate: (Iterator[Int], Iterator[Int]) = iterator.duplicate
    assert(iterator.max == 6)
    val intToString: Int => String = duplicate.productElementName(_)
    println(intToString)
  }

}
