object Q7 {
  def main(arg: Array[String]): Unit = {
    println(myFilter((x: Int) => x % 2 == 0)(List(1, 2, 3, 4, 5, 6)))
  }

  def myFilter(f: Int => Boolean)(list: List[Int]): List[Int] = {
    if (list.isEmpty) list
    else if (f(list.head)) list.head :: myFilter(f)(list.tail)
    else myFilter(f)(list.tail)
  }

}
