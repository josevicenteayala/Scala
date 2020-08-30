package com.lightbend.training.scalatraining.either

object EitherExample {

  def calculatedValuePlus10(value: String): Either[IllegalArgumentException, Int] = {
    try {
      Right(value.toInt * 10)
    } catch {
      case e: Exception => Left(new IllegalArgumentException(s"The value $value is not a number"))
    }
  }

}
