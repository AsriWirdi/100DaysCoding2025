import java.util.Scanner;

public class Day78 {
  public static void main(String[] args) {
    /*
     * 100 Days Of Coding 2025
     * Day 76 : Latihan: Menggunakan berbagai method String
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Nama lengkap: ");
    String nama = sc.nextLine().trim();

    if (nama.isEmpty()) {
      System.out.println("ERROR: Nama tidak boleh kosong.");
      return;
    }

    if (nama.length() <= 5) {
      System.out.println("ERROR: Nama harus lebih dari 5 karakter.");
      return;
    }

    nama = nama.toLowerCase();
    String namaFinal = "";
    for (String w : nama.split(" "))
      namaFinal += w.isEmpty() ? "" : Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
    namaFinal = namaFinal.trim();

    System.out.print("Masukkan Kode Negara (JP/KR/US/IND/SG): ");
    String kode = sc.nextLine().trim().toUpperCase();

    if (!(kode.equals("JP") || kode.equals("KR") || kode.equals("US") || kode.equals("IND") || kode.equals("SG"))) {
      System.out.println("ERROR: Kode negara tidak didukung.");
      return;
    }

    System.out.print("Masukkan Catatan tambahan: ");
    String cat = sc.nextLine();

    String statusCatatan;
    if (cat.isEmpty()) {
      statusCatatan = "Tidak ada catatan.";
    } else {
      boolean urgent = cat.toLowerCase().contains("urgent");
      statusCatatan = urgent ? "Catatan bersifat URGENT" : "Catatan Tidak urgent";

      cat = cat.toLowerCase().replace("hotel", "akomodasi");
    }

    System.out.println("\n=== HASIL PEMROSESAN DATA ===");
    System.out.println("Nama: " + namaFinal);
    System.out.println("Tujuan: " + kode);
    System.out.println("Catatan: " + statusCatatan);
    System.out.println("Detail: " + (cat.isEmpty() ? "-" : cat));
    System.out.println("Panjang Nama: " + namaFinal.length() + " karakter");
  }
}