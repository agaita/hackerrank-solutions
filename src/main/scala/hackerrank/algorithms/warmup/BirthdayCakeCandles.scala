package hackerrank.algorithms.warmup

/**
  * Created by agaita on 8/26/17.
  */
object BirthdayCakeCandles {

  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int = {
    val tallestCandle = TallestCandle()
    ar.foldLeft(tallestCandle)((tallestCandle, candleHeight) => tallestCandle.getTallerCandle(candleHeight)).amount.toInt
  }

  private case class TallestCandle(height: Long = 0, amount: Long = 0) {
    def getTallerCandle(candleHeight: Long): TallestCandle = {
      if (height == candleHeight) TallestCandle(height, amount + 1)
      else if (height < candleHeight) TallestCandle(candleHeight, 1)
      else this
    }
  }

}
