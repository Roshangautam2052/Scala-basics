package lectures.oop
// package is a group of definitions under the same name and package mirror the file structure
import exercises.oop.exercise.Calculator
// We can also do name aliasing at import
import playground.{Cindrella => CindrellaHasManyTypes, Princess}
import java.sql.Date as SQLDate

import java.util.Date


object PackagingAndImports extends App{
 // The classes inside the same package are visible to be used by other classes in the same package

   val calculator = new Calculator

   // packages by ordering them hierarchy

   // package object scala specific
  /**
   * This comes if we want to write method and object
   * outside anything else like universal object or classes which are outside any packages
   * The package object can be only one outside the package and we can define methods and constants
   * They are used rarely used
   */
  // PACKAGE OBJECTS
  sayHello
  println(SPEED_OF_LIGHT)

  val cyndrella = new CindrellaHasManyTypes
  val princess = new Princess

  val date1 = new Date()
  val date2 = new Date(11,12, 2024)

  // default imports
  // java.lang - string, object, Exception
  //scala - Int, Nothing, Function
  //

}
