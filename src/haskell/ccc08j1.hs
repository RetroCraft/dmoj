import Control.Monad

readDouble :: IO Double
readDouble = fmap (read) getLine

bmiTell :: (RealFloat a) => a -> a -> String  
bmiTell weight height
  | bmi < 18.5  = "Underweight"
  | bmi <= 25.0 = "Normal weight"
  | otherwise   = "Overweight"
  where bmi = weight / height ^ 2

main = do
  [w, h] <- replicateM (2) readDouble
  putStrLn $ bmiTell w h
