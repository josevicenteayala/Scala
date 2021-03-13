package basics.scala

/*
Calculator class let to manage some arithmetic operations
* */

object Calculator {

  /*
  cube multiple 3 times the number
   */
  def cube(number: Int)={
    number * number * number
  }

  def riseSalary()={
    val employees = List(
      Employee("Tom", "manager", 50000),
      Employee("Bob", "employee", 20000),
      Employee("Mark", "employee", 20000),
      Employee("John", "manager", 55000),
      Employee("Dilan", "employee", 35000)
    )
  }
}
