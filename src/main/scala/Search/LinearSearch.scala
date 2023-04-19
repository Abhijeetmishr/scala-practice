package Search

import scala.annotation.tailrec

object LinearSearch extends App {
  def linearSearch(arr: Vector[Int], elem: Int): Int = {
    @tailrec
    def iter(index: Int): Int =
      if (index == arr.length) -1
      else if (arr(index) == elem) index
      else iter(index + 1)

    iter(0)
  }

  val ans = linearSearch(Vector(1, 2, 4, 5), 5)
  println(ans)
}
