import java.util.Scanner;

public class Day42 {

  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 42 : Latihan: Menentukan Gaji Bersih
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan gaji pokok: ");
    int gajiPokok = sc.nextInt();

    System.out.print("Masukkan jumlah jam lembur: ");
    int lembur = sc.nextInt();

    int gajiLembur = 55000;
    int gajiBersih = gajiPokok + (lembur * gajiLembur);
    System.out.println("Gaji bersih yang diterima: " + gajiBersih);

  }

}
