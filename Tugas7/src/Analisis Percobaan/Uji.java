import java.util.Scanner;
public class Uji {
    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("Dani", "334", 700.00);
        salariedEmployee.setTanggalLahir(5, 5, 2000);
        Employee hourlyEmployee = new HourlyEmployee("Lina", "564", 16.75, 40);
        hourlyEmployee.setTanggalLahir(11, 6, 2001);
        Employee commissionEmployee = new CommissionEmployee("Bima", "765", 20000, .07);
        commissionEmployee.setTanggalLahir(30, 8, 1989);
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bimo", "876", 6000, .04, 300);
        basePlusCommissionEmployee.setTanggalLahir(17, 5, 1992);
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% :$ %,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
    }
}
