object Q6 {
  def main(arg: Array[String]): Unit = {
    println(myMap((x: Int) => x * 2)(List(1, 2, 3, 4, 5)))
  }

  def myMap(f: Int => Int)(list: List[Int]): List[Int] = {
    if (list.isEmpty) list
    else f(list.head) :: myMap(f)(list.tail)
  }

}
