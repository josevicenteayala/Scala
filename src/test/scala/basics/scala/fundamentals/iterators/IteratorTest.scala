package basics.scala.fundamentals.iterators

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class IteratorTest extends AnyFlatSpec with should.Matchers{

  "Iterator" should "Iterator iterate over collection" in {
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    while(iterator.hasNext) {
      println(iterator.next())
    }
  }

  "Iterator" should "Iterator.max" in {
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator.max == 6)
  }

  "Iterator" should "Iterator.min" in {
    val iterator2: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator2.min == 1)
  }

  "Iterator" should "Iterator.size-length" in {
    val iterator2: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator2.size == 6)
    assert(iterator2.length == 6)
  }

  "Iterator" should "Iterator.contains" in {
    val iterator2: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator2.contains(5))
    assert(!iterator2.contains(7))
  }

  "Iterator" should "Iterator.count" in {
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    assert(iterator.count(i=>i%2==0) == 3)
  }

  "Iterator" should "Iterator.duplicate" in {
    val iterator: Iterator[Int] = Iterator(1,2,3,4,5,6)
    val duplicate: (Iterator[Int], Iterator[Int]) = iterator.duplicate
    assert(iterator.max == 6)
    val intToString: Int => String = duplicate.productElementName(_)
    println(intToString)
  }

}
