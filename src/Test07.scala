object Test07 {

  def main(args: Array[String]) {

    val a = 1;
    {
      val a = 2
      println(a)
    }
    println(a)

    println(multiTable())
  }

  def multiTable() = {
    val tableSeq =
      for (row <- 1 to 10)
      yield makeRow(row)
    tableSeq.mkString("\n")
  }

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
