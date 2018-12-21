package week2

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(226); 

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    {
      if (a > b) zero
      else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
    };System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(116); 

  def product(f: Int => Int) (a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f) (a + 1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(55); 

  def factorial(x: Int): Int = product(x => x)(1, x);System.out.println("""factorial: (x: Int)Int""");$skip(15); val res$0 = 
  factorial(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(51); val res$1 = 

  mapReduce(factorial, (a, b) => a * b, 1)(1, 5);System.out.println("""res1: Int = """ + $show(res$1))}

}
