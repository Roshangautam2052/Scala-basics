package lectures.part2oop

object AbstractDataTypes extends App {

  // classes which contains unimplemetned methods are called abstract methods
  // they can have abstract types and non abstract members
  // abstract class cannot be instantiated

  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }

  //val animal = new Animal

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    def eat: Unit = println("crunch crunch")
  }

  // traits

  // they are created by using keyword trait and are like abstract fields and methods
  // they can have abstract types and non abstract members
  // they don't have constructor parameters, and this can be implemented by multiple members
  // traits are behaviours, abstract class is a type of thing
  //abstract classes they can be inherited among classes

  trait Carnivore {
    def eat(animal: Animal): Unit
  }
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(
      s"I am a croc and I am eating ${animal.creatureType}"
    )

  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)
}
