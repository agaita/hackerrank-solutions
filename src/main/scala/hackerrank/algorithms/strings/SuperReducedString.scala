package hackerrank.algorithms.strings

import java.util.Scanner

import scala.collection.immutable.Stack

/**
  * Created by agaita on 9/8/17.
  */
object SuperReducedString extends App {
  val sc = new Scanner(System.in)
  val string = sc.next
  sc.close()

  var stack = Stack[Char]()
  string.foreach(char => {
    if (stack.nonEmpty && stack.head == char) stack = stack.tail
    else stack = stack.push(char)
  })

  val stringInStack = stack.reverse
  if (stringInStack.isEmpty) println("Empty String")
  else stringInStack.foreach(print)
}
