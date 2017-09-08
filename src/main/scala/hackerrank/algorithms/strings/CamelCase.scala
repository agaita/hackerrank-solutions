package hackerrank.algorithms.strings

import java.util.Scanner

/**
  * Created by agaita on 9/8/17.
  */
object CamelCase extends App {
  val sc = new Scanner(System.in)
  val string = sc.next
  sc.close()

  private val words = string.foldLeft(1L)((wordsCount, char) => if (char.isUpper) wordsCount + 1 else wordsCount)
  println(words)
}
