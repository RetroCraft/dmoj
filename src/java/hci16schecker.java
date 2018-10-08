import java.io.*;
import java.util.*;

public class hci16schecker {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> dict = new ArrayList<>();
      int size = Integer.parseInt(in.readLine());
      for (int i = 0; i < size; i++) {
        dict.add(in.readLine());
      }
      for (String s : in.readLine().split("\\s")) {
        if (!dict.contains(s)) {
          System.out.println("Incorrect");
          return;
        }
      }
      System.out.println("Correct");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
