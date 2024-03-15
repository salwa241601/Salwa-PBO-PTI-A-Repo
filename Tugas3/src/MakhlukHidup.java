public class MakhlukHidup {
    public static void main(String[] args) {
        Kuda kuda1 = new Kuda();
        kuda1.nama = "Amigo";
        kuda1.usia = 5;
        kuda1.jenis = "Hockney";
        kuda1.warna = "coklat";
        kuda1.makan("sayuran");
        kuda1.berlari(71);
        kuda1.tidur(5);
        kuda1.menyerang();

        Burung burung1 = new Burung();
        burung1.nama = "Elang";
        burung1.jenis = "Elang Emas";
        burung1.usia = 3;
        burung1.warnaBulu = "coklat gelap dan bercorak emas pada bagian kepala hingga leher";
        burung1.makan("mamalia kecil");
        burung1.terbang(10);
        burung1.membuatSarang("ranting, ", "daun, ", "dan rumput ");

        Ikan ikan1 = new Ikan();
        ikan1.namaIlmiah = "Thunnini";
        ikan1.panjangIkan = 124.93 ;
        ikan1.jenis = "Scombroidae";
        ikan1.warnaSisik = "biru tua dan agak gelap pada bagian atas tubuhnya";
        ikan1.makan("ikan kecil");
        ikan1.berenang(50);
        ikan1.berlindung("hiu");
    }
}
