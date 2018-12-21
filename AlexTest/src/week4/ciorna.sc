package week4

object ciorna {

  var L = List('c', 'a', 'b', 'a')                //> L  : List[Char] = List(c, a, b, a)

  def formDict(L: List[Char], dict: List[(Char, Int)]): List[(Char, Int)] = {
    if (L == Nil) dict
    else if (dict == Nil) formDict(L.tail, (L.head, 1) :: dict)
    else if (L.head == dict.head._1) formDict(L.tail, (L.head, dict.head._2 + 1) :: dict.tail)
    else formDict(L.tail, (L.head, 1) :: dict)
  }                                               //> formDict: (L: List[Char], dict: List[(Char, Int)])List[(Char, Int)]

  var A = formDict(L.sortWith(_ > _), Nil).sortWith(_._2 > _._2)
                                                  //> A  : List[(Char, Int)] = List((a,2), (b,1), (c,1))

  L.count(_ => true)                              //> res0: Int = 4
  L.size                                          //> res1: Int = 4
  List(0)                                         //> res2: List[Int] = List(0)
  var X = List() ::: List(0, 1) ::: List(2, 3)    //> X  : List[Int] = List(0, 1, 2, 3)

  var t = List(('a', 1), ('b', 4), ('c', 76), ('d', 9), ('e', 0), ('f', -1), ('g', 9))
                                                  //> t  : List[(Char, Int)] = List((a,1), (b,4), (c,76), (d,9), (e,0), (f,-1), (g
                                                  //| ,9))

  case class Leaf(c: Char, t: Int)

  def makeOrderedLeafList(freqs: List[(Char, Int)]): List[Leaf] = {

    def helper(f: List[(Char, Int)]): List[Leaf] = f match {
      case Nil    => Nil
      case h :: t => List(Leaf(h._1, h._2)) ++ helper(t)
    }

    helper(freqs.sortBy(_._2))
  }                                               //> makeOrderedLeafList: (freqs: List[(Char, Int)])List[week4.ciorna.Leaf]
  
  makeOrderedLeafList(t)                          //> res3: List[week4.ciorna.Leaf] = List(Leaf(f,-1), Leaf(e,0), Leaf(a,1), Leaf(
                                                  //| b,4), Leaf(d,9), Leaf(g,9), Leaf(c,76))
}