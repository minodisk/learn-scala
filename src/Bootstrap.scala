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
    run6_7
    run6_8
    run6_9
  }

  def run6_5 = {
    println("§6.5")

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    val result = oneHalf + twoThirds
    println(result)

    val r = new Rational(1, 2)
    println(r.numer)
    println(r.denom)
  }

  def run6_6:Unit = {
    println("§6.6")

    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf lessThan twoThirds)
    println(twoThirds lessThan oneHalf)
    println(oneHalf max twoThirds)
  }

  def run6_7 = {
    println("§6.7")

    val y = new Rational(3)
    println(y)
  }

  def run6_8 = {
    println("§6.8")

    println(new Rational(66, 42))
  }

  def run6_9 = {
    println("§6.9")

    val x = new Rational(1, 2)
    val y = new Rational(2, 3)
    println(x + y)
    println(x.+(y))
    println(x + x * y)
    println((x + x) * y)
    println(x + (x * y))
  }

}
