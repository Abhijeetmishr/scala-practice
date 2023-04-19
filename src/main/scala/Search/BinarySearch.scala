package Search

import scala.annotation.tailrec

object BinarySearch extends App {
  private def binarySearch(arr: List[Int], elem: Int): Int = {
    binarySearch(arr, elem, 0, arr.length)
  }

  private def binarySearch(arr: List[Int], elem: Int, start: Int, end: Int): Int = {
    @tailrec
    def searchImpl(lo: Int, hi: Int): Int = {
      if(lo > hi) return -1
      else {
        val mid = lo + (hi - lo)/2
        arr(mid) match {
          case mv if(mv == elem) => mid
          case mv if(mv <= elem) => searchImpl(mid + 1, hi)
          case _                 => searchImpl(lo, mid -1);
        }
      }
    }
    searchImpl(start, end)
  }
  private val res = binarySearch(List(3, 5, 7, 10, 15, 20), 15)
  println(res)
}
