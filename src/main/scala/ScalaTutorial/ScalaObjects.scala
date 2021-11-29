package ScalaTutorial

object ScalaObjects extends App {
  class Person{

  }
  object Person{
    val N_EYES = 2
    def canFly(): Boolean = false
  }

  //PROCESS OF DEFINING CLASS AND OBJECT WITH THE SAME NAME IN THE SAME SCOPE -> COMPANION
  //INSTEAD OF STATIC -> OBJECT IS USED IN SCALA
  println(Person.N_EYES)  //  2
  println(Person.canFly())  //false


  //SCALA OBJECTS ARE SINGLETON -> ONE AND ONLY INSTANCE
  val a = Person
  val b = Person
  println(a == b)   //true

  val c = new Person
  val d = new Person
  println(c == d)     //false
}
