import Control.Monad

readInts :: IO [Int]
readInts = fmap (map read.words) getLine

main = do
  lines <- getLine
  stuff <- replicateM (read lines) readInts
  let sums = [ sum x | x <- stuff ]
  mapM print sums
