package lectures.part1basics

/**
 * @author Roshan Gautam
 */
object Expressions extends App {

  val x = 1+2 // expression
  println(x)

  println(2+3+4); // this is math expression, preserves the operation order
  // +, - * , / & | ^ << >> >>>(right shift with zero extension)
  println(1 == x)
  // relational operators == != > >= < <=

  println(!(1==x))
  // ! && ||

  var aVariable = 2
  aVariable +=3 // also works with -= *= ... side effects (changing a variable is called side effect)
  println(aVariable)

  // Instructions(Doing something ) vs Expressions (something it has value compute value)

  // if expression
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // this is if expression not a if instruction
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1+3)

  var i = 0;
  while(i<10){
    println(i)
    i +=1
  }

  // Never write this again(looping is very native to imperative programming like Java,Python)

  // Everything in Scala is an Expression!

  val aWierdValue = (aVariable = 3)
  println(aWierdValue)

  // side effects examples: println(), while, reassigning

  // code blocks

  val aCodeBlock = {
    val y = 2;
    val z = y+1;
    if (z>2) "Hello" else "GoodBye"

    // The value of the whole block is  the value of the last expression
  }

 



}
