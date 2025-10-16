import java.util.Scanner;

public class Day38 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 38: Latihan: Menentukan bilangan positif, negatif dan nol
     */

    Scanner sc = new Scanner(System.in);

    int angka = sc.nextInt();
    if (angka < 0) {
      System.out.println("negatif");
    } else if( angka == 0){
      System.out.println("nol");
    } else{
      System.out.println("positif");
    }
  }
}
