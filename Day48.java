import java.util.Scanner;

public class Day48 {

  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 48 : Latihan: Membuat Kalkulator Menggunakan Switch-case
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Pilihan menu Kalkulator: ");
    System.out.println("+ - / * %");

    System.out.println();
    System.out.print("masukkan inputan pertama: ");
    double a = sc.nextDouble();
    System.out.print("masukkan operator (+ - / * %): ");
    char operator = sc.next().charAt(0);
    System.out.print("masukkan inputan kedua: ");
    double b = sc.nextDouble();

    double hasil;

    switch (operator) {
      case '+':
        hasil = a + b;
        break;
      case '-':
        hasil = a - b;
        break;
      case '/':
        hasil = a / b;
        break;
      case '*':
        hasil = a * b;
        break;
      case '%':
        hasil = a % b;
        break;
      default:
        System.out.println("operator tidak ada di pilihan ");
        return;
    }
    System.out.printf("%.1f %c %.1f = %.2f", a, operator, b, hasil);
  }
}
