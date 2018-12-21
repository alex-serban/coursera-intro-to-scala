package week2

object fixedPoints {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 

  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(124); 

  def fixedPoint(f: Double => Double)(x: Double): Double =
    if (abs(f(x) - x) < 0.0001) x
    else fixedPoint(f)(f(x));System.out.println("""fixedPoint: (f: Double => Double)(x: Double)Double""");$skip(36); val res$0 = 

  fixedPoint(x => 1 + 1 / x)(100);System.out.println("""res0: Double = """ + $show(res$0));$skip(68); 
  def sqrt(x: Double): Double = fixedPoint(y => (x / y + y) / 2)(1);System.out.println("""sqrt: (x: Double)Double""");$skip(69); 

  def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(74); 

  def sqrt2(x: Double): Double = fixedPoint(averageDamp(y => x / y))(1);System.out.println("""sqrt2: (x: Double)Double""");$skip(12); val res$1 = 

  sqrt(7);System.out.println("""res1: Double = """ + $show(res$1));$skip(11); val res$2 = 
  sqrt2(7);System.out.println("""res2: Double = """ + $show(res$2))}
}
