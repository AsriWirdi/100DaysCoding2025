import java.util.Scanner;

public class Day39 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 39: Latihan: Membuat Menu menggunakan if
     */

    Scanner sc = new Scanner(System.in);

    System.out.println("Pilihan Menu: ");
    System.out.println("1. Nasi Goreng (Rp 20.000)");
    System.out.println("2. Mie Ayam (Rp 15.000)");
    System.out.println("3. Sate Kambing (Rp 30.000)");
    System.out.println("4. Es Teler (Rp 10.000)");

    System.out.print("Pilih Menu: ");
    int angka = sc.nextInt();

    String menu = null;
    int harga = 0;

    System.out.println();
    if (angka == 1) {
      menu = "Nasi Goreng";
      harga = 20000;
    } else if (angka == 2) {
      menu = "Mie Ayam";
      harga = 15000;
    } else if (angka == 3) {
      menu = "Sate Kambing";
      harga = 30000;
    } else if (angka == 4) {
      menu = "Es Teler";
      harga = 10000;
    } else {
      System.out.println("Masukan tidak ada di pilihan menu!");
      return;
    }

    System.out.println("Anda Telah Memilih: " + menu);
    System.out.println("Seharga Rp " + harga);
    System.out.println("Terima kasih telah memesan!");
  }
}
