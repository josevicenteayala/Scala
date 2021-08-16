package basics.scala.fundamentals.companion

import basics.scala.fundamentals.companion.CompanionClass.privateName

class CompanionClass {

  def companionClassName:String = privateName
}

object CompanionClass{
  private val privateName:String = "CompanionClass"
}
