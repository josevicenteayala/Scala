package basics.scala.options

object PersonImpl {

  def canVote(p: Person): Option[String] = p match{
    case Person(name,age) if age > 17 => Some(name)
    case _ => None
  }

}
