import java.io.File

object Section9_1 {

  def main(args: Array[String]) {

    for (file <- FileMatcher.filesEnding(".iml"))
      println(file.getName)

  }

}

object FileMatcher {

  private def filesHere = new File(".").listFiles

  def filesEnding(query:String) =
    for (
      file <- filesHere
      if file.getName.endsWith(query)
    ) yield {
      file
    }

  def filesContaining(query:String) =
    for (
      file <- filesHere
      if file.getName.contains(query)
    ) yield {
      file
    }

}
