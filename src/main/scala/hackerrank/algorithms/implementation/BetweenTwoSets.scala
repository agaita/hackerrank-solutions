package hackerrank.algorithms.implementation

import java.util.Scanner

/**
  * Created by agaita on 9/7/17.
  */
object BetweenTwoSets extends App {
  val sc = new Scanner(System.in)
  val aLength = sc.nextInt
  val bLength = sc.nextInt
  val a = (1 to aLength).map(_ => sc.nextInt)
  val b = (1 to bLength).map(_ => sc.nextInt)
  val numbersBetween = (a.max to b.min).map(x => {
    if (satisfiesA(x, a) && satisfiesB(x, b)) 1
    else 0
  }).sum

  println(numbersBetween)

  private def satisfiesA(x: Int, a: Seq[Int]) = a.forall(i => x % i == 0)

  private def satisfiesB(x: Int, b: Seq[Int]) = b.forall(i => i % x == 0)
}
