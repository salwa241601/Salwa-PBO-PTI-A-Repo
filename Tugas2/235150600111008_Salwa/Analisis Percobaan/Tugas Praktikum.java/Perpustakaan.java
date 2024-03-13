public class Perpustakaan {
    private String[] KategoriBuku = {
        "Teknologi",
        "Filsafat",
        "Sejarah",
        "Agama",
        "Psikologi",
        "Politik",
        "Fiksi"
    };

    private BukuPerpus[] buku;
    private Author[] penulis;

    public Perpustakaan(){
        buku = new BukuPerpus[35];
        penulis = new Author[35];

        penulis[0] = new Author("Andi");
        penulis[1] = new Author("Budi");
        penulis[2] = new Author("Rudi");
        penulis[3] = new Author("Rini");
        penulis[4] = new Author("Indah");
        penulis[5] = new Author("Ainun");
        penulis[6] = new Author("Claude");
        penulis[7] = new Author("Tere Liye");

        buku[0] = new BukuPerpus("Pemrograman Dasar", KategoriBuku[0], new String[]{penulis[0].getNama()}, 2020, 300, "GreenBook.id");
        buku[1] = new BukuPerpus("Jaringan 5.0", KategoriBuku[0], new String[]{penulis[0].getNama()}, 2022, 400, "Gramedia");
        buku[2] = new BukuPerpus("Pemrograman Berorientasi Objek", KategoriBuku[0], new String[]{penulis[1].getNama()}, 2019, 600, "Erlangga");
        buku[3] = new BukuPerpus("Mahir Ngoding Bahasa Java", KategoriBuku[0], new String[]{penulis[1].getNama()}, 2020, 500, "Erlangga");
        buku[4] = new BukuPerpus("Jago UI UX Design", KategoriBuku[0], new String[]{penulis[3].getNama()}, 2022, 450, "Gramedia");

        buku[5] = new BukuPerpus("Dasar Filsafat", KategoriBuku[1], new String[]{penulis[3].getNama()}, 2022, 400, "Pustaka.id");
        buku[6] = new BukuPerpus("Para Filsuf", KategoriBuku[1], new String[]{penulis[6].getNama()}, 2019, 350, "Erlangga");
        buku[7] = new BukuPerpus("Hukum Filsafat", KategoriBuku[1], new String[]{penulis[3].getNama()}, 2018, 220, "Media");
        buku[8] = new BukuPerpus("Ilmu Filsafat", KategoriBuku[1], new String[]{penulis[6].getNama()}, 2015, 430, "Erlangga");
        buku[9] = new BukuPerpus("Filsafat Pendidikan Sarjana", KategoriBuku[1], new String[]{penulis[2].getNama()}, 2023, 300, "Pusat Asa");
        
        buku[10] = new BukuPerpus("Sejarah Kemerdekaan", KategoriBuku[2], new String[]{penulis[2].getNama()}, 2017, 300, "Pustaka");
        buku[11] = new BukuPerpus("Sejarah Pancasila", KategoriBuku[2], new String[]{penulis[0].getNama()}, 2016, 200, "Gramedia");
        buku[12] = new BukuPerpus("Biografi Bapak Ir. Soekarno", KategoriBuku[2], new String[]{penulis[1].getNama()}, 2019, 180, "Baca");
        buku[13] = new BukuPerpus("Perang Dunia Ke-2", KategoriBuku[2], new String[]{penulis[3].getNama()}, 2016, 270, "Asa");
        buku[14] = new BukuPerpus("Sejarah Bahasa Indonesia", KategoriBuku[2], new String[]{penulis[0].getNama()}, 2020, 210, "Media Wawasan");

        buku[15] = new BukuPerpus("Siroh Nabi", KategoriBuku[3], new String[]{penulis[0].getNama()}, 2020, 300, "Mizan");
        buku[16] = new BukuPerpus("Meraih Surga", KategoriBuku[3], new String[]{penulis[0].getNama()}, 2022, 400, "Berkah");
        buku[17] = new BukuPerpus("Allah Tau Kamu Lelah", KategoriBuku[3], new String[]{penulis[1].getNama()}, 2019, 600, "Erlangga");
        buku[18] = new BukuPerpus("Dzikir Pagi, Sore, Malam", KategoriBuku[3], new String[]{penulis[1].getNama()}, 2020, 500, "Erlangga");
        buku[19] = new BukuPerpus("Pedihnya Neraka", KategoriBuku[3], new String[]{penulis[5].getNama()}, 2022, 450, "Gramedia");

        buku[20] = new BukuPerpus("Jadi Diri Sendiri", KategoriBuku[4], new String[]{penulis[3].getNama()}, 2022, 400, "Pustaka.id");
        buku[21] = new BukuPerpus("Merelungi Jiwa", KategoriBuku[4], new String[]{penulis[6].getNama()}, 2019, 350, "Erlangga");
        buku[22] = new BukuPerpus("Siapa Aku?", KategoriBuku[4], new String[]{penulis[3].getNama()}, 2018, 220, "Media");
        buku[23] = new BukuPerpus("Melatih Mental", KategoriBuku[4], new String[]{penulis[6].getNama()}, 2015, 430, "Erlangga");
        buku[24] = new BukuPerpus("Apapun yang Terjadi, Tetaplah Waras", KategoriBuku[4], new String[]{penulis[2].getNama()}, 2023, 300, "Pusat Asa");
        
        buku[25] = new BukuPerpus("Demokrasi", KategoriBuku[5], new String[]{penulis[2].getNama()}, 2017, 300, "Pustaka");
        buku[26] = new BukuPerpus("Justice", KategoriBuku[5], new String[]{penulis[0].getNama()}, 2016, 200, "Gramedia");
        buku[27] = new BukuPerpus("Pemilu", KategoriBuku[5], new String[]{penulis[1].getNama()}, 2019, 180, "Baca");
        buku[28] = new BukuPerpus("Kuasa Hakim", KategoriBuku[5], new String[]{penulis[3].getNama()}, 2016, 270, "Asa");
        buku[29] = new BukuPerpus("Hukum Republik", KategoriBuku[5], new String[]{penulis[0].getNama()}, 2020, 210, "Media Wawasan");

        buku[30] = new BukuPerpus("Bumi", KategoriBuku[6], new String[]{penulis[7].getNama()}, 2017, 300, "Pustaka");
        buku[31] = new BukuPerpus("Bulan", KategoriBuku[6], new String[]{penulis[7].getNama()}, 2018, 200, "Gramedia");
        buku[32] = new BukuPerpus("Matahari", KategoriBuku[6], new String[]{penulis[7].getNama()}, 2019, 300, "Gramedia");
        buku[33] = new BukuPerpus("Komet", KategoriBuku[6], new String[]{penulis[7].getNama()}, 2020, 270, "Gramedia");
        buku[34] = new BukuPerpus("Nebula", KategoriBuku[6], new String[]{penulis[7].getNama()}, 2021, 290, "Gramedia");
        
    }

    public void tampilanPeminjaman(){
        for (int i = 0; i < buku.length; i++) {
            BukuPerpus b = buku[i];
            if (b != null) {
                System.out.println("Kategori : " + b.getKategori());
                System.out.println("Judul : " + b.getJudul());
                

                for (String penulis : b.getPenulis()) {
                    System.out.println("Penulis : " + penulis);
                }

                System.out.println("Tahun Terbit : " + b.getTahunTerbit());
                System.out.println("Jumlah Halaman : " + b.getJumlahHalaman());
                System.out.println("Penerbit : " + b.getPenerbit());
               
                System.out.println("============================\n");
            }
            
        }
    }

    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        perpus.tampilanPeminjaman();
    }

}
