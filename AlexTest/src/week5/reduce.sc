package week5

object reduce {
  def sum1(xs: List[Int]): Int = (0 :: xs) reduceLeft (_ + _)
  def sum2(xs: List[Int]): Int = (xs foldLeft 0)(_ + _)

  var l: List[Int] = List(1, 2, 3)
  var r: List[Int] = List(7, 8, 9)

  sum1(l)
  sum2(l)

  l.foldLeft(0)(_ + _)

  l.foldRight(r)(_ :: _)

  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())((x, y) => f(x) :: y)

  mapFun(l, x: T => x + 2)
}