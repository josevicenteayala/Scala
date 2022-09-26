package basics.scala.fundamentals.fundamentals

import basics.scala.fundamentals.functions.Car
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

/*
* Class to test som car methods
*  */
class CarTest extends AnyFlatSpec with should.Matchers{

  "Car" should "Car.carColor negative" in { 
    val car = new Car
    val carColor: String = car.carColor(-1)
    assert("Red" == carColor)
  }

  "Car" should "Car.carColor positive" in { 
    val car = new Car
    val carColor: String = car.carColor(1)
    assert("Green" == carColor)
  }

  "Car" should "Car.carArray" in { 
    val car = new Car
    car.carArray
  }

}
