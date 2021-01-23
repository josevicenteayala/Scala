package com.lightbend.training.scalatraining.option

class OptionReview {

  def revertString(optionString:Option[String]):String = {
    optionString.map(_.reverse).getOrElse("")
  }

}
