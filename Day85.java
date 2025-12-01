import java.util.Scanner;

public class Day85 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 85 : Latihan: Menentukan Angka Maksimal Array
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("masukkan jumlah data: ");
    int n = sc.nextInt();
    int max = Integer.MIN_VALUE;

    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
      max = (max < array[i]) ? array[i] : max;
    }

    System.out.println(max);
  }
}
