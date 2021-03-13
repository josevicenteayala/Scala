package functional

abstract class MyListFunctionalGeneric[+A] {
  def head: A
  def tail: MyListFunctionalGeneric[A]
  def isEmpty:Boolean
  def add[B>:A](element:B): MyListFunctionalGeneric[B]
  def printElments:String
  override def toString: String = "["+printElments+"]"
  def map[B](transformer:MyTransformerFunctional[A,B]):MyListFunctionalGeneric[B]
  def flatMap[B](transformer:MyTransformerFunctional[A,MyListFunctionalGeneric[B]]):MyListFunctionalGeneric[B]
  def filter(predicate:MyPredicateFunctional[A]):MyListFunctionalGeneric[A]
  def ++[B >: A](list:MyListFunctionalGeneric[B]):MyListFunctionalGeneric[B]
  def foreach(f:A=>Unit):Unit
  def sort(compare:(A,A)=>Int):MyListFunctionalGeneric[A]
  def zipWith[B,C](list:MyListFunctionalGeneric[B],zip:(A,B)=>C):MyListFunctionalGeneric[C]
  def fold[B](start:B)(operator: (B,A)=>B):B
}

/*
Empty Generic
 */
object EmptyFunctionalGeneric$ extends MyListFunctionalGeneric[Nothing]{
  override def head: Nothing = throw new NoSuchElementException

  override def tail: MyListFunctionalGeneric[Nothing] = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add[B >: Nothing](element: B): MyListFunctionalGeneric[B] = new ConsFunctionalGeneric(element,EmptyFunctionalGeneric$)

  override def printElments: String = ""

  override def map[B](transformer: MyTransformerFunctional[Nothing, B]): MyListFunctionalGeneric[B] = EmptyFunctionalGeneric$

  override def flatMap[B](transformer: MyTransformerFunctional[Nothing, MyListFunctionalGeneric[B]]): MyListFunctionalGeneric[B] = EmptyFunctionalGeneric$

  override def filter(predicate: MyPredicateFunctional[Nothing]): MyListFunctionalGeneric[Nothing] = EmptyFunctionalGeneric$

  override def ++[B >: Nothing](list: MyListFunctionalGeneric[B]): MyListFunctionalGeneric[B] = list

  override def foreach(f: Nothing => Unit): Unit = ()

  override def sort(compare: (Nothing, Nothing) => Int): MyListFunctionalGeneric[Nothing] = EmptyFunctionalGeneric$

  override def zipWith[B, C](list: MyListFunctionalGeneric[B], zip: (Nothing, B) => C): MyListFunctionalGeneric[C] = {
    if(!list.isEmpty) throw new RuntimeException("List do not have the same length")
    else EmptyFunctionalGeneric$
  }

  override def fold[B](start: B)(operator: (B, Nothing) => B): B = start
}

/*
*Const generic
* */

class ConsFunctionalGeneric[+A](h:A, t:MyListFunctionalGeneric[A]) extends MyListFunctionalGeneric[A]{
  override def head: A = h

  override def tail: MyListFunctionalGeneric[A] = t

  override def isEmpty: Boolean = false

  override def add[B >: A](element: B): MyListFunctionalGeneric[B] = new ConsFunctionalGeneric(element,this)

  override def printElments: String =
    if(t.isEmpty) "" +h
    else h+ " "+t.printElments

  override def map[B](transformer: MyTransformerFunctional[A, B]): MyListFunctionalGeneric[B] =
    new ConsFunctionalGeneric[B](transformer.transform(h),t.map(transformer))

  override def flatMap[B](transformer: MyTransformerFunctional[A, MyListFunctionalGeneric[B]]): MyListFunctionalGeneric[B] = {
    transformer.transform(h) ++ t.flatMap(transformer)
  }


  override def filter(predicate: MyPredicateFunctional[A]): MyListFunctionalGeneric[A] =
    if(predicate.test(h)) new ConsFunctionalGeneric[A](h,t.filter(predicate))
    else t.filter(predicate)

  override def ++[B >: A](list: MyListFunctionalGeneric[B]): MyListFunctionalGeneric[B] = {
    new ConsFunctionalGeneric[B](h,t ++ list)
  }

  override def foreach(f: A => Unit): Unit = {
    f(h)
    t.foreach(f)
  }

  override def sort(compare: (A, A) => Int): MyListFunctionalGeneric[A] = {
    def insert(h: A, sorteTail: MyListFunctionalGeneric[A]): MyListFunctionalGeneric[A] = {
      if(sorteTail.isEmpty) new ConsFunctionalGeneric(h,EmptyFunctionalGeneric$)
      else if(compare(h,sorteTail.head)<=0) new ConsFunctionalGeneric[A](h,sorteTail)
      else new ConsFunctionalGeneric[A](sorteTail.head,insert(h,sorteTail.tail))
    }
    val sorteTail = t.sort(compare)
    insert(h,sorteTail)
  }

  override def zipWith[B, C](list: MyListFunctionalGeneric[B], zip: (A, B) => C): MyListFunctionalGeneric[C] = {
    if(list.isEmpty) throw new RuntimeException("List do not have the same length")
    else new ConsFunctionalGeneric[C](zip(h,list.head),t.zipWith(list.tail,zip))

  }

  override def fold[B](start: B)(operator: (B, A) => B): B = {
    val newStart = operator(start,h)
    t.fold(newStart)(operator)
  }

}

trait MyPredicateFunctional[-T]{
  def test(elem:T): Boolean
}

trait MyTransformerFunctional[-A,B]{
  println("In My transformer ")
  def transform(element:A):B
}

object ListFunctionalGenericTest extends App{
  val list: ConsFunctionalGeneric[Int] = new ConsFunctionalGeneric(1,new ConsFunctionalGeneric(2, new ConsFunctionalGeneric(3,EmptyFunctionalGeneric$)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list)

  val listOfStrings = new ConsFunctionalGeneric[String]("One",new ConsFunctionalGeneric[String]("Two",new ConsFunctionalGeneric[String]("Three",EmptyFunctionalGeneric$)))
  println(listOfStrings)

  private val intToInt: Int => Int = _ + 2
  val listAfterMap: MyListFunctionalGeneric[Int] = list.map(intToInt(_))
  println(listAfterMap)

  val transformer = new MyTransformerFunctional[Int,Int] {
    override def transform(element: Int): Int = element * 2
  }
  println(list.map(transformer))

  val transformerConcateenate = new MyTransformerFunctional[Int,MyListFunctionalGeneric[Int]]{
    override def transform(element: Int): MyListFunctionalGeneric[Int] = new ConsFunctionalGeneric[Int](element, new ConsFunctionalGeneric[Int](element +1,EmptyFunctionalGeneric$))
  }
  println(list.flatMap(transformerConcateenate))

  list.foreach(println)

  println(list.sort((x,y)=> y - x))
  println(list.zipWith[Int,String](list,_ + "_"+_))

  println(list.fold(0)(_+_))
}