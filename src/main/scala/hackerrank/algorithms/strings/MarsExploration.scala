package hackerrank.algorithms.strings

/**
  * Created by agaita on 9/8/17.
  */
class MarsExploration extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val sos = "SOS"
  val corruptedAmount = s.grouped(3).foldLeft(0)((corruptedCount, msg) => {
    msg.zip(sos).count(chars => chars._1 != chars._2) + corruptedCount
  })

  println(corruptedAmount)
}
