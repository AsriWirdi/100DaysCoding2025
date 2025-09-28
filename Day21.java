public class Day21 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 21: Latihan: Program untuk menukar nilai dua variabel.
     */

    int a = 5;
    int b = 3;

    System.out.println("sebelum di tukar");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

    a += b;
    b = a - b;
    a = a - b;

    System.out.println("sesudah di tukar");
    System.out.println("a = " + a);
    System.out.println("b = " + b);

  }
}
