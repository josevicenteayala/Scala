package com.lightbend.training.scalatraining.functions.closure

class AnotherPerson {

  val person: Person = Person("Martha", "Duque", 47)

  val closurePerson: ClosurePerson = new ClosurePerson

  def isOlderThanVicente(person:Person): Boolean = closurePerson.isGreaterThanVicente(person)

}
