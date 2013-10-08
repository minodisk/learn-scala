import java.io.File

object Section9_1 {

  def main(args: Array[String]) {

    println("filesEnding ->")
    for (file <- FileMatcher.filesEnding(".iml"))
      println("  " + file.getName)

    println("filesContaining ->")
    for (file <- FileMatcher.filesContaining("git"))
      println("  " + file.getName)

    println("filesRegex ->")
    for (file <- FileMatcher.filesRegex(""".*rc.*"""))
      println("  " + file.getName)

  }

}

object FileMatcher {

  private def filesHere = new File(".").listFiles

  def filesMatching(matcher:(String)=>Boolean) =
    for (
      file <- filesHere
      if matcher(file.getName)
    ) yield {
      file
    }

  def filesEnding(query:String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query:String) =
    filesMatching(_.contains(query))

  def filesRegex(query:String) =
    filesMatching(_.matches(query))

//  def filesEnding(query:String) =
//    for (
//      file <- filesHere
//      if file.getName.endsWith(query)
//    ) yield {
//      file
//    }
//
//  def filesContaining(query:String) =
//    for (
//      file <- filesHere
//      if file.getName.contains(query)
//    ) yield {
//      file
//    }
//
//  def filesRegex(query:String) =
//    for (
//      file <- filesHere
//      if file.getName.matches(query)
//    ) yield {
//      file
//    }

}
