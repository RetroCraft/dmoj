import java.io.*;
import java.util.*;

public class ccc14j3 {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int size = Integer.parseInt(in.readLine());
      int antonia = 100;
      int david = 100;
      for (int i = 0; i < size; i++) {
        String[] line = in.readLine().split(" ");
        int rollA = Integer.parseInt(line[0]);
        int rollB = Integer.parseInt(line[1]);
        if (rollA > rollB) david -= rollA;
        if (rollB > rollA) antonia -= rollB;
      }
      System.out.println(antonia + "\n" + david);
    } catch (IOException e) { e.printStackTrace(); }
  }
}
