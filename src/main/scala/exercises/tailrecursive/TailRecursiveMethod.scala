package exercises.tailrecursive

import scala.annotation.tailrec

/**
 * @author Roshan Gautam
 */


object TailRecursiveMethod extends App {

  /*
    This method will throw stack overflow error when the value of
     n increases due to the fact that JVM has limited amount of memory
     to call upon the stack

    So this method is inefficient for larger recursion problems
   */
  def calculateFactorial(n: Int): Int ={
    if (n<=1) 1
    else {
      println("Computing factorial of "+ n + " - I first need factorial of "+ (n-1))
      val result = n*calculateFactorial(n-1)
      println("Computed factorial of " + n)
      result

    }
  }
  /*
   Redefining the recursion using tail recursion method which
   makes the recursion much efficient to compute factorial for almost
   any numbers without throwing stack overflow error
   */

  def calculateFactorialHelper(n: Int) :BigInt ={
    @tailrec
    def factorialHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <=1) accumulator
      else factorialHelper(x-1, x * accumulator)

    factorialHelper(n, 1)
  }
  println(calculateFactorialHelper(4))
  /*
    fact(3) -> factorialHelper(3, 1) -> x<=1 == false factorialHelper(3, 3*1)
    fact(2) -> factorialHelper(2, 1) -> x<=1 == false factorialHelper(2, 2*3*1)
    fact(1) -> factorialHelper(1, 1) -> x<=1 == true  return 2*3*1 which is the value stored in the accumulator variable
    return accumulator -> 2*3*1

   */
}
