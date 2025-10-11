import java.util.Scanner;

public class Day34 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 34: Latihan: Mengkombinasikan berbagai operator.
     */
    
    int tahunSekarang = 2025;
    System.out.println("Di suatu toko 'AsriKios', toko ini sangatlah menarik karena toko ini punya aturan yang unik, dimana pelanggannya hanya boleh berumur dari 18-25 tahun, tetapi yang berumur 20 tahun dan 24 tidak boleh dan pengecualian spesial untuk umur 30 itu boleh berbelanja, tetapi aturan ini di buat tahun lalu jadi cetak apakah pelanggan bisa berbelanja di toko AsriKios dengan inputan dibawah ini");

    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan Tahun Lahir pelanggan: ");
    
    int umur = sc.nextInt();
    umur = tahunSekarang - umur;
    umur--;

    System.out.println((umur >= 18 && umur < 26) && (umur != 20 && umur != 24) || (umur == 30));
    umur++;
    System.out.println("umur anda sekarang " + umur);
  }
}
