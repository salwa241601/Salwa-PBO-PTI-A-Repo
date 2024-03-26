public class lingkaran{
int alas, tinggi;
public lingkaran(int alas){
        this.alas = alas;
    }
    public lingkaran(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public lingkaran(String alas, String tinggi){
        this.alas = parsing(alas);
        this.tinggi = parsing(tinggi);
    }
    public int parsing(String adant){
        return Integer.parseInt(adant);
    }
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double hitungLuas(){
        double hasil = (double)(getTinggi()*getAlas())/2;
        return hasil;
    }
    public void displayMessage(){
        System.out.println("Hitung Luas : "+hitungLuas());
    }
}