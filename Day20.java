public class Day20 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 20: Mengubah Tipe Data Primitif menjadi String.
     */

    byte a = 100;

    // 1. String.valueOf()
    String str1 = String.valueOf(a);

    // 2. + ""
    String str2 = a + "";

    // 3. String.format
    String str3 = String.format("%d", a);

  }
}
