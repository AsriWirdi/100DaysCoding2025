public class Day14 {
  public static void main(String[] args) {

    /*
     * 100 Days Of Coding 2025
     * Day 14: Mengubah String menjadi Tipe Data Primitif
     */

    String angkaBulat = "123";
    String angkaDesimal = "1.23";
    String bool = "true";
    String char1 = "A";

    // convert String to tipe data primitif menggunakan parse
    byte angka1 = Byte.parseByte(angkaBulat);
    short angka2 = Short.parseShort(angkaBulat);
    int angka3 = Integer.parseInt(angkaBulat);
    long angka4 = Long.parseLong(angkaBulat);

    double desimal1 = Double.parseDouble(angkaDesimal);
    float desimal2 = Float.parseFloat(angkaDesimal);

    boolean bool1 = Boolean.parseBoolean(bool);

    // convert String to tipe data primitif menggunakan valueof
    byte angka5 = Byte.valueOf(angkaBulat);
    short angka6 = Short.valueOf(angkaBulat);
    int angka7 = Integer.valueOf(angkaBulat);
    long angka8 = Long.valueOf(angkaBulat);

    double desimal3 = Double.valueOf(angkaDesimal);
    float desimal4 = Float.valueOf(angkaDesimal);

    boolean bool2 = Boolean.valueOf(bool);

    char kelas = Character.valueOf(char1.charAt(0));

    // Karena char ini tipe data spesial yaitu hanya ada 1 digit harus pakai
    // charAt(index)
    char karakter1 = angkaBulat.charAt(0); // ambil char index pertama (0) dari string "123" yaitu 1
  }

}
