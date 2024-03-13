public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double waktu;
    private double jarak;
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = rubahKecepatan(i);	
    }	
    public void setWaktu(double d){
        waktu = rubahSekon(d);
    }		
    private double rubahSekon(double d){
        return d * 3600;
    }
    private double rubahKecepatan(double d){
        return (d * 1000) / 3600;
    }
    public double hitungJarak(){
        return jarak = kecepatan * waktu;
    }
    public double rubahMkeKM(double d){
        return kecepatan = d / 1000;
    }
    
    public void displayMessage(){
        System.out.println("\nMobil anda adalah bermerek "+manufaktur);			
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+kecepatan);
        System.out.println("Jarak yang dapat ditempuh " + hitungJarak());
        System.out.println("Jarak dari " + kecepatan + " m diubah ke km adalah " + rubahMkeKM(jarak) + " km");
    }			
}			
        
