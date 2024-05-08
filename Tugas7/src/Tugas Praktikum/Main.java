import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {
    //     Employee employee = new Employee();
    // }
        

    // public static void main(String[] args) { 
    //     SalariedEmployee	salariedEmployee	=	new
    //     SalariedEmployee("Daniel", "135", 800.00);
    //     HourlyEmployee	hourlyEmployee	=	new
    //     HourlyEmployee("Karina", "234", 16.75, 40);
    //     CommissionEmployee	commissionEmployee	=	new
    //     CommissionEmployee("Keanu", "145", 10000, .06);
    //     BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04,300);
    //     System.out.println("Employees	diproses	secara terpisah:\n");
    //     System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee,	"pendapatan:	",
    //     salariedEmployee.earnings());
    //     System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee,	"pendapatan:	",
    //     hourlyEmployee.earnings());
    //     System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee,	"pendapatan:	",
    //     commissionEmployee.earnings());
    //     System.out.printf("%s\n%s: $%,.2f\n\n",basePlusCommissionEmployee, "earned",basePlusCommissionEmployee.earnings());

    //     Employee[] employees = new Employee[4];
    //     employees[0] = salariedEmployee;
    //     employees[1] = hourlyEmployee;
    //     employees[2] = commissionEmployee;
    //     employees[3] = basePlusCommissionEmployee;
    //     System.out.println("Employees	diproses	secara polimorfisme:\n");
    //     for (Employee currentEmployee : employees) { System.out.println(currentEmployee);
    //     if	(currentEmployee	instanceof BasePlusCommissionEmployee) {
    //     BasePlusCommissionEmployee	employee	= (BasePlusCommissionEmployee) currentEmployee;
    //     employee.setBaseSalary(1.10	* employee.getBaseSalary());
    //     System.out.printf(
    //     "Gaji pokok setelah dinaikkan 10%% :$%,.2f\n", employee.getBaseSalary());
    //     }
    //     System.out.printf("pendapatan:	$%,.2f\n\n", currentEmployee.earnings());
    //     }
    //     for (int j = 0; j < employees.length; j++) { System.out.printf("Employee	%d	=	%s\n",	j, employees[j].getClass().getName());
    //     }
    // }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double harga = 0, hargaKP = 0, hargaKJ = 0, hargaKB = 0, berat = 0, jumlah = 0, tertinggi = 0, lamaHari = 0;
        KuePesanan[] kp = new KuePesanan[10];
        kp[0] = new KuePesanan("Nastar", 78000, 1.5);
        kp[1] = new KuePesanan("Kastengel", 85000, 2);
        kp[2] = new KuePesanan("Putri Salju", 80000, 1);
        kp[3] = new KuePesanan("Lidah Kucing", 76000, 0.5);
        kp[4] = new KuePesanan("Bola Coklat", 170000, 3);
        kp[5] = new KuePesanan("Choco Cookies", 69000, 1.5);
        kp[6] = new KuePesanan("Cheese Cake", 210000, 3);
        kp[7] = new KuePesanan("Tiramisu", 140000, 2);
        kp[8] = new KuePesanan("Brownies", 120000, 2);
        kp[9] = new KuePesanan("Macha", 128000, 2); 
        KueJadi[] kj = new KueJadi[10];
        kj[0] = new KueJadi("Kue Sagu", 59000, 1);
        kj[1] = new KueJadi("Lapis Legit", 77000, 3);
        kj[2] = new KueJadi("Kue Pandan", 80000, 1);
        kj[3] = new KueJadi("Kue Lobak Merah", 59000, 2);
        kj[4] = new KueJadi("Mete Cookies", 90000, 1);
        kj[5] = new KueJadi("Bakpia", 37000, 2);
        kj[6] = new KueJadi("Banana Cake", 59000, 2);
        kj[7] = new KueJadi("Souffle", 75000, 3);
        kj[8] = new KueJadi("Lapis Malang", 190000, 3);
        kj[9] = new KueJadi("Almond cake", 95000, 2);
        KueBasi[] kb = new KueBasi[10];
        kb[0] = new KueBasi("Nastar", 54000, 2);
        kb[1] = new KueBasi("Lidah Kucing", 46000, 5);
        kb[2] = new KueBasi("Putri Salju", 58000, 12);
        kb[3] = new KueBasi("Lemon Cookies", 52000, 2);
        kb[4] = new KueBasi("Mete Cookies", 80000, 1);
        kb[5] = new KueBasi("Bakpia", 35000, 2);
        kb[6] = new KueBasi("Cake Roll", 56000, 2);
        kb[7] = new KueBasi("Bolu Pandan", 65000, 3);
        kb[8] = new KueBasi("Rainbow Cake", 180000, 3);
        kb[9] = new KueBasi("Kue Kacang", 85000, 2);
        for (int j = 0; j < 10; j++) {
            harga += kp[j].hitungHarga() + kj[j].hitungHarga() + kb[j].hitungHarga();
            hargaKP += kp[j].hitungHarga();
            berat += kp[j].getBerat();
            hargaKJ += kj[j].hitungHarga();
            jumlah += kj[j].getJumlah();
            hargaKB += kb[j].hitungHarga();
            lamaHari += kb[j].getLamaHari();

            if (kp[j].hitungHarga() > tertinggi) {
                tertinggi = kp[j].hitungHarga();
            }
            if (kj[j].hitungHarga() > tertinggi) {
                tertinggi = kj[j].hitungHarga();
            }
            if (kb[j].hitungHarga() > tertinggi) {
                tertinggi = kb[j].hitungHarga();
            }
        }
        for (int i = 0; i < 10;) {
            System.out.println("1. Informasi semua kue dan jenis kuenya");
            System.out.println("2. Total harga yang didapat dari semua jenis kue");
            System.out.println("3. Total harga dan total berat dari KuePesanan ");
            System.out.println("4. Total harga dan total jumlah dari KueJadi ");
            System.out.println("5. Total harga dan total lama hari dari KueBasi");
            System.out.println("6. Informasi kue dengan harga (harga akhir) terbesar");
            System.out.println("7. Keluar");
            System.out.print("Pilihan = ");
            int p = in.nextInt();
            switch (p) {
                case 1:
                    System.out.println("---------------------------------------------------------------");
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Kue Pesanan");
                        System.out.println(kp[j]);
                        System.out.println("Berat       : " + kp[j].getBerat() + " kg");
                        System.out.println("Total Harga : Rp." + kp[j].hitungHarga());
                        System.out.println("---------------------------------------------------------------");
                    }
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Kue Jadi");
                        System.out.println(kj[j]);
                        System.out.println("Jumlah      : " + kj[j].getJumlah());
                        System.out.println("Total Harga : Rp." + kj[j].hitungHarga());
                        System.out.println("---------------------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total Harga Semua Jenis Kue : " + harga);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total Harga Kue Pesanan : " + hargaKP);
                    System.out.println("Total Berat Kue Pesanan : " + berat);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total Harga Kue Jadi  : " + hargaKJ);
                    System.out.println("Total Jumlah Kue Jadi : " + jumlah);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total Harga Kue Basi     : " + hargaKB);
                    System.out.println("Total Lama Hari Kue Basi : " + lamaHari);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 6:
                    for (int j = 0; j < 10; j++) {
                        if (tertinggi == kp[j].hitungHarga()) {
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Harga Terbesar Kue Pesanan");
                            System.out.println(kp[j]);
                            System.out.println("Berat       : " + kp[j].getBerat() + " kg");
                            System.out.println("Total Harga : Rp." + kp[j].hitungHarga());
                            System.out.println("---------------------------------------------------------------");
                        }
                        if (tertinggi == kj[j].hitungHarga()) {
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Harga Terbesar Kue Jadi");
                            System.out.println(kj[j]);
                            System.out.println("Jumlah      : " + kj[j].getJumlah());
                            System.out.println("Total Harga : Rp." + kj[j].hitungHarga());
                            System.out.println("---------------------------------------------------------------");
                        }
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Pilihan tidak ada");
                    System.out.println("---------------------------------------------------------------");
            }
        }
    }
}