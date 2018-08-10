import java.io.*;
import java.util.*;

public class ccc00j2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int min = Integer.parseInt(in.readLine());
    int max = Integer.parseInt(in.readLine());
    int total = 0;
    for (int i = min; i <= max; i++) {
      String s = Integer.toString(i);
      if (s.equals(flip(s))) {
        total++;
      }
    }
    System.out.println(total);
  }

  static String flip(String s) {
    StringBuilder sb = new StringBuilder();
    for (char a : s.toCharArray()) {
      if (a == '1' || a == '8' || a == '0')
        sb.insert(0, a);
      else if (a == '6')
        sb.insert(0, '9');
      else if (a == '9')
        sb.insert(0, '6');
      else
        return "";
    }
    return sb.toString();
  }
}
