import java.io.*;
import java.util.*;

public class ccc08j3 {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String map = "ABCDEFGHIJKLMNOPQRSTUVWXYZ -.\n";
      char[] target = (in.readLine() + "\n").toCharArray();
      int total = 0;
      int currentPosition = 0;
      for (char c : target) {
        int to = map.indexOf(c);
        int toX = to % 6;
        int toY = to / 6;
        int fromX = currentPosition % 6;
        int fromY = currentPosition / 6;
        int distance = Math.abs(toX - fromX) + Math.abs(toY - fromY);
        total += distance;
        currentPosition = to;
      }
      System.out.println(total);
    } catch (IOException e) { e.printStackTrace(); }
  }
}
