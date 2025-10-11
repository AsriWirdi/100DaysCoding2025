import java.util.Scanner;

public class Day34 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 34: Latihan: Mengkombinasikan berbagai operator.
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("---- Operator Aritmatika ----");
    int a = 15, b = 4;
    System.out.println("Penjumlahan: " + (a + b)); // 19
    System.out.println("Pengurangan: " + (a - b)); // 11
    System.out.println("Perkalian: " + (a * b)); // 60
    System.out.println("Pembagian: " + (a / b)); // 3
    System.out.println("Sisa Bagi: " + (a % b)); // 3

    System.out.println("---- Operator Increment & Decrement ----");
    int x = 5;
    System.out.println("x++ = " + (x++)); // 5 (pakai dulu, baru naik)
    System.out.println("Setelah x++: " + x); // 6
    System.out.println("++x = " + (++x)); // 7 (naik dulu, baru pakai)

    int y = 10;
    System.out.println("y-- = " + (y--)); // 10 (pakai dulu, baru turun)
    System.out.println("Setelah y--: " + y); // 9
    System.out.println("--y = " + (--y)); // 8 (turun dulu, baru pakai)

    System.out.println("---- Operator Penugasan ----");
    int total = 100;
    total += 50; // total = total + 50
    total -= 20; // total = total - 20
    total *= 2; // total = total * 2
    total /= 5; // total = total / 5
    total %= 3; // total = total % 3
    System.out.println("Hasil akhir total = " + total);

    System.out.println("Di suatu toko 'AsriKios', toko ini sangatlah menarik karena toko ini punya aturan yang unik, dimana pelanggannya hanya boleh berumur dari 18-25 tahun, tetapi yang berumur 20 tahun dan 24 tidak boleh dan pengecualian spesial untuk umur 30 itu boleh berbelanja, cetak apakah pelanggan bisa berbelanja di toko AsriKios dengan inputan dibawah ini");

    System.out.print("masukkan umur pelanggan: ");

    int umur = sc.nextInt();

    System.out.println((umur >= 18 && umur < 26) && (umur != 20 && umur != 24) || (umur == 30));

  }

}
