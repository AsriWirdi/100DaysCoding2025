public class Day31 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 31: Operator Logika AND (&&).
     */

    int x = 0;
    int y = 1;
    int z = 2;

    System.out.println("bilangan paling besar di antara ke 3 variable: ");
    System.out.printf("x adalah paling besar, %b%n",(x > y) && (x > z)); // false
    System.out.printf("y adalah paling besar, %b%n",(y > x) && (y > z)); // false
    System.out.printf("z adalah paling besar, %b%n",(z > x) && (z > y)); // true
  }

}
