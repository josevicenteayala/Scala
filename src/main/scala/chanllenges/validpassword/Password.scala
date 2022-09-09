package chanllenges.validpassword

object Password {

  def main(args: Array[String]): Unit = {
    println(s"The password 123 is valid? ${isValidPassword("123")}")
    println(s"The password GoodPas1 is valid? ${isValidPassword("GoodPas1")}")
    println(s"The password GoodPas. is valid? ${isValidPassword("GoodPas.")}")
    println(s"The password badpassword is valid? ${isValidPassword("badpassword")}")
    println(s"The password badpassworD is valid? ${isValidPassword("badpassworD")}")
    println(s"The password 1234567, is valid? ${isValidPassword("1234567,")}")
    println(s"The password 1234567,w is valid? ${isValidPassword("1234567,w")}")
    println(s"The password 1234567,D is valid? ${isValidPassword("1234567,D")}")
    println(s"The password 1234567,Da is valid? ${isValidPassword("1234567,Da")}")

    println("------------------------------------------------------------------")

    println(s"The password 123 is valid? ${isValidPasswordEnhance("123")}")
    println(s"The password GoodPas1 is valid? ${isValidPasswordEnhance("GoodPas1")}")
    println(s"The password GoodPas. is valid? ${isValidPasswordEnhance("GoodPas.")}")
    println(s"The password badpassword is valid? ${isValidPasswordEnhance("badpassword")}")
    println(s"The password badpassworD is valid? ${isValidPasswordEnhance("badpassworD")}")
    println(s"The password 1234567, is valid? ${isValidPasswordEnhance("1234567,")}")
    println(s"The password 1234567,w is valid? ${isValidPasswordEnhance("1234567,w")}")
    println(s"The password 1234567,D is valid? ${isValidPasswordEnhance("1234567,D")}")
    println(s"The password 1234567,Da is valid? ${isValidPasswordEnhance("1234567,Da")}")
  }

  /**
   * Rules to validate the password
   * - It must contain 8 characters at list
   * - It must contains a lower case character
   * - It must contain an upper case character
   * - It must contain a number or punctuation character (. , ; : ! ")
   * @param password
   * @return
   */
  def isValidPassword(password:String): Boolean = {
    validateMinimumCharacters(password)
  }

  def isValidPasswordEnhance(implicit password:String): Boolean = {
    password.size >= 8 &&
      password.exists(c => c.isLower) &&
      password.exists(c => c.isUpper) &&
      (password.exists(c => c.isDigit) ||
        hasPunctuation)

  }

  private def validateMinimumCharacters(password: String): Boolean = {
    password.length >= 8 &&
    validateCharacters(password, validLowerCaseCharacters) &&
    validateCharacters(password, validUpperCaseCharacters) &&
      (validateCharacters(password, validPunctuationCharacters) ||
    validateCharacters(password, validNumbers))
  }

  val validLowerCaseCharacters = Seq("a","b","c","d","e","f","g","h","i", "j", "k", "l", "m","n", "o","p","q","r","s","t","u","v","w","x","y","z")
  val validUpperCaseCharacters = Seq("A","B","C","D","E","F","G","H","I", "J", "K", "L", "M","N", "O","P","Q","R","S","T","U","V","W","X","Y","Z")
  val validPunctuationCharacters = Seq(".", ",", ";", ":", "!", "\"")
  val validNumbers = Seq(1,2,3,4,5,6,7,8,9,0)

  private def validateCharacters[A](password:String, characters:Seq[A]) :Boolean =
    characters.map(c => password.contains(c.toString)).contains(true)

  private def hasPunctuation(implicit password:String):Boolean = {
    password.exists(c =>
    c == '.' || c == ',' || c == ';' || c == ':' || c == '?' || c == '!' || c == '_' || c == ')' || c == '(' || c == '-'|| c == '¿'
    )
  }
}
