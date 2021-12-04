package ScalaTutorial

object HigherOrderFunctions extends App {
  //HOF are functions which take functions as parameters or return functions.
  // In scala , Functions are treated as first class objects
  def doubler:Int => Int = x => x * 2
  println(doubler(54))

  //map
  val numbers: List[Int] = List(1,3,5)
  println(numbers.map(x => x + 1))

}
