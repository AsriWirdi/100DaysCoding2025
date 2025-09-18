import java.util.Scanner;

public class Day11 {
  public static void main(String... args) {
    /*
     * 100 Days Of Coding 2025
     * Day 11: Menerima Input dari Keyboard (pengenalan Scanner).
     */

    // Dengan Scanner, kita bisa membaca input data baik itu berupa input dari Keyboard maupun File.
    // Untuk menggunakan Scanner kita harus import dulu.

    /*
     * Lalu buat objek Scannernya
     * Scanner input = new Scanner(System.in); untuk membaca input dari keyboard.
     * Scanner input = new Scanner("Asri Wirdi"); untuk membaca dari String.
     * Scanner input = new Scanner(new File("data.txt")); untuk membaca dari File.
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan nama: ");
    String nama = sc.nextLine(); // Membaca satu baris penuh (termasuk spasi)

    System.out.print("masukkan Umur: ");
    int umur = sc.nextInt(); // Membaca bilangan bulat (int)

    // dan masih banyak lagi method dari Scanner untuk membaca tipe data seperti :
    /*
     * 1. next() - Membaca satu kata (berhenti di spasi/tab/newline)
     * 2. nextLine() - Membaca satu baris penuh (termasuk spasi)
     * 3. nextInt() - Membaca bilangan bulat (int)
     * 4. nextLong() - Membaca bilangan bulat besar (long)
     * 5. nextDouble() - Membaca bilangan desimal (double)
     * 6. nextFloat() - Membaca bilangan desimal (float)
     * 7. nextBoolean() - Membaca nilai true/false
     * 8. hasNext() - Mengecek apakah masih ada input berikutnya
     * 9. hasNextInt() - Mengecek apakah input berikutnya bertipe int
     */
  }
}
