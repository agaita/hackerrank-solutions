package hackerrank.algorithms.implementation

import java.util.Scanner

/**
  * Created by agaita on 8/26/17.
  */
object AppleAndOrange extends App {
  val stdin = new Scanner(System.in)
  val leftHouseCoord = stdin.nextInt()
  val rightHouseCoord = stdin.nextInt()
  val appleTreeCoord = stdin.nextInt()
  val orangeTreeCoord = stdin.nextInt()
  val amountOfApples = stdin.nextInt()
  val amountOfOranges = stdin.nextInt()
  val apples = (1 to amountOfApples).map(_ => stdin.nextInt())
  val oranges = (1 to amountOfOranges).map(_ => stdin.nextInt())
  stdin.close()

  val fallenApples = apples.count(apple => fruitIsInRange(apple, appleTreeCoord))
  val fallenOranges = oranges.count(orange => fruitIsInRange(orange, orangeTreeCoord))
  println(s"$fallenApples\n$fallenOranges")

  private def fruitIsInRange(fruit: Int, tree: Int) = {
    val fruitPosition = tree + fruit
    fruitPosition >= leftHouseCoord && fruitPosition <= rightHouseCoord
  }
}
