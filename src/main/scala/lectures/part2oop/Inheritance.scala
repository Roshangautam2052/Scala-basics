package lectures.part2oop

object Inheritance extends App{

  // single class inheritance
  // the other class only inherit from the sub class public and protected methods
  // the protected method are only accessible inside the subclass but not outside it

  class Animal{
    val creatureType = "wild"
    def eat = println("nomnom")
  }
  class Cat extends Animal{
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  /*
  Constructors
   */
  class Person(name:String, age:Int){
    def this(name:String ) = this(name, 0)
  }
  class Adult(name:String, age:Int, id:String) extends Person(name,age)
  //Overriding
  // We can override the fields directly in the constructor
  // value as a constructor parameter or as a class parameter
  class Dog(override val creatureType:String) extends Animal {
    //override val creatureType: String = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }
  val dog = new Dog("K9")
  dog.eat

  // This is polymorphism
  val unknownAnimal:Animal = new Dog("Dog")
  unknownAnimal.eat

  //Overriding and Overloading
  /*
  Overriding means creating a different implementation of a superclass method, or parameter in child class
  Overloading means where we create an existing method with same name but different parameter values  within a same class
   */

  // super is used when we want to use the method in superclass


  // preventing overrides
  // final keyword will prohibit its derived classes to inherit its methods and implementation
  // final modifier is when made in a class it cannot be inherited
  // seal the class = we can only extend a class  can be done in same file and want to be exhaustive
  // for example if we want to create an animal of only two types like cat and dog we can use the sealed keyword

}
