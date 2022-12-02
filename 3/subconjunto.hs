subconjunto :: Eq a => [a] -> [a] -> Bool
subconjunto xs ys = 
  [x | x <- ys, x `elem` xs] == ys