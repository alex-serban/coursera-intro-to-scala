package week4

object insertSort {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(127); 

  def isSort(xs: List[Int]): List[Int] = xs match {
    case List()  => List()
    case y :: ys => insert(y, isSort(ys))
  };System.out.println("""isSort: (xs: List[Int])List[Int]""");$skip(176); 

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => {
      if (y < x) y :: insert(x, ys)
      else x :: xs
    }
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(50); val res$0 = 

  isSort(1 :: 22 :: 100 :: 2 :: 4 :: 99 :: Nil);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(29); val res$1 = 
  isSort(1 :: 5 :: 2 :: Nil);System.out.println("""res1: List[Int] = """ + $show(res$1))}

}
