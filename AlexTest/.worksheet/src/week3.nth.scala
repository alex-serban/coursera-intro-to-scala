package week3

object nth {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(205); 
    def nth[T](list: List[T], n: Int): T =
    if (list.isEmpty) throw new IndexOutOfBoundsException("Out of Bounds")
    else if (n== 0)list.head
    else nth(list.tail, n - 1);System.out.println("""nth: [T](list: week3.List[T], n: Int)T""");$skip(69); 
    
    
    val l = new Cons(1, new Cons(2, new Cons(3, new Nil)));System.out.println("""l  : week3.Cons[Int] = """ + $show(l ));$skip(17); val res$0 = 
     nth(l, 100);System.out.println("""res0: Int = """ + $show(res$0))}
}
