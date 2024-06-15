package lectures.part1basics

/**
 * @author Roshan Gautam
 */
object ValuesVariablesTypes  extends App {

  val x: Int = 53;
  println(x);

  // VALS ARE IMMUTABLE

  // COMPILER can infer types

  val aString: String = "hello"
  val anotherString: String = "scala";

  val aBoolean: Boolean = false;
  val aChar: Char = 'a';
  val aInt: Int = x
  val aShort: Short = 412
  val aLong: Long = 3423423234L;
  val aFloat: Float = 2.0f;
  val aDouble: Double = 232.343;

  // variables in scala

  var aVariable: Int = 4;

  //  aVariable = 5; // side effects

}
