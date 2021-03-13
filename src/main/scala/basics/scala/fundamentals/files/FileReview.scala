package basics.scala.fundamentals.files

import java.io.{File, PrintWriter}

import scala.io.Source

object FileReview {

  def main(args: Array[String]): Unit = {
    val ruta = "/tmp/firstFile.txt"
    writeFile(ruta)
    readFile(ruta)
  }

  private def writeFile(ruta:String) = {
    val writer = new PrintWriter(new File(ruta))
    writer.write("This is my first file in Scala, Give me the finger \n")
    writer.write("The second line in the file")
    writer.close()
  }

  private def readFile(ruta:String): Unit={
    val iterator: Iterator[String] = Source.fromFile(ruta).getLines()
    while(iterator.hasNext){
      println(iterator.next())
    }
  }

}
