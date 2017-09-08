package hackerrank.algorithms.implementation

import java.util.Scanner

/**
  * Created by agaita on 9/7/17.
  */
object DivisibleSumPairs extends App {
  val sc = new Scanner(System.in)
  val length = sc.nextInt
  val k = sc.nextInt
  val numbers = (1 to length).map(_ => sc.nextInt)
  sc.close()

  var count = 0
  for (i <- 0 until length) {
    for (j <- (i + 1) until length) {
      if ((numbers(i) + numbers(j)) % k == 0) count += 1
    }
  }

  println(count)
}
