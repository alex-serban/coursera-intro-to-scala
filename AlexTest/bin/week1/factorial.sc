package week1

object factorial {

  def factorial(x: Int) =
    {

      def factorialIter(x: Int, p: Int): Int =
        if (x == 0) p
        else factorialIter(x - 1, p * x)

      factorialIter(x, 1)

    }
  factorial(4)

}