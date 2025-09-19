import java.util.Scanner;

public class Day12 {
  public static void main(String... args) {
    /*
     * 100 Days Of Coding 2025
     * Day 12: Latihan: Membuat Program Biodata Sederhana.
     */

    Scanner sc = new Scanner(System.in);

    System.out.println("====== BIODATA SEDERHANA ======");
    System.out.print("Masukkan Nama: ");
    String nama = sc.nextLine();

    System.out.print("Masukkan Umur: ");
    int umur = sc.nextInt();
    sc.nextLine();

    System.out.print("Masukkan Alamat: ");
    String alamat = sc.nextLine();

    System.out.print("Masukkan Tinggi Badan: ");
    double tb = sc.nextDouble();

    System.out.println();

    System.out.println("====== BIODATA SEDERHANA ======");
    System.out.println("Nama         :    " + nama);
    System.out.println("Umur         :    " + umur);
    System.out.println("Alamat       :    " + alamat);
    System.out.println("Tinggi Badam :    " + tb);

  }
}
