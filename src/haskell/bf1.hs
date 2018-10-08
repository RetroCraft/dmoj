import Control.Monad
import Data.List

readInt :: IO Int
readInt = fmap (read) getLine

main = do
  lines <- getLine
  a <- replicateM (read lines) readInt
  mapM print (sort a)
