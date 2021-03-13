package basics.scala.options

import org.scalatest.FunSuite

class PersonImplTest extends FunSuite {

  test("PersonImpl.canVote"){
    val person = Person("José Vicente", 44)
    val maybeString: Option[String] = PersonImpl.canVote(person)
    val name = maybeString.get
    assert(name.equals("José Vicente"))
  }

  test("PersonImpl.canVote.Option.isDefine"){
    val person = Person("José Vicente", 44)
    val maybeString = PersonImpl.canVote(person)
    assert(maybeString.isDefined.equals(true))
  }

  test("PersonImpl.canVote.Option.isEmpty"){
    val person = Person("José Vicente", 17)
    val maybeString = PersonImpl.canVote(person)
    assert(maybeString.isEmpty.equals(true))
  }

  test("PersonImpl.canVote.Option.nonEmpty"){
    val person = Person("José Vicente", 18)
    val maybeString = PersonImpl.canVote(person)
    assert(maybeString.nonEmpty.equals(true))
  }

  test("Option.orElse"){
    val someString = Some("text")
    val none = None
    val result = none.orElse(someString)
    assert(result.get.equals("text"));
  }

  test("Option.get"){
    val someString = Some("text")
    val result = someString.get
    assert(result.equals("text"));
  }

  test("Option.fold"){
    val numberList = List(9,10,11)
    val number = numberList.fold(10)(_ + _)
    //sum the list numbers and agregate 10
    assert(number.equals(40))
  }

  test("Option.map"){
    val numberList = List(9,10,11)
    val newListNumber = numberList.map(_ * 10)
    //multiply each list number by 10 and crate a new list
    assert(newListNumber.contains(90))
  }

  test("Option.flatMap"){
    val numberList = List(9,10,11)
    val listOddNumbers = numberList.filter(in => in % 2 == 1)
    val newList = listOddNumbers.flatMap(i => numberList.filter(in => in > 10 ))
    assert(!newList.contains(9))
  }

  test("Option.forEach"){
    val numberList = List(9,10,11)
    val newList = numberList.foreach(i =>  i + 10)
  }

  test("Option.collect"){
    val numberList = List(9,10,11,"12","13")
    val newList = numberList.collect{
      case a:String => a
      case i: Int => i*i
      case Some(i: Int) => i/i
    }
    assert(newList.contains(100))
  }

  test("Option.filter"){
    val numberList = List(1,2,3,4,5,6,7)
    val evenNumbers = numberList.filter(i => i % 2 == 0)
    assert(evenNumbers.length==3)
  }

  test("Option.filterNot"){
    val numberList = List(1,2,3,4,5,6,7)
    //returns the oposit to the predicate, in this case the odd numbers
    val oddNumbers = numberList.filterNot(i => i % 2 == 0)
    assert(oddNumbers.length==4)
  }

  test("Option.exists"){
    val numberList = List(1,2,3,4,5,6,7)
    val existsEvenNumbers = numberList.exists(i => i % 2 == 0)
    assert(existsEvenNumbers)
  }

  test("Option.forall"){
    val numberList = List(1,2,3,4,5,6,7)
    //means that all elements in the list are
    val allAreaEvenNumbers = numberList.forall(i => i % 2 == 0)
    assert(!allAreaEvenNumbers)
  }

  test("Option.contains"){
    val stringNames = List("Cristina","Vicente","Isabel","Martha")
    assert(stringNames.contains("Isabel"))
  }

  test("Option.zip"){
    val listNames = List("Cristina","Vicente","Isabel","Martha")
    val listLastNames = List("Duque","Ayala","Isabel","Martha")
    val listNamesComplete = listNames zip listLastNames
    var head = listNamesComplete.head
    assert(head.productElement(0) == "Cristina")
    assert(head.productElement(1) == "Duque")
  }

  test("Option.unzip") {
    val listNames = List("Cristina", "Vicente", "Isabel", "Martha")
    val listLastNames: Seq[String] = List("Duque", "Ayala", "Isabel", "Martha")
    val listNamesComplete = listNames zip listLastNames
    var unzipList = listNamesComplete.unzip
    assert(listNames == unzipList.productElement(0))
  }

  test("Option.unzip3"){
    val listNames = List("Cristina","Vicente","Isabel","Martha")
    val listLastNames = List("Duque","Ayala","Isabel","Martha")
    val listIdentitications: Seq[Int] = List(1,2,3,4)
    val listNamesComplete = listNames zip listLastNames zip listIdentitications
    println(listNamesComplete.getClass)
    println(listNamesComplete)
    var unzipList = listNamesComplete.unzip

  }
}
