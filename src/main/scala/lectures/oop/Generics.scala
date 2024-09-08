package lectures.oop

object Generics extends App{

  class MyList[+ A] {
    def add[B >:A](element:B) : MyList[B] = {
      ???
    }

    /**
     * A = Cat
     * B = Animal
     */
  }

  class MyMap[Key, Value]
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  // generic methods

  object MyList {
    def empty[A]: MyList[A] = ???

  }
  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  class CovariantList [+A]
  val animal: Animal = new Cat

  val animalList:CovariantList[Animal] = new CovariantList[Cat]
  // Can I add any animal to animalList ??? Like dog ??? Hard Question => We return Animal

  // 2. No == Invariance
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Hell, No Contravariant
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // Bounded Types
  // This is Upper bounded types
  class Cage[A <:Animal](val Animal: A)
  val cage = new Cage(new Dog)

  class Car
  //val newCage = new Cage(new Car)


}
