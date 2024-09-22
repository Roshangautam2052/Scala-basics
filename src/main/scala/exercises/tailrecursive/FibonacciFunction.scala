package exercises.tailrecursive

/**
 * @author Roshan Gautam
 */
object FibonacciFunction extends App{

  def calculateFibonnaciNumber(n: Double): Double ={
    if (n <=2 ) 1
    else calculateFibonnaciNumber(n-1) + calculateFibonnaciNumber(n-2)
  }

  println(calculateFibonnaciNumber(56))

}
