package com.lightbend.training.scalatraining.functions.closure

class ClosurePerson {

  val initialAge: Int = 45
  //value used in closure method
  val personVicente: Person = Person("Vicente", "Ayala", initialAge)

  def execClosure(f:Any => Any, a:Any): Any = f(a)

  /**
   * The closure is personVicente because is a variable in the same scope as this value
   */
  val isGreaterThanVicente = (p:Person) => p.age >= personVicente.age

}


