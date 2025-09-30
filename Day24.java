import java.util.Scanner;

public class Day24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /*
     * 100 Days Of Coding 2025
     * Day 24: Latihan: Program Luas Lingkaran.
     */

    System.out.print("Masukkan jari-jari lingkaran: ");
    double r = sc.nextDouble();
    double luas = 3.14 * r * r;

    System.out.println("Luas lingkaran : " + luas);
  }
}
