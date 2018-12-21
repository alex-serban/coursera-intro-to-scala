object intSets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 

  val t1 = new NonEmpty(9, Empty, Empty);System.out.println("""t1  : NonEmpty = """ + $show(t1 ));$skip(65); 
  val t2 = t1 incl 1 incl 10 incl 11 incl 8 incl 4 incl 3 incl 8;System.out.println("""t2  : IntSet = """ + $show(t2 ))}
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
