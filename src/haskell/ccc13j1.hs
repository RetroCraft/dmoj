import Control.Monad

readInt :: IO Int
readInt = fmap (read) getLine

main = do
  [a, b] <- replicateM (2) readInt
  print $ last $ take 3 [a,b..]
