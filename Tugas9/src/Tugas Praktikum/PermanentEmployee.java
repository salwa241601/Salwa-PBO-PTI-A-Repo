import java.util.Arrays;

public class PermanentEmployee extends Employee {
    private String position;
    private String perusahaan;
    private int jamKerja;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String pendidikan, 
                            String asal, String position, String perusahaan, int jamKerja) {
        super(registrationNumber, name, salaryPerMonth, invoices, pendidikan, asal);
        this.position = position;
        this.perusahaan = perusahaan;
        this.jamKerja = jamKerja;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void infoPerusahaan(){
        System.out.printf("\n================== POSISI ==================\n");
        System.out.printf("\nBekerja di perusahaan " + getPerusahaan());
    }

    public void infoJamKerja(){
        System.out.printf("\n%-25s: %d %s", "Bekerja selama", getJamKerja(), "jam");
    }

    public String[] getManagementPositions() {
        String[] managementPositions = {"Manager", "Direktur", "Karyawan"};
        return managementPositions;
    }

    @Override
    public double getSalaryAfterDeduction() {
        String[] managementPositions = getManagementPositions();
        double salaryAfterDeduction = 0;

        if (Arrays.asList(managementPositions).contains(getPosition())) {
            switch (getPosition()) {
                case "Manager":
                    salaryAfterDeduction = getSalaryPerMonth() * 1.2; // Gaji 20% lebih tinggi
                    System.out.printf("\n%-25s: %s\n%-25s: Rp. %.1f%s", "Posisi", getPosition(), "Gaji bersih + bonus", ((salaryAfterDeduction - getSalaryPerMonth()) + getPayableAmount()), " (Terdapat bonus 20%)");
                    break;
                case "Direktur":
                    salaryAfterDeduction = getSalaryPerMonth() * 1.5; // Gaji 50% lebih tinggi
                    System.out.printf("\n%-25s: %s\n%-25s: Rp. %.1f%s", "Posisi", getPosition(), "Gaji bersih + bonus", ((salaryAfterDeduction - getSalaryPerMonth()) + getPayableAmount()), " (Terdapat bonus 50%)");
                    break;
                case "Karyawan":
                    salaryAfterDeduction = getSalaryPerMonth() * 1.1; // Gaji 10% lebih tinggi
                    System.out.printf("\n%-25s: %s\n%-25s: Rp. %.1f%s", "Posisi", getPosition(), "Gaji bersih + bonus", ((salaryAfterDeduction - getSalaryPerMonth()) + getPayableAmount()), " (Terdapat bonus 10%)");
                    break;
                default:
            }
        } else {
            System.out.println("Posisi tidak ditemukan");
        }

        return salaryAfterDeduction;
    }

}