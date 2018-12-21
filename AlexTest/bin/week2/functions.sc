package week2

object functions {
  var v = new Rational(5, 2)                      //> v  : week2.Rational = 5/2
  v.add(new Rational(3, 2))                       //> res0: week2.Rational = 4/1
  v.add(new Rational(3, 2)).toString              //> res1: String = 4/1
  v.sub(new Rational(3, 2)).toString              //> res2: String = 1/1
  v.toString                                      //> res3: String = 5/2
  v.neg                                           //> res4: week2.Rational = -5/2
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
  