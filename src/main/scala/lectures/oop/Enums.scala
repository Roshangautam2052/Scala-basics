package lectures.oop

import lectures.oop.Enums.Permissions.{NONE, READ}

object Enums {
  // data type much like a class keyword case is used to create the instances
  // These keywords are used as a data type we can use fields and methods
  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    // add fields and methods
    def openDocument(): Unit = {
      if (this == READ) println("Opening Document ")
      else println("reading not allowed")
    }
  }

  val somePermission: Permissions = Permissions.READ

  // enums can also take constructor arguments
  enum PermissionsWithBits(bits: Int) {
    case READ extends PermissionsWithBits(4) // 100
    case WRITE extends PermissionsWithBits(2) // 010
    case EXECUTE extends PermissionsWithBits(1) // 001
    case NONE extends PermissionsWithBits(0) // 000

  }

  // We can also create objects
  object PermissionsWithBits {
    def fromBits(bits: Int): PermissionsWithBits = // whatever
      PermissionsWithBits.NONE
  }

  // standard API

  val somePermissionsOrdinal: Int = somePermission.ordinal // returns the index in which the element were defined
  val allPermissions = PermissionsWithBits.values // array of all positive values of the enum
  val readPermission:Permissions = Permissions.valueOf("READ") // Permission.read This value of take strings as an argument and convert into Permission enum

  def main(args: Array[String]): Unit = {
    somePermission.openDocument()
    println(somePermissionsOrdinal)
  }
}
