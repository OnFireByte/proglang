object Q3 {
  def main(arg: Array[String]): Unit = {
    println(subList(List(4), List(1, 2, 3, 4, 5)))
    println(subList(List(3, 1, 4), List(1, 2, 3, 4, 5)))
    println(subList(List(4, 6), List(1, 2, 3, 4, 5)))
  }

  def subList(l1: List[Any], l2: List[Any]): Boolean = {
    if (l1.isEmpty) true
    else if (l2.isEmpty) false
    else if (l1.length == 1) {
      if (l1.head == l2.head) true
      else subList(l1, l2.tail)
    } else subList(l1.tail, l2) && subList(List(l1.head), l2)
  }
}
