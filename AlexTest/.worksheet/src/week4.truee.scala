package week4
//package idealized.scala

abstract class Boolean {
  def ifThenElse[T](t: T, e: T): T

  def &&(x: Boolean): Boolean = ifThenElse(x, falsee)
  def ||(x: Boolean): Boolean = ifThenElse(truee, x)
  def unary_! : Boolean = ifThenElse(falsee, truee)

  def ==(x: Boolean): Boolean = ifThenElse(x, x.unary_!)
  def !=(x: Boolean): Boolean = ifThenElse(x.unary_!, x)
}

object truee extends Boolean {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(445); 
  def ifThenElse[T](t: T, e: T) = t;System.out.println("""ifThenElse: [T](t: T, e: T)T""")}
}

object falsee extends Boolean {
  def ifThenElse[T](t: T, e: T) = e
}
 
object idealized {

	//truee && falsee
	
	println("test")
	
}
