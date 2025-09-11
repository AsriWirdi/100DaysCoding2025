public class Day4 {
  public static void main(String... args) {
    /*
     * 100 Days Of Coding 2025
     * Day 4: Penggunaan Escape Sequence (\n, \t, dan lain lain).
     */

    // \n - new line (baris baru)
    System.out.println("halo...\nSaya Asri Wirdi");
    // output: halo...
    // Saya Asri Wirdi

    // \t - tab (spasi lebar)
    System.out.println("Nama :\tAsri Wirdi");
    System.out.println("Nim  :\tD0224325");
    // output:
    // Nama : Asri Wirdi
    // Nim : D0224325

    // \\ backslah - menampilkan karakter '\'
    System.out.println("C:\\Users\\AsriWirdi");
    // output: C:\Users\AsriWirdi

    // \" - menampilkan tanda kutip ganda
    System.out.println("\"100 Days Of Coding 2025\"");
    // output: "100 Days Of Coding 2025"z

    // \' - menampilkan tanda kutip tunggal untuk character
    System.out.println('\'');
    // output: '

    // \r - Carriage Return, cursor kembali ke awal baris
    System.out.print("Rara Oktaviana");
    System.out.println("\rAsri Wirdi");
    // output : Asri Wirdiiana

    // \ uXXXXu - unicode
    System.out.println("simbol omega: \u03a9");
    // output: simbol omega: Ω
  }
}
