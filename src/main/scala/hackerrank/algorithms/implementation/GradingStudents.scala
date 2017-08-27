package hackerrank.algorithms.implementation

/**
  * Created by agaita on 8/26/17.
  */
object GradingStudents extends App {
  val grades = io.Source.stdin.getLines().toList.tail.map(_.toInt)
  val rounded = grades.map(roundGrade)
  println(rounded.mkString("\n"))

  private def roundGrade(grade: Int) = {
    val nextMultipleOfFive = if(grade % 5 == 0) (grade / 5) * 5 else ((grade / 5) + 1) * 5
    if(nextMultipleOfFive - grade < 3 && grade >= 38) nextMultipleOfFive else grade
  }
}
