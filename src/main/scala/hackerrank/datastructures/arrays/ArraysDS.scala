package hackerrank.datastructures.arrays

/**
  * Created by agaita on 8/27/17.
  */
object ArraysDS extends App {
  private val sc = new java.util.Scanner(System.in)
  private val n = sc.nextInt()
  private val reversedString = (1 to n).map(_ => sc.next()).reverse.mkString(" ")
  sc.close()
  println(reversedString)
}
