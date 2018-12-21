package sqrt

object ciorna {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(431); 
  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs((guess * guess) - x) / x < 0.0001

    def abs(x: Double) =
      if (x < 0) -x
      else x

    def improve(guess: Double): Double =
      ((x / guess) + guess) / 2

    sqrtIter(1)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0))}
}
