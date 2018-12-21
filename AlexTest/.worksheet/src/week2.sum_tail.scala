package week2

object sum_tail {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(186); 

  def sum(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + a)
    }
    loop(a, 0)
  };System.out.println("""sum: (a: Int, b: Int)Int""");$skip(11); val res$0 = 

sum(1, 3);System.out.println("""res0: Int = """ + $show(res$0))}
}
