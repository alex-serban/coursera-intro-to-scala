package week4

trait Expr {
  def show(mult: Boolean): String = this match {
    case Number(n) => n.toString
    case Sum(e1, e2) => {
      if (mult == true) "(" + e1.show(false) + " + " + e2.show(false) + ")"
      else e1.show(false) + " + " + e2.show(false)
    }
    case Prod(e1, e2) => e1.show(true) + " * " + e2.show(true)
  }
}
case class Number[T](n: T) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr

object Expression extends App {
  var e = Sum(Prod(Number(1), Sum(Number(2), Number(9))), Sum(Number(3), Number(5)))
  var f = Sum(Prod(Number(2), Number("x")), Number("y"))
  var g = Prod(Sum(Number(2), Number("x")), Number("y"))

  println("e= " + e.show(true))
  println("f= " + f.show(true))
  println("g= " + g.show(true))
}