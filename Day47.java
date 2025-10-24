import java.util.Scanner;

public class Day47 {

  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 47 : Latihan: Program untuk Menentukan Hari
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan angka (1-7): ");
    byte pilihan = sc.nextByte();

    switch (pilihan) {
      case 1:
        System.out.println("Hari senin");
        break;
      case 2:
        System.out.println("Hari selasa");
        break;
      case 3:
        System.out.println("Hari rabu");
        break;
      case 4:
        System.out.println("Hari kamis");
        break;
      case 5:
        System.out.println("Hari jum'at");
        break;
      case 6:
        System.out.println("Hari sabtu");
        break;
      case 7:
        System.out.println("Hari minggu");
        break;
      default:
        System.out.println("inputan tidak valid (pilih 1-7)! ");
        break;
    }
  }
}
