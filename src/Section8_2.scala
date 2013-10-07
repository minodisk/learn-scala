import scala.io.Source

object Section8_2 {

  def main(args: Array[String]) {
    progressFile("resource/lorem_ipsum.txt", 100)
  }

  def progressFile(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines()) processLine(line)
  }


}
