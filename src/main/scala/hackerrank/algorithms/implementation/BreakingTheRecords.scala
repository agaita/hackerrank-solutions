package hackerrank.algorithms.implementation

import java.util.Scanner

/**
  * Created by agaita on 9/7/17.
  */
object BreakingTheRecords extends App {
  val sc = new Scanner(System.in)
  val range = 1 until sc.nextInt
  val initialScore = sc.nextInt
  val initialRecordsBreak = RecordsBreak(Records(initialScore, initialScore))
  val recordsBreak = range.map(_ => sc.nextInt).foldLeft(initialRecordsBreak)((rb, score) => rb.newGame(score))
  sc.close()

  println(s"${recordsBreak.highScoreBreaks} ${recordsBreak.lowScoreBreaks}")

  case class RecordsBreak(records: Records, lowScoreBreaks: Int = 0, highScoreBreaks: Int = 0) {
    def newGame(score: Int): RecordsBreak = {
      if (score < records.lowScore) RecordsBreak(Records(score, records.highScore), lowScoreBreaks + 1, highScoreBreaks)
      else if (score > records.highScore) RecordsBreak(Records(records.lowScore, score), lowScoreBreaks, highScoreBreaks + 1)
      else this
    }
  }

  case class Records(lowScore: Int, highScore: Int)
}
