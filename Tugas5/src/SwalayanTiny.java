import java.util.Scanner;

public class SwalayanTiny {
    public static void main(String[] args) {
        // Data pelanggan contoh
        Akun pelanggan = new Akun("3812345678", "John Doe", 500000, 1234);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Swalayan Tiny");
        System.out.print("Masukkan nomor pelanggan: ");
        String nomorPelangganMasukan = scanner.nextLine();
        System.out.print("Masukkan PIN: ");
        int pinMasukan = scanner.nextInt();

        if (pelanggan.autentikasi(pinMasukan) && nomorPelangganMasukan.equals(pelanggan.getNoPelanggan())) {
            System.out.println("Autentikasi berhasil. Selamat berbelanja, " + pelanggan.getNama() + "!");

            // Contoh pembelian
            double jumlahPembelian = 1500000; // Jumlah pembelian contoh
            if (pelanggan.pembelian(jumlahPembelian)) {
                double cashback = pelanggan.hitungCashback(jumlahPembelian);
                pelanggan.setorTunai(cashback);
            }

        } else {
            System.out.println("Autentikasi gagal. Silakan coba lagi.");
        }

        scanner.close();
    }
}