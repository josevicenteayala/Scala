package basics.scala.fundamentals.pattern

object PatternDemo {
  def main(args: Array[String]): Unit = {
    val martha = new Person("Martha", 46,43744586)
    val isabel = new Person("Isabel",10,1034994421)
    val jose = new Person("José Vicente",44,98641625)
    val math = new Person("Math",50,437896352)
    val personList: List[Person] = List(martha,isabel,jose,math)
    for(person <- personList){
      person match{
        case Person("Martha", 46,43744586) =>{
          println(s"Hi ${person.name}")
        }
        case Person("Isabel", 10,1034997724) =>{
          println(s"Hi ${person.name}")
        }
        case Person("José Vicente", 44,98641625) =>{
          println(s"Hi ${person.name}")
        }
        case Person(name,age,identification) =>{
          println(s"Hi ${person.name}")
        }
      }
    }
  }

}
