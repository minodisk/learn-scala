object Section8_7 {

  def main(args:Array[String]) {

    var more = 1
    val addMore = (x:Int) => x + more
    println(addMore(10))
    more = 9999
    println(addMore(10))

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    var sum = 0
    someNumbers.foreach(sum += _)
    println(sum)

    def makeIncrease(more:Int) = (x:Int) => x + more
    val inc1 = makeIncrease(1)
    val inc9999 = makeIncrease(9999)
    println(inc1(10))
    println(inc9999(10))

  }

}
