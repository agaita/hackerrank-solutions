package hackerrank.algorithms.sorting

/**
  * Created by agaita on 8/26/17.
  */
object BigSorting extends App {
  private val sc = new java.util.Scanner(System.in)
  private val n = sc.nextInt
  private val numbers = (1 to n).map(_ => StringWithOrdering(sc.next()))
  sc.close()
  numbers.sorted.foreach(s => println(s.s))


  case class StringWithOrdering(s: String) extends Ordered[StringWithOrdering] {
    override def compare(that: StringWithOrdering): Int = {
      if(s.length() > that.s.length()) return 1
      if(s.length() < that.s.length()) return -1

      for(i <- 0 until s.length) {
        if (s.charAt(i).toInt > that.s.charAt(i).toInt) return 1
        if (s.charAt(i).toInt < that.s.charAt(i).toInt) return -1
      }

      0
    }
  }
}
