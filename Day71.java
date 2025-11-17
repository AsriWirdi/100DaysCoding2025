import java.util.Scanner;

public class Day71 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 71 : Latihan: Membuat Pola Segi Tiga Siku-siku
     */

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      boolean bintang = (i % 2 == 1);

      for (int j = 1; j <= i; j++) {
        System.out.print(bintang ? "*" : "#");
        bintang = !bintang;
      }
      System.out.println();
    }
  }
}