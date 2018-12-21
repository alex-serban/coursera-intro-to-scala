package week5

object reduce {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
  def sum1(xs: List[Int]): Int = (0 :: xs) reduceLeft (_ + _);System.out.println("""sum1: (xs: List[Int])Int""");$skip(56); 
  def sum2(xs: List[Int]): Int = (xs foldLeft 0)(_ + _);System.out.println("""sum2: (xs: List[Int])Int""");$skip(37); 

  var l: List[Int] = List(1, 2, 3);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(35); 
  var r: List[Int] = List(7, 8, 9);System.out.println("""r  : List[Int] = """ + $show(r ));$skip(12); val res$0 = 

  sum1(l);System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  sum2(l);System.out.println("""res1: Int = """ + $show(res$1));$skip(25); val res$2 = 

  l.foldLeft(0)(_ + _);System.out.println("""res2: Int = """ + $show(res$2));$skip(27); val res$3 = 

  l.foldRight(r)(_ :: _);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(106); 

  def mapFun[T, U](xs: List[T], f: T => U): List[U] =
    (xs foldRight List[U]())((x, y) => f(x) :: y);System.out.println("""mapFun: [T, U](xs: List[T], f: T => U)List[U]""");$skip(29); val res$4 = 

  mapFun(l, x: T => x + 2);System.out.println("""res4: List[Nothing] = """ + $show(res$4))}
}
