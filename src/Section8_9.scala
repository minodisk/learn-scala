object Section8_9 {

  def main(args: Array[String]) {

    //    def boom(x:Int):Int =
    //      if (x == 0) throw new Exception("boom!")
    //      else boom(x - 1) + 1
    //    boom(3)

    def bang(x: Int): Int =
      if (x == 0) throw new Exception("bang!")
      else bang(x - 1)
    bang(5)



  }

}
