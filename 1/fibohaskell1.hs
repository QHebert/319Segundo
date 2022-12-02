import Data.List
--fibonacci estructurado 
fibo1 :: Integer -> Integer
fibo1 n| n == 0 = 0
      | n == 1 = 1
      | n == 2 = 1
      | n > 2 = fibo1(n-1) + fibo1 (n-2) +fibo1 (n-3)

fibo2 :: [Integer]
fibo2 = 0 : 1 : 1 : zipWith (+) (zipWith (+) fibo2 (tail fibo2)) (drop 2 fibo2)

-- Fibonacci Recursivo 
fiboRec1 :: Integer -> Integer
fiboRec1 0 = 0
fiboRec1 1 = 0
fiboRec1 2 = 1
fiboRec1 n = fiboRec1 (n-1) + fiboRec1 (n-2) + fiboRec1 (n-3)

fiboRec2 :: [Integer]
fiboRec2 = aux 0 1 1
 where aux x y z = x: aux y z (x+y+z)

main = do
 putStrLn "cuantos seran los numeros de la secuencia? "
 dato <- getLine
 let serie = read dato::Int
 putStrLn "fibonacci estructurado 1"
 print(take serie [fibo1 n | n <- [0..]])
 putStrLn "fibonacci estructurado 2"
 print(take serie fibo2)
 putStrLn "fibonacci recursivo 1"
 print(take serie [fiboRec1 n | n <- [1..]])
 putStrLn "fibonacci recursivo 2"
 print(take serie fiboRec2)