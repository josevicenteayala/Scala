package basics.scala.codewars.splitstrings

object StringSplits extends App {

  def solution(s: String): List[String] = {
    if(s==null || s.isEmpty) return List.empty
    val list = s.grouped(2).toList
    list.last.length match {
      case 1 => list.updated(list.length-1,list.last+'_')
      case _ => list
    }
  }

  def solutionV2(s: String): List[String] = {
    s.grouped(2).map(_.padTo(2, '_')).toList
  }

  def solutionV3(s: String): List[String] = {
    s.padTo(s.size + s.size%2, '_').grouped(2).toList
  }
}
