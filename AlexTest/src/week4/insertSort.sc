package week4

object insertSort {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def isSort(xs: List[Int]): List[Int] = xs match {
    case List()  => List()
    case y :: ys => insert(y, isSort(ys))
  }                                               //> isSort: (xs: List[Int])List[Int]

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => {
      if (y < x) y :: insert(x, ys)
      else x :: xs
    }
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]

  isSort(1 :: 22 :: 100 :: 2 :: 4 :: 99 :: Nil)   //> res0: List[Int] = List(1, 2, 4, 22, 99, 100)
  isSort(1 :: 5 :: 2 :: Nil)                      //> res1: List[Int] = List(1, 2, 5)

}