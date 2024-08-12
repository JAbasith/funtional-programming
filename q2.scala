object PatternMaching{
	def patternMatching(num: Int): Unit={
		val multipleOfthree: Boolean = num % 3 == 0
		val multipleOfFive: Boolean = num % 5 == 0
		
		if(multipleOfthree && multipleOfFive){
			println("Multiple of Both Three and Five")
		}
		else if(multipleOfthree){
			println("Multiple of Three")
		}
		else if(multipleOfFive){
			println("Multiple of Five")
		}
		else{
			println("Not a Multiple of Three or Five")
		}
	}

	def main(args: Array[String]): Unit={
		patternMatching(15)
	}
}
