object Section12_1 {
  def main(args:Array[String]) {
    println(new Point(1, 2))
    println(new Rectangle(new Point(1, 2), new Point(10, 10)))

    val half = new Rational(1, 2)
    val third = new Rational(1, 3)
    println(half < third)
    println(half > third)
    println(half == third)
  }
}

class Point(val x:Int, val y:Int) {
  override def toString = "(" + x + ", " + y + ")"
}

trait Rectangular {
  def topLeft:Point
  def bottomRight:Point
  def left = topLeft.x
  def right = bottomRight.x
  def top = topLeft.y
  def bottom = bottomRight.y
  def width = right - left
  def height = bottom - top
  override def toString = "(" + topLeft.toString + ", " + bottomRight.toString + ")"
}

abstract class Component extends Rectangular {

}

class Rectangle(val topLeft:Point, val bottomRight:Point) extends Rectangular {

}
