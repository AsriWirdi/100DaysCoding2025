import java.util.Scanner;

public class Day70 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 70 Latihan: Membuat Pola Persegi Panjang
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Panjang: ");
    int p = sc.nextInt();

    System.out.print("Masukkan Lebar: ");
    int l = sc.nextInt();

    for (int i = 1; i <= p; i++) {
      for (int j = 1; j <= l; j++) {
        if (j == 1 || j == l) {
          System.out.print("|");
        } else {
          System.out.print(" - ");
        }
      }
      System.out.println();
    }
  }
}