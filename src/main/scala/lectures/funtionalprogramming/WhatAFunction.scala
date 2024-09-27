package lectures.funtionalprogramming

object WhatAFunction extends App{
  //The whole purpose of functional programming is to use function as first class citizens
  // problem: We come from object oriented programming
  val doubler = new MyFunction[Int, Int] {
    override def apply(element:  Int): Int = element * 2
  }
  println(doubler(2))

  // scala supports this function types  function types = Function[A, B]
  val stringToIntConverter = new Function[String, Int] {
    override def apply(string: String) : Int = string.toInt
  }
  // By default scala supports these function type of 22 parameters
  println(stringToIntConverter("3")+ 4)

  val adder:((Int,Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a:Int, b:Int): Int = a + b
  }

  // Function types Function2[A,B,R] ==== this is the syntatic sugar (A,B) => R  R is the return type

  // MAJOR TAKEAWAYS --> ALL SCALA FUNCTIONS ARE OBJECTS, OR INSTANCES of classes derived form function1, function1 etc.
  // The JVM was designed with object oriented programming in mind

  /** Exercise
   * 1. A function which takes 2 string and concatenates them
   * My List implementation and MyTransformer into function types
   * define a function which takes an argument as an Int and return another function which takes an int
   * -- how to do it.
   */
  val concatenateString = new Concatenator[String] {
    override def concatenate(a: String, b: String): String = a+b

  }
  println(concatenateString.concatenate("Hello", "World"))
}
//This is how JVM was structured
trait MyFunction[A, B] {
  def apply(element:A):B

}
trait Concatenator[A] {
  def concatenate(a:A, B:A) : A
}
