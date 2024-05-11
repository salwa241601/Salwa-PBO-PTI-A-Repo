public class Uji {
    public static void main(String[] args) {

        PegawaiTetap pt1 = new PegawaiTetap("Bayu", "350728490327424092342", 2000000);
        PegawaiTetap pt2 = new PegawaiTetap("Nurul", "350728490327424092341", 5000000);
        PegawaiTetap pt3 = new PegawaiTetap("Agus", "350728490327424092345", 7000000);

        PegawaiHarian ph1 = new PegawaiHarian("Edo", "350728490327424092343", 8500, 40);
        PegawaiHarian ph2 = new PegawaiHarian("Lina", "350728490327424092347", 100000, 33);
        PegawaiHarian ph3 = new PegawaiHarian("Bima", "350728490327424092349", 100000, 45);

        Sales s1 = new Sales("Tika", "350728490327424092344", 50, 50000);
        Sales s2 = new Sales("Lucas", "350728490327424092350", 60, 50000);
        Sales s3 = new Sales("Claude", "350728490327424092351", 90, 50000);

        PegawaiHarian phUp = new PegawaiHarian("Bambang", "350728490327424092361", 100000, 40);
        Pegawai phUpCas = (Pegawai) phUp;

        PegawaiHarian phDown = (PegawaiHarian) phUpCas;

        Sales sUp = new Sales("Bang", "350728490327424092362", 75, 50000);
        Pegawai sUpCas = (Pegawai) sUp;

        Sales sDown = (Sales) sUpCas; 

        System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: Rp %d", "Pegawai Tetap", pt1.getNama(), "No. KTP", pt1.getNoKTP(), "Upah", pt1.gaji(), "Pendapatan", (int)pt1.gaji());
        System.out.printf("\n\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: Rp %d", "Pegawai Tetap", pt2.getNama(), "No. KTP", pt2.getNoKTP(), "Upah", pt2.gaji(), "Pendapatan", (int)pt2.gaji());
        System.out.printf("\n\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: Rp %d", "Pegawai Tetap", pt3.getNama(), "No. KTP", pt3.getNoKTP(), "Upah", pt3.gaji(), "Pendapatan", (int)pt3.gaji());
        System.out.printf("\n==============================================");

        System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: %d\n%-17s: Rp %d", "Pegawai Harian", ph1.getNama(), "No. KTP", ph1.getNoKTP(), "Upah/jam", ph1.getUpahPerJam(), "Total jam kerja", ph1.getTotalJam(), "Pendapatan", (int)ph1.gaji());
        System.out.printf("\n\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: %d\n%-17s: Rp %d", "Pegawai Harian", ph2.getNama(), "No. KTP", ph2.getNoKTP(), "Upah/jam", ph2.getUpahPerJam(), "Total jam kerja", ph2.getTotalJam(), "Pendapatan", (int)ph2.gaji());
        System.out.printf("\n\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: %d\n%-17s: Rp %d", "Pegawai Harian", ph3.getNama(), "No. KTP", ph3.getNoKTP(), "Upah/jam", ph3.getUpahPerJam(), "Total jam kerja", ph3.getTotalJam(), "Pendapatan", (int)ph3.gaji());
        System.out.printf("\n==============================================");

        System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %d\n%-17s: %.1f\n%-17s: Rp %d", "Sales", s1.getNama(), "No. KTP", s1.getNoKTP(), "Total Penjualan", s1.getPenjualan(), "Besaran Komisi", s1.getKomisi(), "Pendapatan", (int)s1.gaji());
        System.out.printf("\n\n%-17s: %s\n%-17s: %s\n%-17s: %d\n%-17s: %.1f\n%-17s: Rp %d", "Sales", s2.getNama(), "No. KTP", s2.getNoKTP(), "Total Penjualan", s2.getPenjualan(), "Besaran Komisi", s2.getKomisi(), "Pendapatan", (int)s2.gaji());
        System.out.printf("\n\n%-17s: %s\n%-17s: %s\n%-17s: %d\n%-17s: %.1f\n%-17s: Rp %d", "Sales", s3.getNama(), "No. KTP", s3.getNoKTP(), "Total Penjualan", s3.getPenjualan(), "Besaran Komisi", s3.getKomisi(), "Pendapatan", (int)s3.gaji());
        System.out.printf("\n==============================================\n");

        System.out.println("\nKhusus Upcasting dan downcasing");
        // Terjadi eror ketika melakukan instansiasi pada method getUpahPerJam dan getTotalJam, hal ini membuktikan bahwa subclass pegawai harian berhasil di upcasting ke super class nya yaitu pegawai
        // System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: %d\n%-17s: Rp %d", "Pegawai Harian", phUpCas.getNama(), "No. KTP", phUpCas.getNoKTP(), "Upah/jam", phUpCas.getUpahPerJam(), "Total jam kerja", phUpCas.getTotalJam(), "Pendapatan", (int)phUpCas.gaji());
        // Tidak terjadi eror, karena atribut dan method sesuai dengan super class
        System.out.printf("\nPegawai Harian di upcasting ke kelas Pegawai");
        System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: Rp %d", "Pegawai Harian", phUpCas.getNama(), "No. KTP", phUpCas.getNoKTP(), "Upah", phUpCas.gaji(), "Pendapatan", (int)phUpCas.gaji());
        System.out.printf("\n\nPegawai Harian yang di upcasting tadi di downcasting ke kelas Pegawai Harian kembali");
        System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: %d\n%-17s: Rp %d", "Pegawai Harian", phDown.getNama(), "No. KTP", phDown.getNoKTP(), "Upah/jam", phDown.getUpahPerJam(), "Total jam kerja", phDown.getTotalJam(), "Pendapatan", (int)phDown.gaji());

        System.out.printf("\n\nSales di upcasting ke kelas Pegawai");
        System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %.1f\n%-17s: Rp %d", "Pegawai Harian", sUpCas.getNama(), "No. KTP", sUpCas.getNoKTP(), "Upah", sUpCas.gaji(), "Pendapatan", (int)sUpCas.gaji());
        System.out.printf("\n\nSales yang di upcasting tadi di downcasting ke kelas Sales kembali");
        System.out.printf("\n%-17s: %s\n%-17s: %s\n%-17s: %d\n%-17s: %.1f\n%-17s: Rp %d", "Sales", sDown.getNama(), "No. KTP", sDown.getNoKTP(), "Total Penjualan", sDown.getPenjualan(), "Besaran Komisi", sDown.getKomisi(), "Pendapatan", (int)sDown.gaji());





        
    }
}
