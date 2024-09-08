package exercises.oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name:String, favouriteMovie:String, val age:Int){
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    // overloaded method
    def + (person:Person, job:String) = s"${this.name} is a $job "

    def +(nickName:String):Person = new Person(s"$name($nickName)", favouriteMovie, age)

    def unary_+ : Person = new Person(name,favouriteMovie, age+1)

    def learns(): String = s"${this.name} learns scala"
    def apply() : String = s"Hi my name is ${name} and I like ${favouriteMovie}"
    def apply(number:Int) : String = s"Hi my name is ${name} and I have watched movies $number times"
    def learnsScala: String = learns()
  }

  val mary = new Person("Mary" , "Bahubali", 21)
  println((mary + "The rockstar").apply())
  println(+mary.age)
  // use in postfix notation
  println(mary learnsScala)
  println(mary.apply(2))
  println(mary(10))


}
