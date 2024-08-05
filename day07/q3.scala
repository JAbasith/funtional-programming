object FilterPrime {
  def filterPrimeNumber(nums: List[Int]): List[Int] = {
    nums.filter(number => {
      if (number <= 1) {
        false
      } 
      else if (number == 2) {
        true
      } 
      else if (number % 2 == 0) {
        false
      } 
      else {
        val sqrtNumber = Math.sqrt(number).toInt
        var isPrime = true
        for (i <- 3 to sqrtNumber) {
          if (number % i == 0) {
            isPrime = false
          }
        }
        isPrime
      }
    })
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 18,13,27)
    val output = filterPrimeNumber(input)
    println(output)
  }
}
