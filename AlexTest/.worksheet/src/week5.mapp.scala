package week5

object mapp {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(170); 

  def squareList1(xs: List[Int]): List[Int] =
    xs match {
      case Nil     => xs
      case y :: ys => y * y :: squareList1(ys)
    };System.out.println("""squareList1: (xs: List[Int])List[Int]""");$skip(72); 

  def squareList2(xs: List[Int]): List[Int] =
    xs map (x => x * x);System.out.println("""squareList2: (xs: List[Int])List[Int]""");$skip(32); 

  var l = List(1, 2, 3, 4, 5);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(19); val res$0 = 

  squareList1(l);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(17); val res$1 = 
  squareList2(l);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(26); val res$2 = 

  l filter (x => x > 3);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(72); 

  var t = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'd', 'a', 'a');System.out.println("""t  : List[Char] = """ + $show(t ));$skip(30); val res$3 = 
  t takeWhile (y => y != 'b');System.out.println("""res3: List[Char] = """ + $show(res$3));$skip(30); val res$4 = 
  t dropWhile (y => y == 'a');System.out.println("""res4: List[Char] = """ + $show(res$4));$skip(211); 

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil      => Nil
    case x :: xs1 => List(xs takeWhile (y => y == x)) ++ pack(xs1 dropWhile (y => y == x)) //pack(xs.dropWhile(y => y != x))
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(12); val res$5 = 

  pack(t);System.out.println("""res5: List[List[Char]] = """ + $show(res$5));$skip(294); 

  def encode(xs: List[Char]): List[(Char, Int)] = xs match {
    case Nil => Nil
    case x :: xs1 => {
      var p = xs partition (y => y == x)
      List((x, p._1.length)) ++ encode(p._2)

      //List((x, (xs filter (y => y == x)).length)) ++ encode(xs filterNot (y => y == x))
    }
  };System.out.println("""encode: (xs: List[Char])List[(Char, Int)]""");$skip(12); val res$6 = 
  encode(t);System.out.println("""res6: List[(Char, Int)] = """ + $show(res$6))}
}
