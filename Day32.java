
public class Day32 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 32: Operator Logika OR (||).
     */

    int umur = 25;
    int tahunPengalamanKerja = 4;
    boolean syarat = (umur >= 20 || tahunPengalamanKerja >= 5);

    System.out.println("Syarat masuk Perusahaan A, setidaknya minimal umur 20 tahun atau Pengalaman kerja minimal 5 tahun ");
    System.out.println("umur: " + umur);
    System.out.println("Pengalaman Kerja: " + tahunPengalamanKerja + " Tahun");
    System.out.println("Diterima: " + syarat);
  }
}

