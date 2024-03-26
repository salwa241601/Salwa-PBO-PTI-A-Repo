public class Burung {
    public String nama;
    public String jenis;
    public int usia;
    public String warnaBulu;

    public void makan(String jenisMakanan){
        System.out.println("Makanan yang dimakan adalah jenis makanan " + jenisMakanan);
    }

    public void terbang(int lamaTerbang){
        System.out.println("Dapat terbang selama " + lamaTerbang + " jam");
    }

    public void membuatSarang(String bahan1, String bahan2, String bahan3){
        System.out.println("Membuat sarang dari " + bahan1 + bahan2 + bahan3);
    }

    public Burung(){

    }

    public Burung(String nama){
        this.nama = nama;
    }

    public Burung(String nama, String jenis){
        this.nama = nama;
    }

    public void burung(){

    }

    public void burung(String nama){
        this.nama = nama;
    }

    public void burung(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public Burung aves(){
        System.out.println("Nama Burung : " + nama);
        System.out.println("Jenis Burung : " + jenis);
        System.out.println("Berusia : " + usia + " tahun");
        System.out.println("Memiliki bulu berwarna : " + warnaBulu);
        return this;
    }

   
}
