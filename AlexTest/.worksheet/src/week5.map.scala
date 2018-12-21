package week5

object map {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(148); 

  def squareList(xs: List[Int]): List[Int] =
    xs match {
      case Nil     => ???
      case y :: ys => ???
    };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(65); 

  def squareList(xs: List[Int]): List[Int] =
    xs map x=>x*x;System.out.println("""squareList: (xs: List[Int])List[Int]""")}

}
