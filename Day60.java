import java.util.Scanner;

public class Day60 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 60 : Latihan: Program angka ganjil N-1 dan angka genap N-1
     */
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int sumGenap = 0;
    int sumGanjil = 0;

    System.out.println("genap: ");
    for (int i = 2; i <= n; i += 2) {
      System.out.print(i);
      if (i + 2 <= n)
        System.out.print(" + ");
      sumGenap += i;
    }
    System.out.println(" = " + sumGenap);

    System.out.println("Ganjil: ");
    for (int i = n % 2 == 0 ? n - 1 : n; i >= 1; i -= 2) {
      System.out.print(i);
      if (i - 2 >= 1)
        System.out.print(" + ");
      sumGanjil += i;
    }
    System.out.println(" = " + sumGanjil);
  }
}