public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin , boolean menikah ){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public String getStatus() {
        String prodi;
        switch (nim.charAt(6)) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
            default:
                prodi = "Prodi tidak diketahui";
        }

        String angkatan = nim.substring(0, 2);
        return prodi + ", 20" + angkatan;
    }

    public double getBeasiswa() {
        double beasiswa = 0;
        if (ipk >= 3 && ipk < 3.5) {
            beasiswa = super.getPendapatan() + 50;
        } else if (ipk >= 3.5 && ipk <= 4) {
            beasiswa = super.getPendapatan() + 75;
        } else {
            return super.getPendapatan();
        }return beasiswa;
    }

    
    public double getPendapatan() {
        return getTunjangan() + getBeasiswa();
    }

    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f\n%-15s: %s\n%-15s: %.1f\n%-15s: %s","nama", super.getNama(), "nik", super.getNik(), "jenisKelamin", super.getJenisKelamin(), "pendapatan", getBeasiswa(), "nim", getNim(), "ipk", getIpk(), "status", getStatus());
    }
    
}
