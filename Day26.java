public class Day26 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 26: Operator Penugasan (=, +=, -=, dll).
     */

    int a = 2;
    System.out.println("nilai a = " + a);
    
    a += 5; // sama saja dengan a = a + 5;
    System.out.println("setelah update (+=) nilai a = " + a);
    
    a -= 3; // sama saja dengan a = a - 3;
    System.out.println("setelah update (-=) nilai a = " + a);
    
    a *= 2; // sama saja dengan a = a * 2;
    System.out.println("setelah update (*=) nilai a = " + a);

    a /= 2; // sama saja dengan a = a / 2;
    System.out.println("setelah update (/=) nilai a = " + a);

    a %= 2; // sama saja dengan a = a % 2;
    System.out.println("setelah update (%=) nilai a = " + a);
  }
}
