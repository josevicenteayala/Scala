package implicits.useimplicits

import implicits.Implicits._

object UseImplicits extends App {

  def countSpecificCharacter(string:String, char:Char): Int = {
    string.countCharacter(char)
  }

  def replaceSpacesWithUnderscore(string:String):String = string.replaceSpaceWithUnderScore

}
