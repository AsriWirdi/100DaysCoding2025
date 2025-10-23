import java.util.Scanner;

public class Day46 {

  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 46 : Latihan: Membuat Menu Menggunakan Switch-case
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("Game Pilihan: ");
    System.out.println("1. PUBG");
    System.out.println("2. Free Fire");
    System.out.println("3. Mobile Legend");

    System.out.print("pilih game (1, 2, 3) untuk bermain: ");
    char game = sc.next().charAt(0);

    switch (game) {
      case '1':
        System.out.println("Play PUBG...");

        break;
      case '2':
        System.out.println("Play Free Fire...");
        break;
      case '3':
        System.out.println("Play Mobile Legend...");
        break;
      default:
        System.out.println("Masukan Tidak ada di Pilihan...");
        break;
    }
  }
}
