import java.util.Scanner;

public class Day58 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 58 : Latihan: Mencetak angka 1-N dan angka N-1
     */
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println("Penjumlahan: ");
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      System.out.print(i);
      if (i != n) {
        System.out.print(" + ");
      } else {
        System.out.print(" = ");
      }

      sum += i;
    }
    System.out.println(sum);

    System.out.println("Perkalian: ");
    int perkalian = 1;
    for (int i = n; i >= 1; i--) {
      System.out.print(i);
      if (i != 1) {
        System.out.print(" * ");
      } else {
        System.out.print(" = ");
      }

      perkalian *= i;
    }
    System.out.println(perkalian);
  }
}
