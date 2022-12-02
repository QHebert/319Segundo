namespace nuevaLibreria

module fibos =
    let fibo1 n =
        let mutable s=""
        let mutable a = 0
        let mutable b = 1
        let mutable c = 1
        for i in 0..n do
           s <- s+" "+a.ToString()
           a <- b
           b <- c
           c <- a + b
        s
    let rec fib n =
        if n=0 then 0
        elif n=1 then 1
        elif n=2 then 1
        else fib (n-1) + fib (n-2)

    let fiboRec1 n =
        let mutable s = ""
        for i in 0..n do
            s<-s+" "+ (fib i).ToString()
        s
module Say =
    let hello name =
        printfn "Hello %s" name
