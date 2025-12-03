public class Day87 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 87 : Latihan: Mencari Elemen pada Array
     */

    int[] a = { 3, 7, 10, 15, 20 };
    int t = 15;
    System.out.println("cari angka " + t + " dalam array a");

    for (int i = 0; i < a.length; i++)
      if (a[i] == t) {
        System.out.println("angka " + t + " ditemukan pada index ke-" + i);
        return;
      }

    System.out.println("Tidak ada");
  }
}
