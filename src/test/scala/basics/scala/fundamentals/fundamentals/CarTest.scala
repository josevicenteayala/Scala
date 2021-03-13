package basics.scala.fundamentals.fundamentals

import basics.scala.fundamentals.functions.Car
import org.scalatest.FunSuite

/*
* Class to test som car methods
*  */
class CarTest extends FunSuite{

  test("Car.carColor negative"){
    val car = new Car
    val carColor: String = car.carColor(-1)
    assert("Red" == carColor)
  }

  test("Car.carColor positive"){
    val car = new Car
    val carColor: String = car.carColor(1)
    assert("Green" == carColor)
  }

  test("Car.carArray"){
    val car = new Car
    car.carArray
  }

}
