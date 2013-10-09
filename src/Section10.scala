import Element.elem

object Section10 {

  val space = elem(" ")
  val corner = elem("+")

  def main(args: Array[String]) {
    //    val ae = new ArrayElement(Array("hello", "world"))
    //    println(ae.width)
    //    println(ae)

    println(elem(Array("hello", "world")))
    println(elem(Array("hello")) above elem(Array("world!")))
    println(
      elem(Array("one", "two")) beside elem(Array("three", "four")) beside elem(Array("five", "six", "seven", "eight", "ten"))
    )

    println(spiral(6, 0))
    println(spiral(6, 1))
    println(spiral(6, 2))
    println(spiral(6, 3))
    println(spiral(11, 0))
    println(spiral(11, 1))
    println(spiral(17, 0))
    println(spiral(17, 1))
  }

  def spiral(nEdges: Int, direction: Int): Element = {
    if (nEdges == 1) corner
    else {
      val sp = spiral(nEdges - 1, (direction + 3) % 4)
      def verticalBar = elem('|', 1, sp.height)
      def horizontalBar = elem('-', sp.width, 1)
      if (direction == 0)
        (corner beside horizontalBar) above (sp beside space)
      else if (direction == 1)
        (sp above space) beside (corner above verticalBar)
      else if (direction == 2)
        (space beside sp) above (horizontalBar beside corner)
      else
        (verticalBar above corner) beside (space above sp)
    }
  }

}
