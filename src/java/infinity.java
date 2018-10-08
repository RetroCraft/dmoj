import java.io.*;

public class infinity {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out
        .println(Long.parseLong(in.readLine(), 16) * Long.parseLong(in.readLine(), 16) > 0x3F3F3F3F ? "Yes" : "No");
  }
}
