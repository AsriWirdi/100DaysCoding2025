import java.util.Scanner;

public class Day83 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 82 : Latihan: Menjumlahkan Elemen Array
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("Berapa kali Alya belajar hari ini: ");
    int n = sc.nextInt();

    int[] jam = new int[n];
    int[] menit = new int[n];
    int[] detik = new int[n];

    int totalDetik = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Sesi ke-" + (i + 1));

      System.out.print("Jam   : ");
      jam[i] = sc.nextInt();

      System.out.print("Menit : ");
      menit[i] = sc.nextInt();

      System.out.print("Detik : ");
      detik[i] = sc.nextInt();

      totalDetik += jam[i] * 3600 + menit[i] * 60 + detik[i];
    }

    int totalJam = totalDetik / 3600;
    int sisa = totalDetik % 3600;
    int totalMenit = sisa / 60;
    int totalDetikFinal = sisa % 60;

    System.out.println();
    System.out.println("Total : " + totalJam + " jam " + totalMenit + " menit " + totalDetikFinal + " detik");

    if (totalJam > 24) {
      System.out.println("Seppuh");
    } else if (totalJam >= 8) {
      System.out.println("Abang Jago");
    } else {
      System.out.println("Kapan Jago?");
    }

  }
}
