public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia (String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin ? "laki-laki" : "perempuan";
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getMenikah() {
        return menikah ? "Sudah Menikah " : "Belum Menikah";
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan(){
        double tunjangan = 0;
        if (menikah == true) {
            if (jenisKelamin == true) {
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        }else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f","nama", nama, "nik", nik, "jenisKelamin", getJenisKelamin(), "pendapatan", getPendapatan());             
     }

    
}
