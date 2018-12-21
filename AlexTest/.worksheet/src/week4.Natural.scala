package week4


object Natural {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 

	var a: Nat = new Succ(Zero);System.out.println("""a  : week4.Nat = """ + $show(a ));$skip(26); 
	var b: Nat = new Succ(a);System.out.println("""b  : week4.Nat = """ + $show(b ));$skip(7); val res$0 = 
	b + a;System.out.println("""res0: week4.Nat = """ + $show(res$0));$skip(46); 
	
  println("Welcome to the Scala worksheet")}
}

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("Predecesor invoked to Zero")
  def +(that: Nat) = that
  def -(that: Nat) = {
  if(that.isZero) this
  else throw new Error("Substract from Zero invoked")
  }
}

class Succ(n: Nat) extends Nat {
  def isZero = false
  
  def predecessor = n
  
  def +(that: Nat): Nat = {
    if (that.isZero == false) this.successor + that.predecessor
    else this
  }
  
  def -(that: Nat): Nat = {
  	if(this.isZero) throw new NoSuchElementException("Result is negative")
  	else if(that.isZero == false) this.predecessor - that.predecessor
  	else this
  }
}
