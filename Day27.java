import java.util.Scanner;

public class Day27 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 27: Evaluasi
     */

    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int l = sc.nextInt();

    int keramik = 2 * 2;

    int totalKeramik = (p * l) / keramik;
    System.out.println(totalKeramik);
  }
}