object Q8 {
  def main(arg: Array[String]): Unit = {
    println(sumAll(List()))
    println(sumAll(List(List())))
    println(
      sumAll(
        List(List(1, 2, 3, 4), List(), List(4, 5), List(1, 2, 3, 4, 5, 6))
      )
    )
    println(
      sumAll(
        List(List(3, 4), List(1, 2, 3, 4, 5, 6), List(1, 2, 3, 4))
      )
    )
    println(
      sumAll(
        List(
          List(1, 2, 3, 4, 5, 6),
          List(1, 2, 3, 4),
          List(1, 2),
          List(0, 0, 0, 0, 0, 0, 0, 0, 9)
        )
      )
    )
  }

  def sumAll(lists: List[List[Int]]): List[Int] = {
    sumAcc(lists, List())
  }

  def sumAcc(list2: List[List[Int]], acc: List[Int]): List[Int] = {
    if (list2.isEmpty) acc
    else sumAcc(list2.tail, sumList(list2.head, acc))
  }

  def sumList(a: List[Int], b: List[Int]): List[Int] = {
    if (a.isEmpty && b.isEmpty) List()
    else if (a.isEmpty) b
    else if (b.isEmpty) a
    else a.head + b.head :: sumList(a.tail, b.tail)
  }

}