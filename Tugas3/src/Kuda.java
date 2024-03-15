public class Kuda {

    public String nama;
    public int usia;
    public String jenis;
    public String warna;
    
    public void makan(String jenisMakanan){
        System.out.println("Makanan yang dimakan adalah jenis makanan " + jenisMakanan);
    }

    public void berlari(int kecepatan){
        System.out.println("Rata-rata kecepatan berlarinya sekitar " + kecepatan + " km/jam");
    }

    public void tidur(int lamaTidur){
        System.out.println("Biasanya tidur selama " + lamaTidur + " jam");
    }

    public void menyerang(){
        System.out.println("Mereka akan menyerang jika merasa terancam");
    }
}