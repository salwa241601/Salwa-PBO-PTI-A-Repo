public class Manager extends Pekerja{
private String departemen;

   public Manager(String departemen, double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }

    public String getDepartemen(){
        return departemen;
    }

    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f\n%-15s: %d %d %d\n%-15s: %d\n%-15s: %.1f\n%-15s: %s","nama", super.getNama(), "nik", super.getNik(), "jenisKelamin", super.getJenisKelamin(), "pendapatan", (super.getGaji() + super.getBonus() + (super.getTunjangan() + super.getJumlahAnak() * 20) + (10 * super.getGaji() / 100)), "tahun masuk",  super.getTahunMasuk().getDayOfMonth(), super.getTahunMasuk().getMonthValue(), super.getTahunMasuk().getYear(), "jumlah anak", super.getJumlahAnak(), "gaji", super.getGaji(), "departemen", departemen);
     }

    
}
