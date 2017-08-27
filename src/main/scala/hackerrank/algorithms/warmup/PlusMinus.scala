package hackerrank.algorithms.warmup


/**
  * Created by agaita on 8/24/17.
  */
object PlusMinus extends App {
  val lines = io.Source.stdin.getLines().toList
  val n = lines.head.toInt
  val numbers = lines.last.split(" ").map(_.toInt)
  private val initialValues = NumbersFrequency(0, 0, 0)
  private val frequencies = numbers.foldLeft(initialValues)((values, newValue) => values.incrementNumbersFrequency(newValue))
  println(f"${frequencies.positives.toDouble / n}%1.5f")
  println(f"${frequencies.negatives.toDouble / n}%1.5f")
  println(f"${frequencies.zeroes.toDouble / n}%1.5f")

  private case class NumbersFrequency(positives: Int, negatives: Int, zeroes: Int) {
    def incrementNumbersFrequency(newValue: Int): NumbersFrequency = {
      if (newValue > 0) NumbersFrequency(positives + 1, negatives, zeroes)
      else if (newValue < 0) NumbersFrequency(positives, negatives + 1, zeroes)
      else NumbersFrequency(positives, negatives, zeroes + 1)
    }
  }

}
