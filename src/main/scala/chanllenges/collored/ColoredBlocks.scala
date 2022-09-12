package chanllenges.collored

import cats.effect.unsafe.implicits.global
import doodle.core.Color
import doodle.image.Image
import doodle.image.syntax.all.ImageOps
import doodle.java2d.{Algebra, Canvas, Drawing, Frame}

import scala.annotation.tailrec

object ColoredBlocks {
  // The block used to create the stack of blocks
  val block = Image.square(40).fillColor(Color.crimson)

  // Example showing how to create a stack of blocks
  val stack = block.above(block.above(Image.empty))

  @tailrec
  def helper(count: Int, image: Image): Image = {
    count match {
      case 0 => image
      case _ => helper(count - 1, block.above(image))
    }
  }

  def stack(count: Int): Image = {
    helper(count, Image.empty)
  }

  def main(args: Array[String]): Unit = {
    stack(5).draw[Algebra, Drawing, Frame, Canvas]()
  }

}
