package exercises.oop.exercise

class Calculator{
  def addNumbers(x:Int, y:Int): Unit = {
    val result = x + y
    throwingException(result)
  }
  def subtractNumbers(x:Int, y:Int): Unit ={
    val result =  x - y 
    throwingException(result)
  }
  def multiplyNumbers(x:Int, y:Int):Unit = {
    val result = x*y
    throwingException(result)
  }
  def divideNumbers(x:Int, y:Int):Unit = {
    throwingDivisionException(x, y)
  }
  
  private def throwingException(result:Int) = {
    try {
     result
    }
    catch {
      case e: OverFlowException => if (result > Int.MaxValue) {
        throw new OverFlowException()
      }
      else {
        throw new UnderFlowException()
      }
    }
  }
  private def throwingDivisionException(dividend: Int, divisor:Int) = {
    
    try {
      val result = dividend/divisor
      result
    }
    catch {
      case e: DivideByZeroException => {
       throw new DivideByZeroException()
      }
    }
  }
 
}
