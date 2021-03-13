package basics.scala.fundamentals.classes


/**
 *          Getter?   Setter?
 * -------- -------   -------
 * var      yes       yes
 * val      yes       no
 * default  no        no
 * @param name
 * @param age
 */

class User(var name: String, var  age:Int){

  //constructors
  def this(){
    this("jose Vicente",44)
  }

  def this(name:String){
    this(name,44)
  }

  def this(lastName:String, identification:Int,rol:String){
    this()
  }
}

object Demo {

  def main(args: Array[String]): Unit = {
    var user:User = new User("Max",29)
    println(s"name ${user.name}")
    println(s"age ${user.age}")

    var user2:User = new User("Ayala",98641625,"Developer")

  }

}
