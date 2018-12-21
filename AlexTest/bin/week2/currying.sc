package week2

object currying {

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    {
      if (a > b) zero
      else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
    }                                             //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int

  def product(f: Int => Int) (a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f) (a + 1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int

  def factorial(x: Int): Int = product(x => x)(1, x)
                                                  //> factorial: (x: Int)Int
  factorial(0)                                    //> res0: Int = 1

  mapReduce(factorial, (a, b) => a * b, 1)(1, 5)  //> res1: Int = 34560

}