object intSets {

  val t1 = new NonEmpty(9, Empty, Empty)          //> t1  : NonEmpty = {.9.}
  val t2 = t1 incl 1 incl 10 incl 11 incl 8 incl 4 incl 3 incl 8
                                                  //> t2  : IntSet = {{.1{{{.3.}4.}8.}}9{.10{.11.}}}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

object Empty extends IntSet {
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  def contains(x: Int): Boolean = false
  def union(other: IntSet): IntSet = other
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left.incl(x), right)
    else if (x > elem) new NonEmpty(elem, left, right.incl(x))
    else this

  def contains(x: Int): Boolean =
    if (x < elem) left.contains(x)
    else if (x > elem) right.contains(x)
    else true

  def union(other: IntSet): IntSet =
  	left.union(right).union(other).incl(elem)

  override def toString = "{" + left.toString + elem + right.toString + "}"
}