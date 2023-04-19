package Sort

object MergeSort extends App {

  def mergeSort(arr: Array[Int]): Array[Int] = {
    if (arr.length <= 1) {
      arr
    } else {
      val mid = arr.length / 2
      val left = arr.take(mid)
      val right = arr.drop(mid)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  def merge(left: Array[Int], right: Array[Int]): Array[Int] = {
    var merged = Array.emptyIntArray
    var i = 0
    var j = 0

    while (i < left.length && j < right.length) {
      if (left(i) <= right(j)) {
        merged = merged :+ left(i)
        i += 1
      } else {
        merged = merged :+ right(j)
        j += 1
      }
    }

    if (i < left.length) {
      merged ++= left.drop(i)
    } else if (j < right.length) {
      merged ++= right.drop(j)
    }

    merged
  }
  val res = mergeSort(Array(3, 10, 5, 8, 12))
  println(res.mkString(", "))
}

