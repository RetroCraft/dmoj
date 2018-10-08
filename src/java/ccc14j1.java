import java.io.*;

public class ccc14j1 {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int a = Integer.parseInt(in.readLine());
      int b = Integer.parseInt(in.readLine());
      int c = Integer.parseInt(in.readLine());
      if (a + b + c != 180) {
        System.out.println("Error");
        return;
      }
      if (a == b && b == c) {
        System.out.println("Equilateral");
        return;
      }
      if (a == b || b == c || a == c) {
        System.out.println("Isosceles");
        return;
      }
      System.out.println("Scalene");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
