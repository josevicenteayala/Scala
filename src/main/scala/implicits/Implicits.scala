package implicits

object Implicits {

  implicit class StringExtensionsMethods (string:String) {
    def replaceSpaceWithUnderScore: String = string.replace(" ", "_")

    def countCharacter(char:Char): Int = string.count(_.equals(char))
  }

}
