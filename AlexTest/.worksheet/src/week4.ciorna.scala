package week4

object ciorna {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 

  var L = List('c', 'a', 'b', 'a');System.out.println("""L  : List[Char] = """ + $show(L ));$skip(313); 

  def formDict(L: List[Char], dict: List[(Char, Int)]): List[(Char, Int)] = {
    if (L == Nil) dict
    else if (dict == Nil) formDict(L.tail, (L.head, 1) :: dict)
    else if (L.head == dict.head._1) formDict(L.tail, (L.head, dict.head._2 + 1) :: dict.tail)
    else formDict(L.tail, (L.head, 1) :: dict)
  };System.out.println("""formDict: (L: List[Char], dict: List[(Char, Int)])List[(Char, Int)]""");$skip(67); 

  var A = formDict(L.sortWith(_ > _), Nil).sortWith(_._2 > _._2);System.out.println("""A  : List[(Char, Int)] = """ + $show(A ));$skip(23); val res$0 = 

  L.count(_ => true);System.out.println("""res0: Int = """ + $show(res$0));$skip(9); val res$1 = 
  L.size;System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
  List(0);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(47); 
  var X = List() ::: List(0, 1) ::: List(2, 3);System.out.println("""X  : List[Int] = """ + $show(X ));$skip(89); 

  var t = List(('a', 1), ('b', 4), ('c', 76), ('d', 9), ('e', 0), ('f', -1), ('g', 9))

  case class Leaf(c: Char, t: Int);System.out.println("""t  : List[(Char, Int)] = """ + $show(t ));$skip(295); 

  def makeOrderedLeafList(freqs: List[(Char, Int)]): List[Leaf] = {

    def helper(f: List[(Char, Int)]): List[Leaf] = f match {
      case Nil    => Nil
      case h :: t => List(Leaf(h._1, h._2)) ++ helper(t)
    }

    helper(freqs.sortBy(_._2))
  };System.out.println("""makeOrderedLeafList: (freqs: List[(Char, Int)])List[week4.ciorna.Leaf]""");$skip(28); val res$3 = 
  
  makeOrderedLeafList(t);System.out.println("""res3: List[week4.ciorna.Leaf] = """ + $show(res$3))}
}
