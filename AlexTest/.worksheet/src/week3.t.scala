package week3
import week2._

object t {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(786); 

  def times(chars: List[Char]): List[(Char, Int)] = {

    def existz(l: List[(Char, Int)], c: Char): Boolean = l match {
      case List() => false
      case h :: t => {
        if (h._1 == c) true
        else existz(t, c)
      }
    }
    def count(charz: List[Char], c: Char, n: Int): Int = {
      if (charz == Nil) n
      else if (charz.head == c) count(charz.tail, c, n + 1)
      else count(charz.tail, c, n)
    }

    def buildTimes(charz: List[Char], timez: List[(Char, Int)]): List[(Char, Int)] = {
      if (charz == Nil) timez
      else if (!existz(timez, charz.head)) buildTimes(charz.tail, (charz.head, count(charz, charz.head, 0)) :: timez)
      else buildTimes(charz.tail, timez)
    }

    buildTimes(chars, List())

  };System.out.println("""times: (chars: week3.List[Char])week3.List[(Char, Int)]""")}
  
}
