package week3

abstract class Arb {
  def include(x: Int): Arb
  def remove(x: Int): Arb
  def contains(x: Int): Boolean
  def union(a: Arb): Arb
}

object Empty extends Arb {
  def include(x: Int) = new NonEmpty(x, Empty, Empty)
  def remove(x: Int) = this
  def contains(x: Int) = false
  def union(a: Arb) = a
  override def toString = "."
}

class NonEmpty(value: Int, left: Arb, right: Arb) extends Arb {

  def include(x: Int): Arb = {
    if (x > value) new NonEmpty(value, left, right.include(x))
    else if (x < value) new NonEmpty(value, left.include(x), right)
    else this
  }

  def remove(x: Int): Arb = {
    if (x > value) new NonEmpty(value, left, right.remove(x))
    else if (x < value) new NonEmpty(value, left.remove(x), right)
    else left.union(right)
  }

  def union(a: Arb): Arb = right.union(left.union(a.include(value))) 

  def contains(x: Int): Boolean = {
    if (x < value) left.contains(x)
    else if (x > value) right.contains(x)
    else true
  }
  override def toString = 
    left.toString() + " "+ value  + " " + right.toString()

}

object ABC extends App {
  //println("Hello world")
  
  var a: Arb = new NonEmpty(1, new NonEmpty(0, Empty, Empty), new NonEmpty(3, Empty, Empty))
  var b: Arb = new NonEmpty(9, new NonEmpty(8, Empty, Empty), new NonEmpty(10, Empty, Empty))
  
  println(a.toString())
  //b=b.include(2)
  println(b.toString())
  
  println(a.union(b).toString())
}