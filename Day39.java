import java.util.Scanner;

public class Day39 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 39: Latihan: Membuat Menu menggunakan if
     */

    Scanner sc = new Scanner(System.in);

    System.out.println("Andi pergi ke sebuah restoran untuk makan siang. Ia melihat menu makanan yang tersedia dan memutuskan untuk memesan salah satu dari menu tersebut. Menu makanan yang tersedia adalah:\n");
    System.out.println("1. Nasi Goreng (Rp 20.000)");
    System.out.println("2. Mie Ayam (Rp 15.000)");
    System.out.println("3. Sate Kambing (Rp 30.000)");
    System.out.println("4. Es Teler (Rp 10.000)");

    System.out.print("Andi memilih dengan nomor menu yang diinginkan: ");
    int angka = sc.nextInt();

    System.out.println(); 
    if(angka == 1){
      System.out.println("Anda Telah Memilih: Nasi Goreng");
      System.out.println("Seharga Rp 20.000");
      System.out.println("Terima kasih telah memesan!");
    } else if (angka == 2) {
      System.out.println("Anda Telah Memilih: Mie Ayam");
      System.out.println("Seharga Rp 15.000");
      System.out.println("Terima kasih telah memesan!");
    } else if (angka == 3) {
      System.out.println("Anda Telah Memilih: Sate Kambing");
      System.out.println("Seharga Rp 30.000");
      System.out.println("Terima kasih telah memesan!");
    } else if (angka == 4) {
      System.out.println("Anda Telah Memilih: Es Teler");
      System.out.println("Seharga Rp 10.000");
      System.out.println("Terima kasih telah memesan!");
    } else{
      System.out.println("Masukan tidak ada di pilihan menu!");
    }
  
  }
}
