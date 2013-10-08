import java.io.{File, PrintWriter}
import java.util.Date

object Section9_3 {

  def main(args: Array[String]) {

    def plainOldSum(x: Int, y: Int) = x + y
    println(plainOldSum(1, 2))

    def curriedSum(x: Int)(y: Int) = x + y
    println(curriedSum(1)(2))

    def onePlus = curriedSum(1) _
    println(onePlus(2))

    def twoPlus = curriedSum(2) _
    println(twoPlus(2))


    def twice(op: Double => Double, x: Double) = op(op(x))
    println(twice(_ + 1, 5))

    def withPrintWriter(file: File, op: PrintWriter => Unit) {
      val writer = new PrintWriter(file)
      try {
        op(writer)
      } finally {
        writer.close()
      }
    }
    withPrintWriter(
      new File("resources/date.txt"),
      _.println(new Date)
    )

    def withPrintWriter2(file: File)(op: PrintWriter => Unit) {
      val writer = new PrintWriter(file)
      try {
        op(writer)
      } finally {
        writer.close()
      }
    }
    withPrintWriter2(new File("resources/date.txt"))(_.println(new Date))
    withPrintWriter2(new File("resources/date.txt")) {
      _.println(new Date)
    }


    var assertionsEnabled = true
    def myAssert(predicate: () => Boolean) =
      if (assertionsEnabled && !predicate())
        throw new AssertionError
    myAssert(() => 5 > 3)

    def byNameAssert(predicate: => Boolean) =
      if (assertionsEnabled && !predicate)
        throw new AssertionError
    byNameAssert(5 > 3)

  }

}
