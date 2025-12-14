import java.util.Scanner;

public class Day99 {
  /*
   * 100 Days Of Coding 2025
   * Day 99 : Latihan: Deretan Bilangan Prima dari 1-N
   */

  static void prima(int n) {
    for (int i = 2; i <= n; i++) {
      boolean prima = true;

      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          prima = false;
          break;
        }
      }

      if (prima) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan N: ");
    int n = sc.nextInt();

    prima(n);
  }
}
