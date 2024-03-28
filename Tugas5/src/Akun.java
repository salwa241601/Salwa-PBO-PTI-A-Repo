import java.util.Scanner;

class Akun {
    private String noPelanggan;
    private String nama;
    private double saldo;
    private int pin;
    private int Autentikasi;

    public Akun(String noPelanggan, String nama, double saldo, int pin) {
        this.noPelanggan = noPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.Autentikasi = 0;
    }

    public String getNoPelanggan() {
        return noPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autentikasi(int pinMasukan) {
        if (pinMasukan == pin) {
            Autentikasi = 0; 
            return true;
        } else {
            Autentikasi++;
            if (Autentikasi >= 3) {
                System.out.println("Akun Anda telah diblokir karena 3x kesalahan autentikasi.");
                return false;
            }
            System.out.println("PIN salah. Percobaan autentikasi tersisa: " + (3 - Autentikasi));
            return false;
        }
    }

    public void setorTunai(double jumlah) {
        saldo += jumlah;
        System.out.println("Top up berhasil. Saldo sekarang: Rp" + saldo);
    }

    public boolean pembelian(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
            return false;
        } else {
            saldo -= jumlah;
            System.out.println("Pembelian berhasil. Saldo sekarang: Rp" + saldo);
            return true;
        }
    }

    public double hitungCashback(double jumlah) {
        double cashback = 0;
        String jenisAkunString = noPelanggan.substring(0, 2);
    
        if (jenisAkunString.equals("38")) {
            if (jumlah > 1000000) {
                cashback = jumlah * 0.05;
            }
        } else if (jenisAkunString.equals("56")) {
            if (jumlah > 1000000) {
                cashback = jumlah * 0.07;
            } else {
                cashback = jumlah * 0.02;
            }
        } else if (jenisAkunString.equals("74")) {
            if (jumlah > 1000000) {
                cashback = jumlah * 0.10;
            } else {
                cashback = jumlah * 0.05;
            }
        }
        return cashback;
    }

    public boolean isAkunDibekukan() {
        return Autentikasi >= 3;
    }
}
