package week2

object functions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  var v = new Rational(5, 2);System.out.println("""v  : week2.Rational = """ + $show(v ));$skip(28); val res$0 = 
  v.add(new Rational(3, 2));System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(37); val res$1 = 
  v.add(new Rational(3, 2)).toString;System.out.println("""res1: String = """ + $show(res$1));$skip(37); val res$2 = 
  v.sub(new Rational(3, 2)).toString;System.out.println("""res2: String = """ + $show(res$2));$skip(13); val res$3 = 
  v.toString;System.out.println("""res3: String = """ + $show(res$3));$skip(8); val res$4 = 
  v.neg;System.out.println("""res4: week2.Rational = """ + $show(res$4))}
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must not be 0")
  private def g = gcd(x, y)
  private def abs(x: Int) = if (x < 0) -x else x

  def numer = x
  def denom = y

  //def this(x: Int) = this(x, 1)

  def add(a: Rational) =
    new Rational(
      numer * a.denom + a.numer * denom,
      a.denom * denom)

  def sub(a: Rational) = add(a.neg)

  override def toString = numer / gcd(numer, denom) + "/" + denom / gcd(numer, denom)

  def neg = new Rational(-numer, denom)

  private def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
}
  