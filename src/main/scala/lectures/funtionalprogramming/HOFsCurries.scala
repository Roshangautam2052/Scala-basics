package lectures.funtionalprogramming

object HOFsCurries extends App {


  // In this function the return type is another function which takes and Int and returns an Int
  // How do we read this function
  // Here the supertype takes an Int and a function and in turn returns a function
  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null

  // map, flatMap, filter are examples of Higher Order function

  // Function that applies a function n times over a value
  // nTimes(f, n, x)
  // nTimes(f, 3, x) = f(f(f(x))) // This is a classical example of Higher Order function
  //nTimes(f, 3, x) = f(f(....f(x))) = nTimes(f, n-1, f(x))
  //nTimes(f, 3, x) = f(f(f(x))) = nTimes(f,2, f(x)) = f(f(f(x)))

  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else {
      nTimes(f, n - 1, f(x))
    }

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  // Better way of implementing this
  //ntb(f,n) => x => f(f(f....(x))
  // increment10 = ntb(plusOne, 10) = x => plusOne(plusOne......(x))

  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n-1)(f(x))


  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))

  // Curried Functions
  // The arrow here is right associative which receives a value and returns a function
  val superAdder:(Int => (Int => Int)) = (x:Int) => (y:Int) => x + y
  val add3 = superAdder(3) // y => 3 + y
  println(add3(10)) // This will return the value 13
  println(superAdder(3)(10))

  // functions with multiple parameter lists

  def curriedFormatter(c: String )(x:Double) : String = c.format(x)
  val standardFormat:(Double => String) = curriedFormatter("%4.2f")
  val preciseFormat:(Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

  /**
   * Functional programing = working with functions
   * pass functions as parameters
   * returns function as results
   * Higher Order Functions(HOFs)
   * currying = functions with multiple parameters lists
   */
}


