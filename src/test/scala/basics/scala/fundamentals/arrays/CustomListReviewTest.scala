package basics.scala.fundamentals.arrays

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class ListReviewTest extends AnyFlatSpec with should.Matchers {
  val nums: List[Int] = 1 :: (2 :: (3 :: (4 :: Nil)))

  "ListReview" should "List.head" in {
    assert(nums.head == 1)
  }

  "ListReview" should "List.headOption" in {
    val headOptionFromList: Option[Int] = nums.headOption
    assert(headOptionFromList.get == 1)
  }

  "ListReview" should "List.tail" in {
    val tail = nums.tail
    assert(tail.head == 2)
  }

  "ListReview" should "List concat" in {
    val fruit = "Apple" :: ("Pineaple" :: ("Banana" :: Nil))
    val listUnion = fruit ::: nums
    assert(listUnion.contains("Pineaple"))
    assert(listUnion.contains(1))
  }

  "ListReview" should "List.fill" in {
    val fruit = List.fill(5)("Pineaple")
    val listDistinctBy = fruit.distinctBy(f=>f=="Pineaple")
    val listDistinct = fruit.distinct
    assert(fruit.contains("Pineaple"))
    assert(listDistinctBy.length==1)
  }

  "ListReview" should "List.drop" in {
    val fruits = "Pineaple" :: "Coconut" :: "Mango" :: Nil
    val dropList = fruits.drop(2)
    print("drop: "+dropList)
    assert(dropList.head == "Mango")
  }

  "ListReview" should "List.dropRight" in {
    val fruits = "Pineaple" :: "Coconut" :: "Mango" :: Nil
    val dropList = fruits.dropRight(1)
    println("dropList: "+dropList)
    assert(dropList.head == "Pineaple")
  }

  "ListReview" should "List.dropWhile" in {
    val fruits = "Pineaple" :: "Coconut" :: "Mango" :: Nil
    val dropList = fruits.dropWhile(_ == "Coconut")
    println("dropWhile: "+dropList)
    assert(dropList.head == "Pineaple")
  }

  "ListReview" should "list.filter" in {
    val filterList = nums.filter(_ > 3)
    println(filterList)
    assert(filterList.length==1)
  }

  "ListReview" should "list.filterNot" in {
    val filterList = nums.filterNot(_ > 3)
    println(filterList)
    assert(filterList.length==3)
  }

  "ListReview" should "List.find" in {
    val findList: Option[Int] = nums.find(_ >0)
    println(findList)
    assert(!findList.isEmpty)
    val value: Int = findList.get
    assert(value == 1)
  }

  "ListReview" should "List.init" in {
    val initList = nums.init;
    assert(!initList.contains(4))
  }

  "ListReview" should "List.intersect" in {
    val newNumberList = 4 :: 5 :: 6 :: Nil
    val intersect = nums.intersect(newNumberList)
    assert(intersect.head == 4)
  }

  "ListReview" should "List.last" in {
    assert(nums.last == 4)
  }

  "ListReview" should "List.lastOption" in {
    assert(nums.lastOption.get == 4)
  }

  "ListReview" should "List.slice" in {
    val sliceList = nums.slice(1,2)
    println(sliceList)
    assert(sliceList.last==2)
  }

  "ListReview" should "List.take" in {
    val takeList = nums.take(3)
    println(takeList)
    assert(takeList.length == 3)
    assert(!takeList.contains(4))
  }

  "ListReview" should "List.takeRight" in {
    val takeList = nums.takeRight(3)
    println(takeList)
    assert(takeList.length == 3)
    assert(!takeList.contains(1))
  }

  "ListReview" should "List.takeWhile" in {
    val takeWhileList = nums.takeWhile(_ < 3)
    println("takeWhile: "+takeWhileList)
    assert(takeWhileList.last == 2)
  }

  var greaterThan50: PartialFunction[Int, Int] = {
    case i: Int if i > 50  => i
  }

  "ListReview" should "List.collect" in {
    val numbers = List(23,45,67,78,81)
    val newList: List[Int] = numbers collect greaterThan50
    println(newList)
    println(numbers)
  }

}
