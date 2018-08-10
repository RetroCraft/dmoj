import java.io.*;
import java.util.*;

public class ccc14j2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    in.readLine();
    Arrays.stream(in.readLine().split(""))
      .map(x -> x.equals("A") ? 1 : -1)
      .reduce(Integer::sum)
      .ifPresent(x -> System.out.println(x == 0 ? "Tie" : x > 0 ? "A" : "B"));
  }
}
