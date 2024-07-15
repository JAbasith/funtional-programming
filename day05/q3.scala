object Fibonacci {
    def fibonacci(n: Int): Int = {
        if (n <= 0) 0
        else if (n == 1) 1
        else fibonacci(n - 1) + fibonacci(n - 2)
    }


    def printFibonacciNumbers(n: Int): Unit = {
        if (n <= 0) {
            println("Please enter a positive integer.")
        } else {
            for (i <- 0 until n) {
                print(s"${fibonacci(i)} ")
            }
            println()
        }
    }

    def main(args: Array[String]): Unit = {
        print("Enter a number : ")
        var num = scala.io.StdIn.readInt()
        printFibonacciNumbers(num)
    }
}
