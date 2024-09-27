package lectures.funtionalprogramming

object AnonymousFunction extends App {
  val doubler = new Function[Int, Int] {
    override def apply(x: Int) = x * 2
    // This is still an Object Oriented Way of instantiating functions

  }

  // This can be avoided by the usage of Syntactic sugar method which is
  // This is called anonymous function or (LAMBDA)
  val doubler1 = (x:Int) => x *2 // This is a lambda which is on right hand side
  val doubler2 : Int => Int =(x:Int) =>  x * 2
  val doubler3: Int => Int = x => x * 2

  // Syntax rule for multiple parameters
  // Here we are supplying a type a must put the type of parameters in parenthesis
  val adder:(Int, Int) => Int = (a:Int, b:Int) => a + b
  val adder2 = (a:Int, b:Int) => a + b


  // no parameters lambda
  val justDoSomething:() => Int = () => 3

  println(justDoSomething) // this returns the function itself lectures.funtionalprogramming.AnonymousFunction$$$Lambda$20/0x0000007000094040@1b26f7b2
  println(justDoSomething()) // this returns 3

  // curly braces to write lambda
  val stringToInt = { (str:String) =>
    str.toInt

  }
  // More syntactic Sugar
  val niceIncrementor: Int => Int = (x:Int) => x+ 1
  val niceIncrementor2: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder:(Int, Int) => Int = _ + _ // equivalent to (a,b) => a + b

  // Super Adder

  val superAdder = (x: Int) => (y:Int) => x + y
  println(superAdder(3)(4))

}
