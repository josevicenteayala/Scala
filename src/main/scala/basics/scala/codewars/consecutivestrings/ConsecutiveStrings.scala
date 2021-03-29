package basics.scala.codewars.consecutivestrings

import scala.annotation.tailrec

/**
 * You are given an array(list) strarr of strings and an integer k.
 * Your task is to return the first longest string consisting of k consecutive strings taken in the array.
 *
 * strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2
 *
 * Concatenate the consecutive strings of strarr by 2, we get:
 *
 * treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
 * folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
 * trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
 * blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
 * abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]
 *
 * Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
 * The first that came is "folingtrashy" so
 * longest_consec(strarr, 2) should return "folingtrashy".
 *
 * In the same way:
 * longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
 * n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
 *
 * https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/scala
 */
object ConsecutiveStrings extends App {

  def longestConsec(strarr: Array[String], k: Int): String = {
    @tailrec
   def getSubList(listStrings:List[String], k:Int, longestConsecutive:String): String = {
      println(s"calling getSublist $listStrings longestConsecutive $longestConsecutive")
      listStrings match{
        case Nil => longestConsecutive
        case _ :: tail => {
          val currentConsecutive = listStrings.take(k).mkString("")
          println(s"currentConsecutive $currentConsecutive longestConsecutive $longestConsecutive")
          if(listStrings.length >= k && longestConsecutive.length < currentConsecutive.length)
            getSubList(tail,k, currentConsecutive)
          else getSubList(tail,k, longestConsecutive)
        }
      }
    }

    getSubList(strarr.toList,k,"")
  }


  def longestConsecV2(strarr: Array[String], k: Int): String = {
    if(strarr.size == 0 || k > strarr.size || k <= 0) ""
    else
      strarr.sliding(k).map(_.mkString).maxBy(_.length)
  }
}
