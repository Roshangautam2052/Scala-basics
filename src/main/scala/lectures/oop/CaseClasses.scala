package lectures.oop

object CaseClasses extends App {

  /** for normal classes we need differnet implements methods
    * equals, hashCode, toString and companion object
    */

  case class Person(name: String, age: Int) {}
  //1. class parameters are also field parameters
  val jim =  new Person("Jim", 34)
  println(jim)
  //2. sensible toString
  println(jim.toString)
  // println(instance) = println(instance.toString) // syntactic sugar
  println(jim)

  // 3. equals and hasCode are implemented out of the box
  // and this make them very useful for collection

  val jim2 = new Person("Jim", 34)
  val jim3 = new Person("Jim", 34)
  println(jim2 == jim3)
  // 4. case classes have handy copy method
  val jim6 = jim.copy(age = 45) // this creates a new instance of case class of samer parameter as Jim but with age of 45
  // Case class also have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23) // this delegates to apply method and we don't use new keyword in case classes

  // 6. Case classes are serializable and make it useful  for transferring over network use in Akka framework

  // 7. CCs have extract patterns = CCs can be used in Pattern Matching
  case object UnitedKingdom {
    def name:String = "The UK of GB and Ni"
  }
}
