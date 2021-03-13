package basics.scala.fundamentals.string

object StringReview {

  def main(args: Array[String]): Unit = {
    val chain = "This is a chain"
    println(s"$chain :: charAt(0): ${chain.charAt(0)}")
    println(s"$chain :: compareTo(chain): ${chain.compareTo(chain)}")
    println(s"chain.compareToIgnoreCase(THIS US A CHAIN) :: : ${chain.compareToIgnoreCase("THIS US A CHAIN")}")
    println(s"$chain :: concat( add another text): ${chain.concat(" add another text")}")
    val sb:StringBuilder = new StringBuilder
    sb.append(chain)
    println(s"$chain :: contentEquals(sb): ${chain.contentEquals(sb)}")
    println(s"$chain :: endsWith(chain): ${chain.endsWith("chain")}")
    println(s"$chain :: equals(chain): ${chain.equals(chain)}")
    println(s"$chain :: equalsIgnoreCase(chain): ${chain.equalsIgnoreCase(chain)}")
    println(s"$chain :: getBytes(): ${chain.getBytes()}")
    val charArray: Array[Char] = chain.toCharArray
    println(s"$chain :: chain.getChars(0,10,charArray,0): ${chain.getChars(0,10,charArray,0)}")
    println(s"$chain :: hashCode: ${chain.hashCode}")
    println(s"$chain :: indexOf(5): ${chain.indexOf(5)}")
    println(s"$chain :: indexOf(0,10): ${chain.indexOf(0,10)}")
    println(s"$chain :: intern(): ${chain.intern()}")
    println(s"$chain :: lastIndexOf(20): ${chain.lastIndexOf(20)}")
    println(s"$chain :: length: ${chain.length}")
    println(s"$chain :: matches(s): ${chain.matches("\\s")}")
    println(s"$chain :: replace('T','C'): ${chain.replace('T','C')}")
    println(s"$chain :: split: ${chain.split(" ")}")
    println(s"$chain :: startsWith(This): ${chain.startsWith("This")}")
    println(s"$chain :: subSequence(0,10): ${chain.subSequence(0,10)}")
    println(s"$chain :: substring(0): ${chain.substring(0)}")
    println(s"$chain :: toCharArray: ${chain.toCharArray}")
    println(s"$chain :: toLowerCase: ${chain.toLowerCase()}")
    println(s"$chain :: toUpperCase: ${chain.toUpperCase}")
    println(s"$chain :: trim: ${chain.trim}")
  }

}
