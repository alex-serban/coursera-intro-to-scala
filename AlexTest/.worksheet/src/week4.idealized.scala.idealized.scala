package week4
package idealized.scala
 
object idealized {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); val res$0 = 
	falsee < falsee;System.out.println("""res0: week4.idealized.scala.Boolean = """ + $show(res$0));$skip(17); 
	println("test")}
}

abstract class Boolean {
  def ifThenElse[T](t: T, e: T): T

  def &&(x: Boolean): Boolean = ifThenElse(x, falsee)
  def ||(x: Boolean): Boolean = ifThenElse(truee, x)
  def unary_! : Boolean = ifThenElse(falsee, truee)

  def ==(x: Boolean): Boolean = ifThenElse(x, x.unary_!)
  def !=(x: Boolean): Boolean = ifThenElse(x.unary_!, x)
  
  // false < true - true
  // false < false - false
  // true < false - false
  // true < true - false
  
  
  def <(x: Boolean): Boolean = ifThenElse(falsee, x)
  
  
}

object truee extends Boolean {
  def ifThenElse[T](t: T, e: T) = t
  override def toString = "true"
}

object falsee extends Boolean {
  def ifThenElse[T](t: T, e: T) = e
  override def toString = "false"
}
