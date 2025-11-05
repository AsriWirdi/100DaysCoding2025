import java.util.Scanner;

public class Day59 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 59 : Latihan: Mencetak angka ganjil 1-N dan angka genap 1-N
     */
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 2; i <= n; i += 2) {
      System.out.print(i);
      if (i + 2 <= n)
        System.out.print(" - ");
    }
    System.out.println();

    for (int i = n % 2 == 0 ? n - 1 : n; i >= 1; i -= 2) {
      System.out.print(i);
      if (i - 2 >= 1)
        System.out.print(" - ");
    }
  }
}
