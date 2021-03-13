package basics.scala.fundamentals.arrays

import org.scalatest.FunSuite

class MapReviewTest extends FunSuite{

  val mapNames = Map("1" ->"Isa","2"->"Martha","3"->"José Vicente")
  val mapScores = Map("Jhon" ->5,"Mat"->4,"James"->25)

  test("Iterate over map"){
    for((key,value) <- mapNames) printf("Key: %s, Value: %s\n", key, value)
    assert(!mapNames.isEmpty)
    println("Other format")
    mapNames.foreach(name =>println(name._1 + "--->"+name._2))

    println("Other way to iterate")
    mapNames foreach{
      case (key,value) => println(key+"--->"+value)
    }

    println("Other way to iterate")
    var otherNames: scala.collection.mutable.Map[String, String] = scala.collection.mutable.Map[String, String]()
    mapNames.keys.foreach((number) =>
      if(mapNames.contains(number)){
        println(number)
        val value: Option[String] = mapNames.get(number)
        otherNames += (number -> value.get)
      }
    )

    println("OtherNames MAP: "+otherNames)
  }

  test("Map.exists"){
    assert(mapNames.exists(_._1 == "1"))
  }

  test("Map.filter"){
    val otherMap: Map[String, String] = mapNames.filter(_._1 == "1")
    println(otherMap)
    assert(otherMap.size == 1)
    assert(otherMap.contains("1"))
  }

  test("Map.max"){
    val maxElement: (String, Int) = mapScores.max
    println(maxElement)
    assert(maxElement._1 == "Mat")
  }

  test("Map.toBuffer"){
    val mapSquares: Map[Int, Int] = Map(1->1,2 ->2)
    val buffer = mapSquares.toBuffer
    println(buffer)
    assert(buffer.length==2)
  }

}
