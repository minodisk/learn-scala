object Section9_2 {

  def main(args:Array[String]) {

    println(containsNeg(List(0, -1, -2)))
    println(containsNeg2(List(0, -1, -2)))
    println(containsOdd(List(0, 1, 2)))
    println(containsOdd2(List(0, 1, 2)))

  }

  def containsNeg(nums:List[Int]):Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }

  def containsNeg2(nums:List[Int]):Boolean =
    nums.exists(_ < 0)

  def containsOdd(nums:List[Int]):Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }

  def containsOdd2(nums:List[Int]):Boolean =
    nums.exists(_ % 2 == 1)

}
