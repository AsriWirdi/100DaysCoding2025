import java.util.Scanner;

public class Day40 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 40: Latihan: Membuat Kalkulator menggunakan if
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Pilihan menu Kalkulator: ");
    System.out.println("+ - / * ");

    System.out.println();
    double a = sc.nextDouble();
    char operator = sc.next().charAt(0);
    double b = sc.nextDouble();

    double hasil;

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

    System.out.printf("%.1f %c %.1f = %.2f", a, operator, b, hasil);
  }
}
