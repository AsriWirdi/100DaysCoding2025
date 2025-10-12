import java.util.Scanner;

public class Day35 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 35: Percabangan (if)
     */

    Scanner sc = new Scanner(System.in);

    int angka = sc.nextInt();
    if (angka % 2 == 1) {
      System.out.println("Ganjil");
    } else{
      System.out.println("Genap");
    }
  }
}
