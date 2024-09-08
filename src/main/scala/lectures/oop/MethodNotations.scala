package lectures.oop

import scala.annotation.targetName

object MethodNotations extends App{

  class Person(val name: String, favouriteMovie:String){
    def likes(movie: String): Boolean = movie == favouriteMovie


    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String =s"${name}, what the heck"
    def isAlive: Boolean = true
    def apply() : String = s"Hi my name is ${name} and I like ${favouriteMovie}"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infix notation = operation notation // this can be used in  methods with only one parameter

  // "operators" in scala

  val tom = new Person("Tom", "Fight Club")
  //println(mary hangOutWith tom)
  println(mary + tom)
  //println(mary.likes +(tom))
  // Also we can rename the method hangOutWith to be +
  
  // ALL OPERATORS ARE METHODS IN SCALA 
  
  // prefix notation 
  
  val x = -1 // equivalent with 1.unary_-
  val z = +1
  
  val y = -1
  
  // unary _prefix only works with - + ~ !
  println(!mary)
  println(mary.unary_!)
  println(mary.isAlive)
  // This is rarely used in real world println(mary isAlive)

  // apply method
  println(mary.apply())
  println(mary())

}
