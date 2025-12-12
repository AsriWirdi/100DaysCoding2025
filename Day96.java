public class Day96 {
  /*
   * 100 Days Of Coding 2025
   * Day 96 : Latihan: Menghitung Penjumlahan, Pengurangan, Perkalian dan
   * Pembagian dengan Method Non-void
   */

  static int tambah(int a, int b) {
    return a + b;
  }

  static int kurang(int a, int b) {
    return a - b;
  }

  static int kali(int a, int b) {
    return a * b;
  }

  static double bagi(double a, double b) {
    return a / b;
  }

  public static void main(String[] args) {

    int x = 20;
    int y = 5;

    System.out.println("Hasil Tambah: " + tambah(x, y));
    System.out.println("Hasil Kurang: " + kurang(x, y));
    System.out.println("Hasil Kali:   " + kali(x, y));
    System.out.println("Hasil Bagi:   " + bagi(x, y));
  }
}
