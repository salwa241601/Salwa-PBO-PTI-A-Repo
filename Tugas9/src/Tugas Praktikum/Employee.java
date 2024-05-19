public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;
    private String pendidikan;
    private String asal;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String pendidikan, String asal) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
        this.pendidikan = pendidikan;
        this.asal = asal;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }    

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void pendidikanTerakhir(){
        System.out.printf("\n%-25s: %s", "Pendidikan terakhir", getPendidikan());
    }

    public void asalDaerah(){
        System.out.printf("\n%-25s: %s", "Asal daerah", asal);
    }

    @Override
    public double getPayableAmount() {
        double total = 0;
        if (invoices != null) {
            for (Invoice invoice : invoices) {
                if (invoice != null) {
                    total += invoice.getPayableAmount();
                }
            }
        }
        total = salaryPerMonth - total;
        return total;
    }

    public String getInvoiceDetails() {
        StringBuilder details = new StringBuilder();
        if (invoices == null || invoices.length == 0) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Invoice detail");
            for (Invoice invoice : invoices) {
                if (invoice != null) {
                    details.append(String.format("\n%-25s: %s\n%-25s: %d\n%-25s: Rp. %,d", "Nama Produk",
                            invoice.getProductName(), "Jumlah", invoice.getQuantity(), "Harga", invoice.getPricePerltem()));
                }
            }
        }
        return details.toString();
    }

    public abstract double getSalaryAfterDeduction();

    public static void printEmployeeInfo(Employee employee) {
        if (employee != null) {
            System.out.printf("\n\n=================== DATA ===================");
            System.out.printf("\n\n%-25s: %s", "Nama", employee.getName());
            System.out.printf("\n%-25s: %d%n", "Registrasion Number", employee.getRegistrationNumber());
            System.out.printf("%-25s: Rp. %d%n", "Gaji Per Bulan", employee.getSalaryPerMonth());
            System.out.println();
            System.out.print("============= DAFTAR BELANJAAN =============" + employee.getInvoiceDetails());
            System.out.printf("\n-----------------------------------------------");
            System.out.printf("\n%-25s: Rp. %.1f\n", "Gaji bersih bulan ini", employee.getPayableAmount());
        }
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

}