import java.util.Scanner;

public class Day62 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 62 : Latihan: Menjumlahkan 1-N
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nilai N : ");
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      System.out.print(i);
      if (i != n) {
        System.out.print(" + ");
      }
      sum += i;
    }
    System.out.println(" = " + sum);
  }
}