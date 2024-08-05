object CalculateSqure{
	def calculateSquare(nums: List[Int]): List[Int] = {
		nums.map(nums => nums * nums)
	}

	def main(args : Array[String]): Unit={
		val input = List(1,2,3,4,5)
		val output = calculateSquare(input)
		println(output)
	}
}
