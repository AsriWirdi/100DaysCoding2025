import java.util.Scanner;

public class Day41 {

  /*
   * 100 Days Of Coding 2025
   * Day 41 : Evaluasi Mentor 2
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("=== Program Pemilihan Menu Makan Siang ===");
    System.out.println("Daftar Makanan: ");
    System.out.println("1. Nasi Goreng - Rp20000");
    System.out.println("2. Ayam Geprek - Rp22000");
    System.out.println("3. Mie Goreng - Rp18000");

    System.out.println("\nDaftar Minuman: ");
    System.out.println("1. Es Teh Manis - Rp5000");
    System.out.println("2. Jus Jeruk - Rp8000");
    System.out.println("3. Air Mineral - Rp3000");

    System.out.println("Masukkan 0 jika tidak ingin membeli minuman");

    String makanan = null;
    String minuman = null;
    int hMakan = 0;
    int hMinum = 0;

    int pilih1 = sc.nextInt();
    int pilih2 = sc.nextInt();

    if (pilih1 == 1) {
      makanan = "Nasi Goreng";
      hMakan = 20000;
    } else if (pilih1 == 2) {
      makanan = "Ayam Geprek";
      hMakan = 22000;
    } else if (pilih1 == 3) {
      makanan = "Mie Goreng";
      hMakan = 18000;
    } else {
      System.out.println("Anda harus memilih makanan utama terlebih dahulu");
      return;
    }

    if (pilih2 == 1) {
      minuman = "Es Teh Manis";
      hMinum = 5000;
    } else if (pilih2 == 2) {
      minuman = "Jus Jeruk";
      hMinum = 8000;
    } else if (pilih2 == 3) {
      minuman = "Air Mineral";
      hMinum = 3000;
    } else if (pilih2 == 0) {
      hMinum = 0;
    }

    int hTotal = hMakan + hMinum;
    int diskon = (int) (hTotal * 0.1);

    if (hMinum != 0) {
      System.out.println("Anda memesan " + makanan + " dan " + minuman);
      System.out.println("Total harga setelah diskon: Rp" + (hTotal - diskon));
    } else {
      System.out.println("Anda memesan " + makanan + " Tanpa Minuman");
      System.out.println("Total harga: Rp" + hTotal);
    }
  }

}
