package week4

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(217); 
  def isZero = true;System.out.println("""isZero: => Boolean""");$skip(66); 
  def predecessor = throw new Error("Predecesor invoked to Zero");System.out.println("""predecessor: => Nothing""");$skip(26); 
  def +(that: Nat) = that;System.out.println("""+ : (that: week4.Nat)week4.Nat""");$skip(104); 
  def -(that: Nat) = {
  if(that.isZero) this
  else throw new Error("Substract from Zero invoked")
  };System.out.println("""- : (that: week4.Nat)week4.Nat""")}
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

object Natural {

	new Succ(Zero)
	
  println("Welcome to the Scala worksheet")
}
