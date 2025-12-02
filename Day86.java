import java.util.Scanner;

public class Day86 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 86 : Latihan: Menentukan Angka Minimal Array
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("masukkan jumlah data: ");
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;

    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
      min = (min > array[i]) ? array[i] : min;
    }

    System.out.println(min);
  }
}
