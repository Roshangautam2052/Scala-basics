package exercises.oop.exercise

object SOE extends App{

  def calculateFactorial(x:Int):Int = x*calculateFactorial(x-1)
  try {
    println(calculateFactorial(1000000))
  } catch {
    case e: StackOverflowError => println("Cannot calculate factorial ")
  }

}
