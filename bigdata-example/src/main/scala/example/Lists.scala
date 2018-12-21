package example


object Lists {
  
    def sum(xs: List[Int]): Int = {
      
      //if (xs.isEmpty) throw new NoSuchElementException("Empty List - sum")  
      recS(xs)
    }
    
    def recS(xs: List[Int]): Int = {
     if (!xs.isEmpty) {
       return xs.head+recS(xs.tail) 
       }
     return 0;
    }
  


    var m:Int = 0
    def max(xs: List[Int]): Int = {
    
      if(xs.isEmpty) throw new NoSuchElementException("Empty List - max")
      m=xs.head
      recM(xs.tail)

    }
    
    def recM(xs: List[Int]): Int = { 
      if(xs.tail.isEmpty) return xs.head
      return maxab(xs.head,recM(xs.tail))
    }
    
    def maxab(a:Int, b:Int): Int = {
        return if(a<b) b else a
    }
    
    
  }

