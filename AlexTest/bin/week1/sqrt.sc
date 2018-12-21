package week1

object ciorna {
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
  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
}