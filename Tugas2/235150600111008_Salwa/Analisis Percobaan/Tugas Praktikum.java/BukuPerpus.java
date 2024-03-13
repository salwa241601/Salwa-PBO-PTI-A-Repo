public class BukuPerpus {
    private String judul;
    private String kategori;
    private String[] penulis;
    private int tahunTerbit;
    private int jumlahHalaman;
    private String penerbit;

    public BukuPerpus(String judul, String kategori, String[] penulis, int tahunTerbit, int jumlahHalaman, String penerbit){
        this.judul = judul;
        this.kategori = kategori;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
    }

    public String getJudul(){
        return judul;
    }

    public String getKategori(){
        return kategori;
    }

    public String[] getPenulis(){
        return penulis;
    }

    public int getTahunTerbit(){
        return tahunTerbit;
    }

    public int getJumlahHalaman(){
        return jumlahHalaman;
    }

    public String getPenerbit(){
        return penerbit;
    }

}
