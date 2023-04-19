import scala.language.implicitConversions

object ScalaConcepts extends App {
  //implicit conversions
  case class Person(name: String) {
    def greet(): Unit = println(s"Hey my name is $name, Scala rocks!")
  }

  implicit def stringToPerson(string: String): Person = Person(string)

  "Abhijeet".greet()
}
