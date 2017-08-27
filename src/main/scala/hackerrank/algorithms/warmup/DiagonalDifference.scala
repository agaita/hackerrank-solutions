package hackerrank.algorithms.warmup

/**
  * Created by agaita on 8/24/17.
  */
object DiagonalDifference extends App {
  val lines = io.Source.stdin.getLines().toList
  val n = lines.head.toInt
  val matrix = lines.tail.toArray.map(_.split(" ").map(_.toInt))

  var diff = 0
  (0 until n).foreach {
    i =>
      val downwardsDiagonal = matrix(i)(i)
      val upwardsDiagonal = matrix(i)(n - i - 1)
      diff += downwardsDiagonal - upwardsDiagonal
  }

  println(diff.abs)
}
