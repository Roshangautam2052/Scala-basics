package lectures.part1basics

/**
 * @author Roshan Gautam
 */
object Functions extends App {
  
  def addTwoNumbers(a:String, b:String) : String= {
    a + " " + b
  }

  println(addTwoNumbers("hello", "scala"))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  def aRepeatedFunction(aString: String, n: Int): String ={
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1);
  }

  println(aRepeatedFunction("hello", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  
  def aBigFunction(n: Int) : Int ={
    def aSmallerFunction(a: Int, b: Int): Int = a+b
    aSmallerFunction(n , n-1)
    
  }
}

