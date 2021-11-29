package ScalaTutorial

object OOPBasics extends App {
  val student = new Student("ABC", 22)
  println(student.age)  //22
  student.sayHi("XYZ")    //Hi XYZ
  student.sayHi()   //Hi

  println(student.isAlive())
  println(student isAlive())  //Both are equivalent

  println(student.apply())
  println(student())          //quivalent -> objectName() searches for apply() method inside class
}

class Student(name: String, val age: Int){
    val x = 2 // variables declared as var / val are called FIELDS , they can be acessed by .

    def sayHi(name: String): Unit = println(s"Hi $name")

    //func overloading -> func with same name but different signature
    def sayHi(): Unit = println("Hi")
    //SYNTATIC SUGAR
    def isAlive(): Boolean = true

    def apply(): String = s"Hi , I'm $name and I'm $age yearls old"
}
