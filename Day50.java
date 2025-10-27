import java.util.Scanner;

public class Day50 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 50 : Latihan: Membuat Program Ganjil Genap menggunakan ternary
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("program cek bilangan ganjil atau genap");
    System.out.print("masukkan angka: ");
    int n = sc.nextInt();

    String ganjilGenap = (n % 2 == 1) ? "ganjil" : "genap";
    System.out.println(ganjilGenap);
  }
}
