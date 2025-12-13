import java.util.Scanner;

public class Day97 {
  /*
   * 100 Days Of Coding 2025
   * Day 97 : Latihan: Menghitung Luas Persegi dengan Method Non-void dan
   * parameternya
   */

  static double luasPersegi(double s) {
    return s * s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("sisi Persegi: ");
    double s = sc.nextDouble();
    System.out.println("Luas Persegi: " + luasPersegi(s));
  }
}
