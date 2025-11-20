import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
     /*
      * 100 Days Of Coding 2025
      * Day 74 : Latihan: do while: Membuat Menu Berulang
      */
      
        Scanner sc = new Scanner(System.in);

        int pilihanMenu, jumlah, harga = 0;
        int totalBelanja = 0;
        String daftarPesanan = "";
        boolean lanjutPesan = true;

        while (lanjutPesan) {

            System.out.println("\n=== WARUNG SEDERHANA ===");
            System.out.println("1. Nasi Goreng   - Rp15000");
            System.out.println("2. Mie Ayam      - Rp12000");
            System.out.println("3. Es Teh Manis  - Rp5000");
            System.out.println("4. Kopi Hitam    - Rp6000");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            pilihanMenu = sc.nextInt();

            if (pilihanMenu == 5) {
                break;
            }

            switch (pilihanMenu) {
                case 1:
                    harga = 15000;
                    System.out.println("Anda memilih Nasi Goreng");
                    break;
                case 2:
                    harga = 12000;
                    System.out.println("Anda memilih Mie Ayam");
                    break;
                case 3:
                    harga = 5000;
                    System.out.println("Anda memilih Es Teh Manis");
                    break;
                case 4:
                    harga = 6000;
                    System.out.println("Anda memilih Kopi Hitam");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
                    continue;
            }

            System.out.print("Masukkan jumlah: ");
            jumlah = sc.nextInt();

            int totalHargaItem = harga * jumlah;
            totalBelanja += totalHargaItem;

            String namaMenu = "";
            switch (pilihanMenu) {
                case 1: namaMenu = "Nasi Goreng"; break;
                case 2: namaMenu = "Mie Ayam"; break;
                case 3: namaMenu = "Es Teh Manis"; break;
                case 4: namaMenu = "Kopi Hitam"; break;
            }

            daftarPesanan += namaMenu + " x " + jumlah + " = Rp" + totalHargaItem + "\n";

            System.out.println("\n1. Pesan menu lain");
            System.out.println("2. Lanjut ke pembayaran");
            System.out.print("Pilih: ");
            int pilihLanjut = sc.nextInt();

            if (pilihLanjut == 2) {
                System.out.println("\n=== DETAIL PEMBAYARAN ===");
                System.out.println(daftarPesanan);
                System.out.println("TOTAL BELANJA: Rp" + totalBelanja);

                System.out.println("\n1. Ingin memesan lagi");
                System.out.println("2. Selesai");
                System.out.print("Pilih: ");
                int pilihAkhir = sc.nextInt();

                if (pilihAkhir == 1) {
                    continue;
                } else {
                    System.out.println("\n=== STRUK ===");
                    System.out.println(daftarPesanan);
                    System.out.println("TOTAL BELANJA: Rp" + totalBelanja);
                    System.out.println("Terima kasih sudah berbelanja!");
                    return;
                }
            }
        }

        System.out.println("\n=== STRUK ===");
        System.out.println(daftarPesanan);
        System.out.println("TOTAL BELANJA: Rp" + totalBelanja);
        System.out.println("Terima kasih sudah berbelanja!");
    }
}
