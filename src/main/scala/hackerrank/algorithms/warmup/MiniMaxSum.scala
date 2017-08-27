package hackerrank.algorithms.warmup

/**
  * Created by agaita on 8/24/17.
  */
object MiniMaxSum extends App {
  implicit val ordering = Ordering.Int
  val numbers = io.Source.stdin.getLines().toList.head.split(" ").map(_.toInt).sorted
  private val min = numbers.init.sum
  private val max = numbers.tail.sum
  println(s"$min $max")
}
