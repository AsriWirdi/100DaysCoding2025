import java.util.Scanner;

public class Day69 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 69: EVALUASI MENTOR
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("Input: ");
    char batas = sc.next().charAt(0);

    char kecuali = sc.next().charAt(0);

    for (int i = 65; i <= batas; i++) {
      char n = (char) i;

      if (n != kecuali)
        System.out.print(n + " ");
    }
  }
}