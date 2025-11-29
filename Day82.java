import java.util.Scanner;

public class Day82 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 82 : Latihan: Mengisi Elemen Array dan Menampilkan semua elemen Array dengan Perulangan
     */

    Scanner sc = new Scanner(System.in);

    int[] angka = new int[5];

    for (int i = 0; i < angka.length; i++) {
      System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
      angka[i] = sc.nextInt();
    }

    for (int i = 0; i < angka.length; i++) {
      System.out.println("Index " + i + " = " + angka[i]);
    }

  }
}
