package week3

object nth {
    def nth[T](list: List[T], n: Int): T =
    if (list.isEmpty) throw new IndexOutOfBoundsException("Out of Bounds")
    else if (n== 0)list.head
    else nth(list.tail, n - 1)                    //> nth: [T](list: week3.List[T], n: Int)T
    
    
    val l = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> l  : week3.Cons[Int] = week3.Cons@1b0375b3
     nth(l, 100)                                  //> java.lang.IndexOutOfBoundsException: Out of Bounds
                                                  //| 	at week3.nth$.nth$1(week3.nth.scala:5)
                                                  //| 	at week3.nth$.$anonfun$main$1(week3.nth.scala:11)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at week3.nth$.main(week3.nth.scala:3)
                                                  //| 	at week3.nth.main(week3.nth.scala)
}