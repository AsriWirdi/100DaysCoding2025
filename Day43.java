import java.util.Scanner;

public class Day43 {

  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 43 : Latihan: Program Kelipatan 3,5, 3 dan 5
     */

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 3 == 0 && n % 5 == 0) {
      System.out.println("Kelipatan 3 dan 5");
    } else if (n % 3 == 0) {
      System.out.println("Kelipatan 3");
    } else if (n % 5 == 0) {
      System.out.println("Kelipatan 5");
    } else {
      System.out.println("Tidak termasuk kategori");
    }
  }

}
