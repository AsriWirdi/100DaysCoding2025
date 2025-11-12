import java.util.Scanner;

public class Day66 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 66 : Latihan: Membuat Pola Vertikal
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Angka : ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.print("- ");
    }

  }
}