import java.util.*;

public class sixteenbitswonly {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int l = s.nextInt();
    for (int i = 0; i < l; i++)
      System.out.println(s.nextLong() * s.nextLong() == s.nextLong() ? "POSSIBLE DOUBLE SIGMA" : "16 BIT S/W ONLY");
    s.close();
  }
}
