# Scala
Project to test Scala language. Training in scala fundamentals and Functionla programming with Scala.

## Handle exceptions

````
def toInt(s:String): Int =
try {
s.toInt
} catch {
    case _:NumberFormatException => 0
}

````
