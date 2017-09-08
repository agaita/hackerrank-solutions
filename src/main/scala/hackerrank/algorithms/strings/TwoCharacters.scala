package hackerrank.algorithms.strings

/**
  * Created by agaita on 9/8/17.
  */
object TwoCharacters extends App {
  val sc = new java.util.Scanner(System.in)
  val len = sc.nextInt
  val string = sc.next.toList
  val combinations = string.distinct.combinations(2).map(_.toSet)
  val possibleSolutions = combinations.map(s => string.filter(s).mkString)
  val alternatingStrings = possibleSolutions.filter(!_.sliding(2).map(_.distinct).exists(_.length == 1))
  val bestSolutionLength = if (alternatingStrings.nonEmpty) alternatingStrings.maxBy(_.length).mkString.length else 0
  println(bestSolutionLength)
}
