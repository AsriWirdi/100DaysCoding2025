import java.util.Scanner;

public class Day79 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 79 : Latihan: Membuat Akun dan Login Ke Akun (Menggunakan loop berhenti
     * ketika user dan pwnya benar)
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Buat username baru: ");
    String username = sc.nextLine();

    System.out.print("Buat password baru: ");
    String password = sc.nextLine();

    System.out.println("\nAkun berhasil dibuat!");
    System.out.println("------------------------");

    while (true) {
      System.out.print("Masukkan username: ");
      String u = sc.nextLine();

      System.out.print("Masukkan password: ");
      String p = sc.nextLine();

      boolean userBenar = u.equals(username);
      boolean passBenar = p.equals(password);

      if (userBenar && passBenar) {
        System.out.println("Login berhasil! Selamat datang.");
        break;
      } else if (!userBenar && !passBenar) {
        System.out.println("Username dan password salah.\n");
      } else if (!userBenar) {
        System.out.println("Username salah.\n");
      } else {
        System.out.println("Password salah.\n");
      }
    }

  }
}
