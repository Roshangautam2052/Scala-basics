package lectures.oop

object AnonymousClass extends App{
  abstract class Animal{
    def eat : Unit

  }
  // Here this seems like we are instantiating an abstract class
  // but this is a Anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("Ahahahahhaa")
  }

  /** equivalent to
   * class AnonymousClasses$$$$ extends Animal {
   * override def eat: Unit = println("ahahaha")
   */

  println(funnyAnimal.getClass)

  class Person(name:String) {
    def sayHi: Unit = println(s"Hi my name is $name., how can I help you")
  }

  /**
   * The anonymous class works well both with Abstract and non-Abstract classes
   */
  val jim = new Person("Jim")  {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service")
  }

  /**
   * The  Takeways are
   * We can instantiate types and override fiels or methods on the spot
   * Rules pass in required constructor arguments if needed
   * implement all abstract fields/ methods
   * Works for traits and classes(abstract or not)
   */
}
