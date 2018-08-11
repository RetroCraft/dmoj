import java.io.*;
import java.util.*;

public class ccc12j3 {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int size = Integer.parseInt(in.readLine());
      StringBuilder sb = new StringBuilder();
      String[] map = { "*", "x", "*", " ", "x", "x", "*", " ", "*" };
      for (int i = 0; i < map.length; i++) {
        sb.append(new String(new char[size]).replace("\0", map[i]));
        if ((i + 1) % 3 == 0) sb.append('\n');
      }
      String[] lines = sb.toString().split("\n");
      StringBuilder sb2 = new StringBuilder();
      for (String s : lines) 
        sb2.append(new String(new char[size]).replace("\0", s + "\n"));
      System.out.print(sb2.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
