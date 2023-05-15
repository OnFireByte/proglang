object Q4 {
  def main(arg: Array[String]): Unit = {
    val l = List(3, 1, 4, 2, 5)
    println(mergesort(l))
  }

  def mergesort(list: List[Int]): List[Int] = {
    if (list.length <= 1) return list
    val (a, b) = split(list, List(), list.length / 2);
    merger(mergesort(a), mergesort(b))
  }

  def split(a: List[Int], b: List[Int], count: Int): (List[Int], List[Int]) = {
    if (count == 0) (a, b)
    else split(a.tail, b ++ List(a.head), count - 1)
  }

  def merger(a: List[Int], b: List[Int]): List[Int] = {
    if (a.isEmpty && b.isEmpty) List()
    else if (a.isEmpty) b
    else if (b.isEmpty) a
    else if (a.head < b.head) List(a.head) ++ merger(a.tail, b)
    else List(b.head) ++ merger(a, b.tail)
  }
}
