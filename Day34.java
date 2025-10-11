import java.util.Scanner;

public class Day34 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 34: Latihan: Mengkombinasikan berbagai operator.
     */

    System.out.println("Di suatu toko 'AsriKios', toko ini sangatlah menarik karena toko ini punya aturan yang unik, dimana pelanggannya hanya boleh berumur dari 18-25 tahun, tetapi yang berumur 20 tahun dan 24 tidak boleh dan pengecualian spesial untuk umur 30 itu boleh berbelanja, cetak apakah pelanggan bisa berbelanja di toko AsriKios dengan inputan dibawah ini");

    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan umur pelanggan: ");
    
    int umur = sc.nextInt();

    System.out.println((umur >= 18 && umur < 26) && (umur != 20 && umur != 24) || (umur == 30));

  }

}
