import Data.List

main = do
  str <- getLine
  let valid = null . snd $ partition (`elem` "IOSHZXN") str
  putStrLn (if valid then "YES" else "NO")
