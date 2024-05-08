public class Uji2 {
    public static void main(String[] args) {
        Employee[] salariedProduct = new SalariedProduct[4];
        salariedProduct[0] = new SalariedProduct("Claude", "343", 8);
        salariedProduct[1] = new SalariedProduct("Lucas", "424", 2);
        salariedProduct[2] = new SalariedProduct("Athy", "232", 10);
        salariedProduct[3] = new SalariedProduct("Reina", "654", 6);
        for (Employee salariedProduct1 : salariedProduct) {
            System.out.println(salariedProduct1);
            System.out.printf("pendapatan: $%,.2f\n\n", salariedProduct1.earnings());
        }
    }
}