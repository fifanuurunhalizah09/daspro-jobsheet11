import java.util.Scanner;

public class Kafe09 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - RP 15,000");
        System.out.println("2. Cappucino - RP 20,000");
        System.out.println("3. Latte - RP 22,000");
        System.out.println("4. Teh Tarik - RP 12,000");
        System.out.println("5. Roti Bakar - RP 10,000");
        System.out.println("6. Mie Goreng - RP 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga09(int pilihanMenu, int banyakItem){
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};  

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static int hitungHargaSetelahDiskon(int totalHarga, String kodePromo) {
        double diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = 0.50;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = 0.30;
        }

        return (int) (totalHarga * (1 - diskon));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON50");
        
        int totalHargaSemuaPesanan = 0;
        String pemesanan = "y";
        while (pemesanan.equals("y")) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            int totalHarga = hitungTotalHarga09(pilihanMenu, banyakItem);
            totalHargaSemuaPesanan += totalHarga;

            System.out.println("Total harga untuk pesanan ini: Rp " + totalHarga);
            
            System.out.print("Apakah Anda ingin memesan lagi? (y/n): ");
            pemesanan = sc.next();
        }
        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalHargaSemuaPesanan);
        
        int hargaSetelahDiskon = hitungHargaSetelahDiskon(totalHargaSemuaPesanan, "DISKON50");
            
        System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);
    }

}

