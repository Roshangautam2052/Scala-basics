package exercises

/**
 * @author Roshan Gautam
 */
object FactorialCalculator extends App{

  def calculateFactorial(number: Int): Int = {
    if (number <= 0) 1
    else number * calculateFactorial(number-1)
  }

  println(calculateFactorial(100))

}
