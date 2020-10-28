package com.lightbend.training.scalatraining.validations

import cats.data.Validated
import io.circe.{Decoder, Encoder}

object Validations {

  /*def mandatory[A](field:String, value:Option[A], isValid:A => Boolean = (_: A) => true): Validated[A] = {
    value.map[Validated[A]](v => if (isValid(v)) v else IncorrectDataType(field)  )
      .getOrElse(IncorrectDataType(field))
  }*/

  trait ServiceError {
    val code: String
    val message: String
  }

  object ServiceError {
    implicit def encoder[T <: ServiceError]: Encoder[T] =
      Encoder.forProduct2[T, String, String]("code", "message")(e => (e.code, e.message))

    implicit def decoder: Decoder[ServiceError] =
      Decoder.forProduct2[ServiceError, String, String]("code", "message") { (codeRaw, messageRaw) =>
        new ServiceError {
          val code: String    = codeRaw
          val message: String = messageRaw
        }
      }
  }

  final case class IncorrectDataType(code: String = "8001003", message: String) extends ServiceError {
    override def toString: String = s"error code: $code, message: $message"
  }

  object IncorrectDataType {
    def apply(field: String): IncorrectDataType =
      new IncorrectDataType(message = s"Data type of $field field is incorrect")
  }

}
