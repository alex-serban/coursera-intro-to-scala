package week5

object listz {

  def init[T](xs: List[T]): List[T] = xs match {
    case List()  => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }                                               //> init: [T](xs: List[T])List[T]

  def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
    case List()              => xs
    case y :: ys if (n == 0) => ys
    case y :: ys             => List(y) ++ removeAt(n - 1, ys)
  }                                               //> removeAt: [T](n: Int, xs: List[T])List[T]

  def merge(xs: List[Int], ys: List[Int]): List[Int] =
    (xs, ys) match {
      case (List(), b)                    => b
      case (a, List())                    => a
      //case (a :: as, b :: bs) if (a == b) => a :: merge(as, bs)
      case (a :: as, b :: bs) if (a <= b) => a :: merge(as, ys)
      case (a :: as, b :: bs) if (a > b)  => b :: merge(xs, bs)
    }                                             //> merge: (xs: List[Int], ys: List[Int])List[Int]

  var a = List(1, 3, 6, 9, 10, 20)                //> a  : List[Int] = List(1, 3, 6, 9, 10, 20)
  var b = List(2, 5, 8, 20)                       //> b  : List[Int] = List(2, 5, 8, 20)

  merge(a, b)                                     //> res0: List[Int] = List(1, 2, 3, 5, 6, 8, 9, 10, 20, 20)

}