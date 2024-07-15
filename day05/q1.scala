import scala.io.StdIn.readLine

object InventoryManagement{
	
	def getProductList(): List[String]={
		var products : List[String] = List.empty
		var x = true
		while(x){
			val input = readLine("Enter product name (to stop enter 'done'): ")
			if(input.toLowerCase == "done"){
				x = false	
			}
			else{
				products = products :+ input
			}
		}
		
		products
	}
	
	def printProductList(productList: List[String] , originalList: List[String]): Any={
		if(productList.nonEmpty){
			val head = productList.head
			val index = originalList.indexOf(head) + 1
			println(s"$index. $head")
			printProductList(productList.tail,originalList)
		}
	}
	
	def getTotalProducts(productList: List[String]): Int={
		val size = productList.length
		size
	}

	def main(args: Array[String]): Unit={
		val productList = getProductList()
		printProductList(productList,productList)
		val length = getTotalProducts(productList)
		println("Total number of products in the list: " + length )
	}
}
