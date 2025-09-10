public class Day2 {
  public static void main(String... args) {
    String nama = "Asri Wirdi";
    int umur = 19;
    double tinggiBadan = 165.50;

    // println
    System.out.println("Nama =  " + nama);
    System.out.println("Umur = " + umur);
    System.out.println("Tinggi Badan: " + tinggiBadan + "\n");
    
    // print
    System.out.print("Nama =  " + nama);
    System.out.print("Umur = " + umur);
    System.out.print("Tinggi Badan: " + tinggiBadan + "\n\n");

    // printf
    System.out.printf("Nama: %s%nUmur: %d%nTinggi Badan: %.2f", nama, umur, tinggiBadan);
  }
}
