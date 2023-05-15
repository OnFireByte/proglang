object Q2 {
  def main(arg: Array[String]): Unit = {
    val l = List(1, 2, 4, 5)
    println(insertInOrder(3, l))
  }

  def insertInOrder(x: Int, l: List[Int]): List[Int] = {
    if (x <= l.head) x :: l
    else l.head :: insertInOrder(x, l.tail)
  }
}
