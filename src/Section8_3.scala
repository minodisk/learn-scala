object Section8_3 {

  def main(args: Array[String]) {
    var increase = (x: Int) => x + 1
    println(increase(10))

    increase = (x: Int) => x + 9999
    println(increase(10))

    increase = (x: Int) => {
      println("We")
      println("are")
      println("here!")
      x + 1
    }
    println(increase(10))

    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => println(x))
    someNumbers.foreach((x) => println(x))
    someNumbers.foreach(x => println(x))
    someNumbers.foreach(println _)
    someNumbers.foreach(println)

    println(someNumbers.filter((x: Int) => x > 0))
    println(someNumbers.filter((x) => x > 0))
    println(someNumbers.filter(x => x > 0))
    println(someNumbers.filter(_ > 0))

    val f = (_: Int) + (_: Int)
    println(f(5, 10))

    def sum(a: Int, b: Int, c: Int) = a + b + c

    println(sum(1, 2, 3))

    val a = sum _
    println(a(1, 2, 3))

    val b = sum(1, _: Int, 3)
    println(b(2))
  }

}