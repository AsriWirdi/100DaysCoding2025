import java.util.Scanner;

public class Day37 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 37: Latihan: Menentukan bilangan ganjil atau genap
     */

    Scanner sc = new Scanner(System.in);

    int angka = sc.nextInt();
    if (angka != 0) {
      if (angka % 2 == 1) {
        System.out.println("Ganjil");
      } else {
        System.out.println("Genap");
      }
    } else {
      System.out.println("Netral");
    }
  }
}
