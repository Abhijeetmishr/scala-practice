import scala.util.{Failure, Success, Try}

object WordCounts extends App {
  val inputFile = "resources/input.txt"
  val lines: List[String] = Try {
    scala.io.Source.fromFile(inputFile).getLines().toList
  } match {
    case Success(value) => value
    case Failure(exception) => exception.getMessage.split("\\W+").toList
  }
  val words = lines.flatMap(_.split("\\W+")).filter(_.nonEmpty)
  val wordCounts = words.groupBy(_.toLowerCase()).mapValues(_.length)

  wordCounts foreach {
    case(words, count) => println(s"$words : $count")
  }
}
