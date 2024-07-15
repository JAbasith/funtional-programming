case class Book(val title: String,val author: String,val isbn: String)

var books: Set[Book] = Set()

object Library{
	def addBook(book: Book): Unit={
		books += book
		println(s"Book added: ${book.title}")
	}
	
	def removeBook(isbn: String): Unit={
		if(books.exists(_.isbn == isbn)){
			books = books.filterNot(_.isbn == isbn)
			println(s"Book with ISBN $isbn removed.")
		}
		else{
			println("Book is not found")
		}
	}
	
	def listBooks(): Unit = {
		if (books.isEmpty) {
			println("No books in the library.")
		} 
		else {
		      	println("Books in the library:")
		      	books.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))
		}
	}
	
	def listByAuthor(author: String): Unit = {
    val foundBooks = books.filter(_.author.equalsIgnoreCase(author))
    if (foundBooks.nonEmpty) {
      println(s"Books by $author:")
      foundBooks.foreach(book => println(s"${book.title} (ISBN: ${book.isbn})"))
    } else {
      println(s"No books found by author '$author'.")
    }
  }
	
	def searchByTitle(title: String): Unit = {
    val foundBooks = books.filter(_.title.equalsIgnoreCase(title))
    if (foundBooks.nonEmpty) {
      foundBooks.foreach(book => println(s"Found book: ${book.title} by ${book.author} (ISBN: ${book.isbn})"))
    } else {
      println(s"No book found with title '$title'.")
    }
  }
  	
	def main(args: Array[String]): Unit={
		addBook(Book("1984", "George Orwell", "9780451524935"))
		addBook(Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"))
		addBook(Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"))
		addBook(Book("Pride and Prejudice", "Jane Austen", "9781503290563"))
		addBook(Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488"))
		
		println("****************************************************************")
		
		listBooks()
		println("****************************************************************")
		
		removeBook("9780316769488")
		removeBook("9780743273565")
		removeBook("97807432735")
			println("****************************************************************")
		
		listBooks()
		
		println("****************************************************************")
		
		searchByTitle("1984")
		searchByTitle("The Great Gatsby")
		
		println("****************************************************************")
		
		listByAuthor("Jane Austen")
		listByAuthor("J.K Rowling")
		
	}
}
