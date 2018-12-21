package week4


object Natural {

	var a: Nat = new Succ(Zero)               //> a  : week4.Nat = week4.Succ@1a86f2f1
	var b: Nat = new Succ(a)                  //> b  : week4.Nat = week4.Succ@2f7c7260
	b + a                                     //> res0: week4.Nat = week4.Succ@2d209079
	
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
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
