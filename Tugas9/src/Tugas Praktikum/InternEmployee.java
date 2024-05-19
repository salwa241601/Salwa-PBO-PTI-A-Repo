public class InternEmployee extends Employee implements Contract {
    private String softSkill;
    private String hardSkill;
    private String bidang;
    private int contractDuration;
    private int trainingSessionsAttended;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String pendidikan, String asal,
                        String softSkill, String hardSkill, String bidang, int contractDuration, int trainingSessionsAttended) {
        super(registrationNumber, name, salaryPerMonth, invoices, pendidikan, asal);
        this.softSkill = softSkill;
        this.hardSkill = hardSkill;
        this.bidang = bidang;
        this.contractDuration = contractDuration;
        this.trainingSessionsAttended = trainingSessionsAttended;
    }

    public void setSoftSkill(String softSkill) {
        this.softSkill = softSkill;
    }

    public String getSoftSkill() {
        return softSkill;
    }

    public String getHardSkill() {
        return hardSkill;
    }

    public void setHardSkill(String hardSkill) {
        this.hardSkill = hardSkill;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    public int getTrainingSessionsAttended() {
        return trainingSessionsAttended;
    }

    public void setTrainingSessionsAttended(int trainingSessionsAttended) {
        this.trainingSessionsAttended = trainingSessionsAttended;
    }

    public void infoSkill(){
        System.out.printf("\n%-25s: %s", "Soft skill yang dimiliki", softSkill);
        System.out.printf("\n%-25s: %s", "Hard skill yang dimiliki", hardSkill);
    }

    public void infoBidang(){
        System.out.printf("\n%-25s: %s", "Berpengalaman dibidang", bidang);
    }

    @Override
    public double getSalaryAfterDeduction() {
        double total = 0;
        if (getInvoices() != null) {
            for (Invoice invoice : getInvoices()) {
                if (invoice != null) {
                    total += invoice.getPayableAmount();
                }
            }
        }
        total = (getSalaryPerMonth() * contractDuration) - total;
        System.out.printf("\n%-25s: Rp. %.1f", "Gaji bersih", total);
        return total;
    }

    @Override
    public void attendTrainingSession() {
        trainingSessionsAttended++;
    }

    @Override
    public void trackContractDuration() {
        System.out.printf("\n%-25s: %d %s", "Durasi kontrak", contractDuration, "bulan");
        System.out.printf("\n%-25s: %s", "Jumlah presensi training", trainingSessionsAttended);
    }

    @Override
    public int ContractDuration() {
        return contractDuration;
    }
}