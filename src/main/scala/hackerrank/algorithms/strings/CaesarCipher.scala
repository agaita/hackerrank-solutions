package hackerrank.algorithms.strings

/**
  * Created by agaita on 9/8/17.
  */
object CaesarCipher extends App {
  val sc = new java.util.Scanner(System.in)
  val len = sc.nextInt
  val string = sc.next
  val number = sc.nextInt

  println(string.map(char => encrypt(char, number)))

  private def encrypt(char: Char, k: Int): Char = {
    val baseChar = if (char.isLower) 'a' else 'A'
    if (!char.isLetter) char
    else ((char - baseChar + k) % 26 + baseChar).toChar
  }
}
