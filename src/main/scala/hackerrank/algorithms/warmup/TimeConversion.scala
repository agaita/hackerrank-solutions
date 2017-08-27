package hackerrank.algorithms.warmup

/**
  * Created by agaita on 8/26/17.
  */
object TimeConversion extends App {
  private val time = io.Source.stdin.bufferedReader().readLine()
  private val splittedTime = time.split(":")
  private val hours = splittedTime(0).toInt
  private val minutes = splittedTime(1)
  private val seconds = splittedTime(2).substring(0, 2)
  private val isAM = splittedTime(2).substring(2, splittedTime(2).length).toUpperCase == "AM"
  private val realHours = if (hours == 12) 0 else hours
  private val hoursShift = if (isAM) 0 else 12
  println(s"${prefixZeroToTime(realHours + hoursShift)}:$minutes:$seconds")

  def prefixZeroToTime(time: Int): String = if (time < 10) s"0$time" else time.toString
}
