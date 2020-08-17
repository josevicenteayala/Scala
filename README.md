# Scala
Project to test Scala language.

## Handle exceptions

````
def toInt(s:String): Int =
try {
s.toInt
} catch {
    case _:NumberFormatException => 0
}

````