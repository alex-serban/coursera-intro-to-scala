package week2

object fixedPoints {

  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def fixedPoint(f: Double => Double)(x: Double): Double =
    if (abs(f(x) - x) < 0.0001) x
    else fixedPoint(f)(f(x))                      //> fixedPoint: (f: Double => Double)(x: Double)Double

  fixedPoint(x => 1 + 1 / x)(100)                 //> res0: Double = 1.6179787828029033
  def sqrt(x: Double): Double = fixedPoint(y => (x / y + y) / 2)(1)
                                                  //> sqrt: (x: Double)Double

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double

  def sqrt2(x: Double): Double = fixedPoint(averageDamp(y => x / y))(1)
                                                  //> sqrt2: (x: Double)Double

  sqrt(7)                                         //> res1: Double = 2.64576704419029
  sqrt2(7)                                        //> res2: Double = 2.64576704419029
}