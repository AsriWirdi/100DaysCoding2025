import java.util.Scanner;

public class Day55 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 55 : EVALUASI
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Batas Bawah: ");
    int a = sc.nextInt();

    System.out.print("Batas Atas: ");
    int b = sc.nextInt();

    System.out.print("Angka: ");
    int c = sc.nextInt();

    if (c >= a && c <= b) {
      System.out.println("YAYAYAYA");
    } else {
      System.out.println("NONONONO");
    }
  }
}