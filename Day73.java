import java.util.Scanner;

public class Day73 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 73 : Latihan: Penjumlahan Angka (berhenti ketika menginputkan angka negatif)
     */

    Scanner sc = new Scanner(System.in);

    int sum = 0;
    while (true) {
      System.out.print("masukkan angka: ");
      int n = sc.nextInt();

      if (n < 0) {
        sum += Math.abs(n);
        break;
      }
      sum += n;
    }

    System.out.println("Hasil : " + sum);
  }
}
