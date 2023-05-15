object Q1 {
  def main(arg: Array[String]): Unit = {
    val l = List(1, 2, 3, 4, 5)
    println(insertLast(6, l))
  }

  def insertLast(x: Any, l: List[Any]): List[Any] = {
    l ++ List(x)
  }
}
