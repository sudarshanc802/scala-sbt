package ScalaTutorial

import scala.annotation.tailrec

object ScalaBasics extends App {
  println("Hello World!")

  val x: Int = 5 // Immutable
  var y: Double = 6 //Mutable - vars can be changed
  y = 5
  println(y)

  //EXPRESSION - everything in scala is an EXPRESSION
  val a = true
  val b = if (5 > 3) 5 else 3

  //FUNCTIONS
  def aFunc(a: Int, b: Int): Int = a + b

  //RECURSSION
  def Factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * Factorial(n - 1)
  }

  println(Factorial(5))

  //tail - recurssion
  @tailrec
  def stringConcat(str: String, n: Int, concatString: String): String = {
    if (n == 0) concatString
    else stringConcat(str, n - 1, concatString + str)
  }

  println(stringConcat("abc", 3, ""))


  //CALL BY VALUE VS CALL BY REFERENCE
  def divideByZero: Int = 3/0

  def someRandomFunc(a: Int , b: => Int): Int = a

  println(someRandomFunc(1, divideByZero))  // output : 1

  println(someRandomFunc(divideByZero, 1))  // output : java.lang.ArithmeticException: / by zero

}
