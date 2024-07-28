package lectures.oop

object OOBasics extends App {
  val person = new Person("John", 21)
  println(person.age)
  println(person.x)
  person.greet("Daniel")
  person.greet()
}

// constructor
class Person(val name: String, val age: Int) {

  // body

  // this is a filed
  val x = 2

  println(1+3)

  def greet(name: String): Unit = println(s"$name says: Hi, ${this.name}")
  // Overloading
  def greet() : Unit = println(s"Hi, I am ${name}")

  // multiple constructors auxillary parameters
  def this(name: String)= this(name, 0)
}

