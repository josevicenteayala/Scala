package basics.scala.fundamentals.arrays

/**
 * by default are immutable
 */
object MapReview {

  def main(args: Array[String]): Unit = {
    val map: scala.collection.mutable.Map[String,String] = scala.collection.mutable.Map[String,String]()
    map += ("1" -> "One")
    map += ("2" -> "Two")
    map += ("3" -> "Three")

    val mapFruits = Map("Apple" -> "Apple", "Pineapple" -> "Pineapple")
    val unionMap = map ++ mapFruits
    println(unionMap)

    map -= "3"
    println(map)

    mapFruits.keys.foreach{
      key => println("key "+key)
        println("Value "+mapFruits(key))
    }

    mapFilter
  }

  def mapFilter={
    val list = List(1,2,3,4,5,6,7,8,9)
    val map = Map(1 -> "Vin",2 -> "Isa",3 -> "Caqui")

    val list2 = list.map(_ * 2)
    println(s" 1-List1 $list2")
    println(s" 2-List2 ${list.map(x=> x/ 0.2)}")
    println(s" 3-List3 ${list.map(x=> "hi" *  x)}")
    println(s" 4-List4 ${map.mapValues(x => "hi "+x).toMap}")
    println(s" 5-List5 ${List(List(1,2,3),List(3,4,5)).flatten}")
    println(s" 6-List6 ${list.flatMap(x => List(x, x+1))}")
    println(s" 7-List7 ${list.map(x => List(x, x+1))}")

    //predicate is a function that return a boolean value
    println(list.filter(x => x%2==0))
  }

}
