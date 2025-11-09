import java.util.Scanner;

public class Day63 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 63 : Latihan: Mengalikan 1-N
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nilai N : ");
    int n = sc.nextInt();
    int kali = 1;

    for (int i = 1; i <= n; i++) {
      System.out.print(i);
      if (i != n) {
        System.out.print(" * ");
      }
      kali *= i;
    }
    System.out.println(" = " + kali);
  }
}