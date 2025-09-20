import java.util.Scanner;

public class Day13 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 13:Buatlah program Java yang meminta dua inputan dari pengguna (misalnya: a dan b)
     * Setelah program dijalankan, tukar nilai kedua variabel tersebut dan tampilkan hasilnya.
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan a: ");
    int a = sc.nextInt();
    System.out.print("Masukkan b: ");
    int b = sc.nextInt();

    int temp = a;
    a = b;
    b = temp;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

  }

}
