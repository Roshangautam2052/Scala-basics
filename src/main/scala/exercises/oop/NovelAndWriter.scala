package exercises.oop

import java.time.LocalDate


object NovelAndWriter extends App {
  // create new instance of writer
  val writer = new Writer("William ", "Shakespeare")
  val imposter = new Writer("William ", "Shakespeare")
  println(writer.returnFullName())

  // create new instance of Novel
  val novel = new Novel(name = "Hamlet", yearOfRelease = LocalDate.of(1876, 12, 31),
    author = writer, authorDateOfBirth = LocalDate.of(1856,3, 6))
  // calculate the author age
  println(s"The authors is : ${novel.calculateAuthorAge()} years old.")
  println( novel.returnAuthor(imposter))


  // create instance of Count
  val count = new Counter
  // increasing count
  count.increaseCounter().print()
  count.increaseCounter(5).print()


}

/*
Novel and Writer
Writer : firstName, surname, year
-- method fullName
*/
class Writer(firstName: String, lastName: String) {

  def returnFullName(): String = {
    s"The writer's full name is ${firstName + " " + lastName}"

  }
}
/*
Name: name, year of release, author
authorAge
isWrittenBy(author)
-copy(new year of release) = new instance of Novel
 */
class Novel(name: String, yearOfRelease: LocalDate, author: Writer, authorDateOfBirth: LocalDate) {

  def calculateAuthorAge(): Int = {
    yearOfRelease.getYear - authorDateOfBirth.getYear
  }

  def returnAuthor(writer: Writer): Boolean = {
    writer == this.author
  }

    def copyYearOfRelease(newReleaseYear: LocalDate): Novel = {
     new Novel(name,newReleaseYear,author, authorDateOfBirth )
   }
}

  class Counter(val count:Int= 0){



    def increaseCounter(): Counter = {
      println("Incrementing")
      new Counter(count+1)
    }

    def decreaseCounter(): Counter = {
      println("Decrementing")
      new Counter(count -1)
    }

    def increaseCounter(value: Int): Counter = {
      if(value <= 0) this
      else increaseCounter().increaseCounter(value-1)
    }

    def decreaseCounter(value: Int): Counter = {
      if (value <= 0) this
      else decreaseCounter().decreaseCounter(value - 1)
    }

    def print():Unit = println(count)


  }
