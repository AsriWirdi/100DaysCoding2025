import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
 /*
  * 100 Days Of Coding 2025
  * Day 68 : Latihan: Membuat Pola Persegi
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
