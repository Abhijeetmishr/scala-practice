object Advanced extends App {
  val numbers = List(1, 2, 3, 4, 5)
  val sum = numbers.foldLeft(0)((acc, n) => acc + n)
  println(s"Sum: $sum")
}
