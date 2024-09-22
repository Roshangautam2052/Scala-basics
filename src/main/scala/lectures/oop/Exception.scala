package lectures.oop

object Exception extends App {
  // They are technical and sweet way to handle when the program crashes

  //  val x: String = null
  //  println(x.length)
  //  // this will crash with a NULL POINTER EXCEPTION
  //  // 1. Throwing and catching exceptions
  //
  //  // we can throw an exception using throws keyword
  //
  //  val aWierdValue: String = throw new NullPointerException // This wierd value is of type Nothing is valid substitute  for any other type
  // exceptions are nothing but the instances of classes
  // throwable classes extends throwable class
  // Derived from throwable which is an Exception(something went wrong) are Error and are the two major throwable subtypes

  //2. how to catch exceptions
  def getInt(withExceptions: Boolean): Int = {
    if (withExceptions) throw new RuntimeException("No int for you ")
    else 432
  }

  /*
   the potentialFail is of Type AnyVal this is because the compiler tries to find the return type
  which is type Int in the getInt method and in the other one it is of type string which has
  been returned by catch block
   */
  val potentialFail = try {
    // the code that might fail
    getInt(false)

  } catch {
    case e: RuntimeException => 43
  } finally {
    // code that will get executed NO MATTER WHAT
    // this one is optional
    // does not influence the return type of this expression
    // use finally only for side effects for example logging something to a file
    println("finally")
  }
  println(potentialFail)
  // The exception comes from Java language (JVM) thing not any other specific thing

  // 3. How to define the own exceptions

  class MyException extends Exception

  val exception = new MyException

  throw exception

  /*
    1. Crash your program with an OutOfMemoryError
    2. Crash with StackOverflow error
    3. Pocket Calculator {
       adds two numbers
      -multiply(x,y)
      -divide(x,y)
      -subtract(x,y)

    Throws a custom exception
      -OverflowException if add(x, y) exceeds Int.MAX_VALUE
      -UnderflowException if exceeds Int.MIN_VALUE
      -MathCalculationException for division with 0
   */


}
