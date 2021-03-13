package basics.scala.fundamentals.datastructures

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head:A,tail:List[A]) extends List[A]

  object List{

    def sum(ints:List[Int]): Int = ints match{
      case Nil  => 0
      case Cons(x,xs) => x + sum(xs)
    }
    def product (ds: List[Double]): Double = ds match{
      case Nil => 1.0
      case Cons(0.0, _) => 0.0
      case Cons(x,xs) => x * product(xs)
    }

    def apply[A](as:A*): List[A]=
      if(as.isEmpty) Nil
      else Cons(as.head,apply(as.tail: _*))

    def fill[A](n:Int, a:A): List[A]={
      val list:List[A] = {
        if(n <= 0) Nil
        else Cons(a,fill(n-1,a))
      }
      list
    }

    def dropWhile[A](as:List[A])(f: A => Boolean): List[A]={
      as match {
        case Cons(h,t) if f(h) => dropWhile(t)(f)
        case _ => as
      }
    }


    def main(args: Array[String]): Unit = {
      val listNil: List[Double] = Nil
      val listString:List[String] = Cons("a",Cons("b",Nil))
      val listInt: List[Int] = Cons(1,Nil)

      println(listInt)
      println(listString)
      println(listNil)

      val list = List(1, 2, 3, 4, 5)
      val doubles:List[Double] = List(1,2,3,4,5)

      val x = list match{
        case Cons(x,Cons(2,Cons(4,_))) => x
        case Nil => 42
        case Cons(x, Cons(y, Cons(3,Cons(4,_)))) => x + y
        case Cons(h,t) => h + sum(t)
        case _ => fill(4,10)
      }
      println(x)

      val dropW = dropWhile(list)(x=>x < 3)
      println(dropW)

      val listFilled = fill(4,10)
      println(listFilled)

      println("Sum "+sum(list))
      println("Mult "+product(doubles))

    }
  }



