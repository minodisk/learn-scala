object Bootstrap {
  def main(args: Array[String]) {
    val x = new Rational(1, 3)
    println(x)
    val y = new Rational(5, 7)
    println(y)
//    val z = new Rational(5, 0)
//    println(z)

    run6_5
    run6_6
  }

  def run6_5 = {
    println("§6.5")

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    val result = oneHalf add twoThirds
    println(result)

    val r = new Rational(1, 2)
    println(r.numer)
    println(r.denom)
  }

  def run6_6 = {
    println("§6.6")

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf lessThan twoThirds)
    println(twoThirds lessThan oneHalf)
    println(oneHalf max twoThirds)
  }

}
