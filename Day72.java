import java.util.Scanner;

public class Day72 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 72 : Latihan: Membuat Pola Segi Tiga Siku-Siku Terbalik
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan angka: ");
    int n = sc.nextInt();

    for (int i = n; i >= 1; i--) {

      for (int a = 0; a < n - i; a++) {
        System.out.print(" ");
      }

      for (int b = 0; b < i; b++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}