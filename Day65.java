import java.util.Scanner;

public class Day65 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 64 : Latihan: Membuat Bilangan Faktorial
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan nilai N: ");
    int n = sc.nextInt();
    
    int hasil = 1;

    for (int i = 1; i <= n; i++) {
      hasil *= i;
    }
    System.out.println("faktorial: " + hasil);
  }
  }
