import java.util.Scanner;

public class Day100 {
  /*
   * 100 Days Of Coding 2025
   * Day 100 : Merebut kembali
   */

    static int[] baru;

    static int retas(int[] arr) {
      int n = arr.length;
      baru = new int[n];
      for (int i = 0; i < n; i++) {
        baru[i] = -1;
      }

      int p = 0;

      for (int i = 0; i < n; i++) {
        int x = arr[i];
        int posisi = x % n;
        if (posisi < 0)
          posisi += n;

        while (baru[posisi] != -1) {
          posisi = (posisi + 1) % n;
          p++;
        }
        baru[posisi] = x;
      }
      return p;
    }

    static String susunKode(int p) {
      String s = "";
      for (int i = 0; i < baru.length; i++) {
        int x = baru[i];
        if (x < 0)
          x = -x;
        s += x;
      }

      int totalDigit = s.length();
      int len = p % totalDigit;
      if (len == 0)
        len = totalDigit;

      return s.substring(0, len);
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      int p = retas(arr);
      System.out.println(susunKode(p));
    }
  }
