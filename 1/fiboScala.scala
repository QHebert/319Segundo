import java.util.Scanner
import scala.collection.mutable._

object MyClass {
    def main(args: Array[String]) : Unit ={

        val scanner = new java.util.Scanner(System.in)

        println("Cuantos digitos de la serie desea?")
        var n=scanner.nextInt()
        fibo1(n)
        print("\nfibonacci Estructurado 2\n")
        (0 to n-1).foreach( (x : Int) => print(fibo2(x) + " "))
        print("\nfibonacci Recursivo 1\n")
        (0 to n-1).foreach( (x : Int) => print(fiboRec1(x) + " "))
        print("\nfibonacci Recursivo 2\n")
        print( (fiboRec2() take n).toList)
    }
    def fibo1(n:Int ):Unit={
        var a = -1
        var b = 1
        var c = 0
        var d = 0
        var cont = n
        println("fibonacci estructurado 1")
        while (cont>0){
            d = a + b + c
            print(d +" ")
            a = b
            b = c
            c = d
            cont = cont-1
        }
    }
    def fibo2(i : Int) : Int = {
        i match {
            case 0|1=>i
            case 2 => 1
            case _=>{
                var a=0
                var b=1
                var c=1
                var d=0
                var n =i
                while (n > 2)
                {
                 d = a + b + c
                 a = b
                 b = c
                 c = d
                 n = n-1
                }
                c;}
        }
    }
    def fiboRec1(n:Int):Int ={
        n match{ 
            case 0|1 =>n
            case 2 => 1
            case _ =>fiboRec1(n - 1) + fiboRec1(n - 2) + fiboRec1(n - 3)
        }
    }
    def fiboRec2(a: Int = 0, b: Int = 1,c: Int = 1): Stream[Int] = Stream.cons(a, fiboRec2(b,c, a+b+c))

}