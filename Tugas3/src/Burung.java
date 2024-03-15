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
}
