object CaesarCipher{
	def encryption(word: String): String={
		word.toLowerCase.map{
			case ' ' => ' '
			case 'z' => 'a'
			case c if c >= 'a' && c < 'z' => (c.toInt + 1).toChar
			case c => c
		}
	}
		
	def decryption(eWord: String): String={
		eWord.toLowerCase.map{
			case ' ' => ' '
			case 'a' => 'z'
			case c if c > 'a' && c <= 'z' => (c.toInt - 1).toChar
			case c => c
		}
	}
	

	def main(args: Array[String]): Unit = {
		val encrypted = encryption("hello")
		println("Encrypted: "+encrypted)
		val decrypted = decryption("ifmmp")
		println("Decrypted: "+decrypted)
		
	}
}
