import java.io.*;
import java.util.*;

public class ccc06s2 {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      char[] initial = in.readLine().toCharArray();
      char[] cipher = in.readLine().toCharArray();
      char[] next = in.readLine().toCharArray();
      char[] map = new char[91];
      for (int i = 0; i < initial.length; i++)
        map[cipher[i]] = initial[i];
      StringBuilder sb = new StringBuilder();
      for (char c : next)
        sb.append(map[c] > 0 ? map[c] : '.');
      System.out.println(sb.toString());
    } catch (IOException e) { e.printStackTrace(); }
  }
}
