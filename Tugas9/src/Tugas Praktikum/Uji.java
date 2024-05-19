public class Uji {
    public static void main(String[] args) {
        Invoice[] invoices = new Invoice[4];
        invoices [0] = new Invoice("Telor", 3, 3000);
        invoices [1] = new Invoice("Gula", 3, 3000);

        PermanentEmployee pe = new PermanentEmployee(54765656, "Salwa", 4000000, invoices, "Universitas Palangkaraya", "Banjarmasin", "Karyawan", "Angkasa Pura", 8);
        PermanentEmployee.printEmployeeInfo(pe);
        pe.infoPerusahaan();
        pe.infoJamKerja();
        pe.pendidikanTerakhir();
        pe.asalDaerah();
        pe.getSalaryAfterDeduction();

        InternEmployee ie = new InternEmployee(46567565, "Nobi", 3000000, invoices, "Tokyo University", "Tokyo", "Public Speaking", "Desain grafis", "Desain", 3, 1);
        InternEmployee.printEmployeeInfo(ie);
        ie.pendidikanTerakhir();
        ie.asalDaerah();
        ie.infoSkill();
        ie.infoBidang();
        ie.trackContractDuration();
        ie.getSalaryAfterDeduction();
    }
}
