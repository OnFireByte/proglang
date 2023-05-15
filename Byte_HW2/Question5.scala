object Q5 {
  def main(arg: Array[String]): Unit = {
    println(palindrome(List(3, 1, 4, 2, 5)))
    println(palindrome(List(1, 2, 3, 2, 1)))
    println(palindrome(List(1, 2, 2, 1)))
  }

  def palindrome(list: List[Any]): Boolean = {
    helper(list, reverse(list))
  }

  def helper(a: List[Any], b: List[Any]): Boolean = {
    if (a.isEmpty && b.isEmpty) true
    else if (a.head != b.head) false
    else helper(a.tail, b.tail)
  }

  def reverse(list: List[Any]): List[Any] = {
    if (list.isEmpty) list
    else reverse(list.tail) ++ List(list.head)
  }
}
