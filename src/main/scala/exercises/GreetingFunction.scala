package exercises

/**
 * @author Roshan Gautam
 */
object GreetingFunction extends App {
  
  def greetTheUser(age:Int, name:String): Unit = 
    println(" Hi my name is " + name+ " "+ "and I am " + age+ " " + "years old.")
  
  greetTheUser(12, "Roshan")
}
