import java.util.Scanner
object subconjunto {
    def main(args:Array[String]) :Unit = 
    { 
        val scanner = new java.util.Scanner(System.in)
        println("Primer conjunto separado por ,")
        var sub=scanner.nextLine()
        val sub1 : List[String] = sub.split(",").map(_.trim).toList
        println("Segundo conjunto separado por ,")
        sub=scanner.nextLine()
        var sub2 : List[String] = sub.split(",").map(_.trim).toList
        var comprueba = true 
        for ( x <- sub2 ) {
         if( !sub1.contains(x)){ comprueba = false}
         }
         print (comprueba)
    } 
}