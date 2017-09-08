package hackerrank.algorithms.implementation

import java.util.Scanner

/**
  * Created by agaita on 9/7/17.
  */
object BirthdayChocolate extends App {
  val sc = new Scanner(System.in)
  val chocolateLength = sc.nextInt
  val chocolate = (1 to chocolateLength).map(_ => sc.nextInt)
  val d = sc.nextInt
  val m = sc.nextInt
  sc.close()

  val ways = chocolate.sliding(m).map(chunks => {
    if (chunks.par.sum == d) 1
    else 0
  }).sum

  println(ways)
}
