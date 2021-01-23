package com.lightbend.training.scalatraining.functions.closure

case class Person(name:String, lastName:String, age:Int) {

  def apply(name: String, age: Int): Person = Person(name, "", age)

  def addAge(numberYears:Int): Int = age + numberYears
}
