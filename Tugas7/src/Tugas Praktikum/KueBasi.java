public class KueBasi extends Kue {
    private int lamaHari;

    public KueBasi (String nama, double harga, int lamaHari){
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    public void setLamaHari(int lamaHari) {
        this.lamaHari = lamaHari;
    }

    public double getLamaHari(){
        return lamaHari;
    }
    
    @Override
    public double hitungHarga(){
        return getHarga() - (lamaHari * (getHarga() * 0.1));
    }

    
}
