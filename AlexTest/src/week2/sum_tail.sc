package week2

object sum_tail {

  def sum(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + a)
    }
    loop(a, 0)
  }                                               //> sum: (a: Int, b: Int)Int

  sum(1,                                          //> res0: Int = 63)
}