package week1

object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(216); 

  def factorial(x: Int) =
    {

      def factorialIter(x: Int, p: Int): Int =
        if (x == 0) p
        else factorialIter(x - 1, p * x)

      factorialIter(x, 1)

    };System.out.println("""factorial: (x: Int)Int""");$skip(15); val res$0 = 
  factorial(4);System.out.println("""res0: Int = """ + $show(res$0))}

}
