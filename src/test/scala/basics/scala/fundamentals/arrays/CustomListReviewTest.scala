package basics.scala.fundamentals.arrays

import org.scalatest.FunSuite

class ListReviewTest extends FunSuite {
  val nums: List[Int] = 1 :: (2 :: (3 :: (4 :: Nil)))

  test("List.head"){
    assert(nums.head == 1)
  }

  test("List.headOption"){
    val headOptionFromList: Option[Int] = nums.headOption
    assert(headOptionFromList.get == 1)
  }

  test("List.tail"){
    val tail = nums.tail
    assert(tail.head == 2)
  }

  test("List concat"){
    val fruit = "Apple" :: ("Pineaple" :: ("Banana" :: Nil))
    val listUnion = fruit ::: nums
    assert(listUnion.contains("Pineaple"))
    assert(listUnion.contains(1))
  }

  test("List.fill"){
    val fruit = List.fill(5)("Pineaple")
    val listDistinctBy = fruit.distinctBy(f=>f=="Pineaple")
    val listDistinct = fruit.distinct
    assert(fruit.contains("Pineaple"))
    assert(listDistinctBy.length==1)
  }

  test("List.drop"){
    val fruits = "Pineaple" :: "Coconut" :: "Mango" :: Nil
    val dropList = fruits.drop(2)
    print("drop: "+dropList)
    assert(dropList.head == "Mango")
  }

  test("List.dropRight"){
    val fruits = "Pineaple" :: "Coconut" :: "Mango" :: Nil
    val dropList = fruits.dropRight(1)
    println("dropList: "+dropList)
    assert(dropList.head == "Pineaple")
  }

  test("List.dropWhile"){
    val fruits = "Pineaple" :: "Coconut" :: "Mango" :: Nil
    val dropList = fruits.dropWhile(_ == "Coconut")
    println("dropWhile: "+dropList)
    assert(dropList.head == "Pineaple")
  }

  test("list.filter"){
    val filterList = nums.filter(_ > 3)
    println(filterList)
    assert(filterList.length==1)
  }

  test("list.filterNot"){
    val filterList = nums.filterNot(_ > 3)
    println(filterList)
    assert(filterList.length==3)
  }

  test("List.find"){
    val findList: Option[Int] = nums.find(_ >0)
    println(findList)
    assert(!findList.isEmpty)
    val value: Int = findList.get
    assert(value == 1)
  }

  test("List.init"){
    val initList = nums.init;
    assert(!initList.contains(4))
  }

  test("List.intersect"){
    val newNumberList = 4 :: 5 :: 6 :: Nil
    val intersect = nums.intersect(newNumberList)
    assert(intersect.head == 4)
  }

  test("List.last"){
    assert(nums.last == 4)
  }

  test("List.lastOption"){
    assert(nums.lastOption.get == 4)
  }

  test("List.slice"){
    val sliceList = nums.slice(1,2)
    println(sliceList)
    assert(sliceList.last==2)
  }

  test("List.take"){
    val takeList = nums.take(3)
    println(takeList)
    assert(takeList.length == 3)
    assert(!takeList.contains(4))
  }

  test("List.takeRight"){
    val takeList = nums.takeRight(3)
    println(takeList)
    assert(takeList.length == 3)
    assert(!takeList.contains(1))
  }

  test("List.takeWhile"){
    val takeWhileList = nums.takeWhile(_ < 3)
    println("takeWhile: "+takeWhileList)
    assert(takeWhileList.last == 2)
  }

  var greaterThan50: PartialFunction[Int, Int] = {
    case i: Int if i > 50  => i
  }

  test("List.collect"){
    val numbers = List(23,45,67,78,81)
    val newList: List[Int] = numbers collect greaterThan50
    println(newList)
    println(numbers)
  }

}
