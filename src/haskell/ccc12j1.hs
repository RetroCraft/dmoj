import Control.Monad

readInt :: IO Double
readInt = fmap (read) getLine

speedTell :: (RealFloat a) => a -> a -> String  
speedTell limit speed
  | over >= 31  = speeding ++ "500."
  | over >= 21  = speeding ++ "270."
  | over >= 1   = speeding ++ "100."
  | otherwise   = "Congratulations, you are within the speed limit!"
  where over = speed - limit
        speeding = "You are speeding and your fine is $"

main = do
  [l, s] <- replicateM (2) readInt
  putStrLn $ speedTell l s
