package week5

object mapp {

  def squareList1(xs: List[Int]): List[Int] =
    xs match {
      case Nil     => xs
      case y :: ys => y * y :: squareList1(ys)
    }                                             //> squareList1: (xs: List[Int])List[Int]

  def squareList2(xs: List[Int]): List[Int] =
    xs map (x => x * x)                           //> squareList2: (xs: List[Int])List[Int]

  var l = List(1, 2, 3, 4, 5)                     //> l  : List[Int] = List(1, 2, 3, 4, 5)

  squareList1(l)                                  //> res0: List[Int] = List(1, 4, 9, 16, 25)
  squareList2(l)                                  //> res1: List[Int] = List(1, 4, 9, 16, 25)

  l filter (x => x > 3)                           //> res2: List[Int] = List(4, 5)

  var t = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'd', 'a', 'a')
                                                  //> t  : List[Char] = List(a, a, a, b, b, b, c, c, d, a, a)
  t takeWhile (y => y != 'b')                     //> res3: List[Char] = List(a, a, a)
  t dropWhile (y => y == 'a')                     //> res4: List[Char] = List(b, b, b, c, c, d, a, a)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil      => Nil
    case x :: xs1 => List(xs takeWhile (y => y == x)) ++ pack(xs1 dropWhile (y => y == x)) //pack(xs.dropWhile(y => y != x))
  }                                               //> pack: [T](xs: List[T])List[List[T]]

  pack(t)                                         //> res5: List[List[Char]] = List(List(a, a, a), List(b, b, b), List(c, c), List
                                                  //| (d), List(a, a))

  def encode(xs: List[Char]): List[(Char, Int)] = xs match {
    case Nil => Nil
    case x :: xs1 => {
      var p = xs partition (y => y == x)
      List((x, p._1.length)) ++ encode(p._2)

      //List((x, (xs filter (y => y == x)).length)) ++ encode(xs filterNot (y => y == x))
    }
  }                                               //> encode: (xs: List[Char])List[(Char, Int)]
  encode(t)                                       //> res6: List[(Char, Int)] = List((a,5), (b,3), (c,2), (d,1))
}