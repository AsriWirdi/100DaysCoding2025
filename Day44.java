import java.util.Scanner;

public class Day44 {

  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 44 : Latihan: Program Predikat Nilai (A,B,C,D,E)
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai anda: ");
    int n = sc.nextInt();

    if (n < 100 && n >= 90) {
      System.out.println("A");
    } else if (n < 90 && n >= 80) {
      System.out.println("B");
    } else if (n < 80 && n >= 70) {
      System.out.println("C");
    } else if (n < 70 && n >= 60) {
      System.out.println("D");
    } else if (n < 60 && n >= 0) {
      System.out.println("E");
    } else {
      System.out.println("Mohon inputkan nilai dari rentang 0-100");
    }
  }

}
