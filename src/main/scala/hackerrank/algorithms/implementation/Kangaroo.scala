package hackerrank.algorithms.implementation

/**
  * Created by agaita on 8/26/17.
  */
object Kangaroo extends App {
  val sc = new java.util.Scanner(System.in)
  val x1 = sc.nextInt
  val v1 = sc.nextInt
  val x2 = sc.nextInt
  val v2 = sc.nextInt
  sc.close()

  if (v1 <= v2) println("NO")
  else {
    val positionDiff = (x1 - x2).abs
    val velocityDiff = (v1 - v2).abs
    if (positionDiff % velocityDiff == 0) println("YES")
    else print("NO")
  }
}
