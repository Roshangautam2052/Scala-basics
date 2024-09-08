package lectures.oop

object Objects extends App{

  // Scala does not have class level functionality("static")

  object Person {
    val N_EYES = 2

    def canFly: Boolean = false
  }

  println(Person.N_EYES)
  println(Person.canFly)

}
