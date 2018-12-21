object helloworksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = 1                                       //> x  : Int = 1
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 2
  var y = 100                                     //> y  : Int = 100
  y = y + 1
  println(y)                                      //> 101
}