import java.util.Scanner;

public class Day40 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 40: Latihan: Membuat Kalkulator menggunakan if
     */

    Scanner sc = new Scanner(System.in);

    System.out.println("Pilihan menu Kalkulator: ");
    System.out.println("+");
    System.out.println("-");
    System.out.println("/");
    System.out.println("*");
    System.out.println("%");

    System.out.println();
    int a = sc.nextInt();
    char operator = sc.next().charAt(0);
    int b = sc.nextInt();
    int hasil = 0;

    if (operator == '+') {
      hasil = a + b;
    } else if (operator == '-') {
      hasil = a - b;
    } else if (operator == '/') {
      hasil = a / b;
    } else if (operator == '*') {
      hasil = a * b;
    } else if (operator == '%') {
      hasil = a % b;
    } else {
      System.out.println("operator tidak ada di pilihan ");
      return;
    }

    System.out.printf("%d %c %d = %d", a, operator, b, hasil);
  }
}
