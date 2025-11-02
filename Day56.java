import java.util.Scanner;

public class Day56 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 56 : Perulangan do-while
     */

    Scanner sc = new Scanner(System.in);

    String[] accountsUsn = { "asriwirdi", "muhrifai", "muhammadiqwal" };
    String[] accountsPw = { "D0224325", "D0224007", "D0224025" };

    String usnSaatIni = "";
    String pwSaatIni = "";
    int percobaan = 0;

    do {
      System.out.print("Username : ");
      String usn = sc.next();

      System.out.print("Password : ");
      String pw = sc.next();

      if (usn.equalsIgnoreCase("admin") && pw.equalsIgnoreCase("admin")) {
        System.out.println("Login Sebagai Admin");
        return;
      }

      for (int i = 0; i < accountsPw.length; i++) {
        usnSaatIni = accountsUsn[i];
        pwSaatIni = accountsPw[i];

        if (usnSaatIni.equalsIgnoreCase(usn) && pwSaatIni.equalsIgnoreCase(pw)) {
          System.out.println("Login Sebagai Pengguna");
          return;
        } else {
          continue;
        }
      }

      System.out.println("Silahkan Coba Lagi");
      percobaan++;
    } while (percobaan < 3);
    System.out.println("Login Gagal");
  }
}
