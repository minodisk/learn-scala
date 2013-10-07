object Test07 {

  def main(args: Array[String]) {
    println(multiTable())
  }

  def multiTable() =
    multiTableSeq().mkString("\n")

  def multiTableSeq() =
    for (row <- 1 to 10) yield makeRow(row)

  def makeRow(row:Int) =
    makeRowSeq(row).mkString(" ")

  def makeRowSeq(row:Int) = {
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (3 - prod.length)
      padding + prod
    }
  }

}
