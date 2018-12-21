package week5

object listz {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(204); 

  def init[T](xs: List[T]): List[T] = xs match {
    case List()  => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  };System.out.println("""init: [T](xs: List[T])List[T]""");$skip(200); 

  def removeAt[T](n: Int, xs: List[T]): List[T] = xs match {
    case List()              => xs
    case y :: ys if (n == 0) => ys
    case y :: ys             => List(y) ++ removeAt(n - 1, ys)
  };System.out.println("""removeAt: [T](n: Int, xs: List[T])List[T]""");$skip(372); 

  def merge(xs: List[Int], ys: List[Int]): List[Int] =
    (xs, ys) match {
      case (List(), b)                    => b
      case (a, List())                    => a
      //case (a :: as, b :: bs) if (a == b) => a :: merge(as, bs)
      case (a :: as, b :: bs) if (a <= b) => a :: merge(as, ys)
      case (a :: as, b :: bs) if (a > b)  => b :: merge(xs, bs)
    };System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(37); 

  var a = List(1, 3, 6, 9, 10, 20);System.out.println("""a  : List[Int] = """ + $show(a ));$skip(28); 
  var b = List(2, 5, 8, 20);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(16); val res$0 = 

  merge(a, b);System.out.println("""res0: List[Int] = """ + $show(res$0))}

}
