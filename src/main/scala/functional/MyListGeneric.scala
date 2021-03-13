package functional

abstract class MyListGeneric[+A] {
  def head: A
  def tail: MyListGeneric[A]
  def isEmpty:Boolean
  def add[B>:A](element:B): MyListGeneric[B]
  def printElments:String
  override def toString: String = "["+printElments+"]"
  def map[B](transformer:MyTransformer[A,B]):MyListGeneric[B]
  def flatMap[B](transformer:MyTransformer[A,MyListGeneric[B]]):MyListGeneric[B]
  def filter(predicate:MyPredicate[A]):MyListGeneric[A]
  def ++[B >: A](list:MyListGeneric[B]):MyListGeneric[B]
}

/*
Empty Generic
 */
object EmptyGeneric extends MyListGeneric[Nothing]{
  override def head: Nothing = throw new NoSuchElementException

  override def tail: MyListGeneric[Nothing] = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add[B >: Nothing](element: B): MyListGeneric[B] = new ConsGeneric(element,EmptyGeneric)

  override def printElments: String = ""

  override def map[B](transformer: MyTransformer[Nothing, B]): MyListGeneric[B] = EmptyGeneric

  override def flatMap[B](transformer: MyTransformer[Nothing, MyListGeneric[B]]): MyListGeneric[B] = EmptyGeneric

  override def filter(predicate: MyPredicate[Nothing]): MyListGeneric[Nothing] = EmptyGeneric

  override def ++[B >: Nothing](list: MyListGeneric[B]): MyListGeneric[B] = list
}

/*
*Const generic
* */

class ConsGeneric[+A](h:A, t:MyListGeneric[A]) extends MyListGeneric[A]{
  override def head: A = h

  override def tail: MyListGeneric[A] = t

  override def isEmpty: Boolean = false

  override def add[B >: A](element: B): MyListGeneric[B] = new ConsGeneric(element,this)

  override def printElments: String =
    if(t.isEmpty) "" +h
    else h+ " "+t.printElments

  override def map[B](transformer: MyTransformer[A, B]): MyListGeneric[B] =
    new ConsGeneric[B](transformer.transform(h),t.map(transformer))

  override def flatMap[B](transformer: MyTransformer[A, MyListGeneric[B]]): MyListGeneric[B] = {
    transformer.transform(h) ++ t.flatMap(transformer)
  }


  override def filter(predicate: MyPredicate[A]): MyListGeneric[A] =
    if(predicate.test(h)) new ConsGeneric[A](h,t.filter(predicate))
    else t.filter(predicate)

  override def ++[B >: A](list: MyListGeneric[B]): MyListGeneric[B] = {
    new ConsGeneric[B](h,t ++ list)
  }
}

trait MyPredicate[-T]{
  def test(elem:T): Boolean
}

trait MyTransformer[-A,B]{
  println("In My transformer ")
  def transform(element:A):B
}

object ListGenericTest extends App{
  val list: ConsGeneric[Int] = new ConsGeneric(1,new ConsGeneric(2, new ConsGeneric(3,EmptyGeneric)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list)

  val listOfStrings = new ConsGeneric[String]("One",new ConsGeneric[String]("Two",new ConsGeneric[String]("Three",EmptyGeneric)))
  println(listOfStrings)

  private val intToInt: Int => Int = _ + 2
  val listAfterMap: MyListGeneric[Int] = list.map(intToInt(_))
  println(listAfterMap)

  val transformer = new MyTransformer[Int,Int] {
    override def transform(element: Int): Int = element * 2
  }
  println(list.map(transformer))

  val transformerConcateenate = new MyTransformer[Int,MyListGeneric[Int]]{
    override def transform(element: Int): MyListGeneric[Int] = new ConsGeneric[Int](element, new ConsGeneric[Int](element +1,EmptyGeneric))
  }
  println(list.flatMap(transformerConcateenate))

}