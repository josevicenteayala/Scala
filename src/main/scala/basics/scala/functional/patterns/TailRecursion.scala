package basics.scala.functional.patterns

object TailRecursion {

  def main(args: Array[String]): Unit = {
    val names:Seq[String]=List("Isa","Martha","Vicente")
    val lastNames:Seq[String]= List("Ayala","Duque","Ayala")
    val people: Seq[Person] =makePeople(names,lastNames)
    println(people)
  }
  def makePeople(names:Seq[String], lastNames:Seq[String]): Seq[Person] ={
    val identification:Int = 1
    def buildAPerson(names:Seq[String],lastNames:Seq[String],identification:Int,people:Vector[Person]): Seq[Person] ={
      if(names.isEmpty) people
      else {
       val person = Person(names.head,lastNames.head,identification)
        buildAPerson(names.tail, lastNames.tail,identification+1,people:+person)
      }
    }
    buildAPerson(names,lastNames,identification,Vector[Person]())
  }

}

case class Person(name:String,lastName:String,identifcation:Int)