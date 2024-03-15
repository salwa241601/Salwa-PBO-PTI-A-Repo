public class Ikan {
    public String namaIlmiah;
    public double panjangIkan;
    public String jenis;
    public String warnaSisik;

    public void makan(String jenisMakanan){
        System.out.println("Makanan yang dimakan adalah jenis makanan " + jenisMakanan);
    }

    public void berenang(int kecepatanRenang){
        System.out.println("Rata-rata kecepatan renangnya adalah " + kecepatanRenang + " km/jam");
    }

    public void berlindung(String predator){
        System.out.println("Mereka berlindung dari predator mereka yaitu " + predator);
    }

}
