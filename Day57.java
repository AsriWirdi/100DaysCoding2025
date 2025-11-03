import java.util.Scanner;

public class Day57 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 57 : Nested Loop
     */

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if(n > 0){
      for(int i = 1; i <= n; i++){
        for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    } else if(n < 0){
      n = -n;
      for(int i = 1; i <= n; i++){
        for (int j = i; j <= n; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    } else{
      System.out.println("kosong");
    }
  }
}
