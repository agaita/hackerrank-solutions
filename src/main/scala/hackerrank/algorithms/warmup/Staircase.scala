package hackerrank.algorithms.warmup

/**
  * Created by agaita on 8/24/17.
  */
object Staircase extends App {
  val n = io.Source.stdin.getLines().toList.head.toInt
  (1 to n).foreach(i => println(step(i, n)))

  private def step(i: Int, n: Int) = " " * (n - i) + "#" * i
}
