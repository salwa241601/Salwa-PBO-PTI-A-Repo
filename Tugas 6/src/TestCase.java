

public class TestCase {
    public static void main(String[] args) throws Exception {
        Manusia m1 = new Manusia("Bima", "123", true, true);
        Manusia m2 = new Manusia("Lila", "456", false, true);
        Manusia m3 = new Manusia("Damar", "789", true, false);
        
        MahasiswaFILKOM mf1 = new MahasiswaFILKOM("195150200111100", 2.9, "Bima", "123", true, true);
        MahasiswaFILKOM mf2 = new MahasiswaFILKOM("115150200111100", 3.1, "Lila", "456", false, true);
        MahasiswaFILKOM mf3 = new MahasiswaFILKOM("105150200111100", 3.9, "Damar", "789", true, false);
       
        Pekerja p1= new Pekerja(1000, 2022, 3, 2, 2, "Dimas", "123", true, true); 
        Pekerja p2 = new Pekerja(1000, 2015, 4, 5, 0, "Lila", "456", false, true); 
        Pekerja p3 = new Pekerja(1000, 2004, 6, 7, 10, "Damar", "789", true, false); 
        Manager manager = new Manager("HRD", 7500, 2009, 4, 3, 0, "Rina", "101", false, false);
        System.out.println(m1); 
        System.out.println("*******************************************");
        System.out.println(m2); 
        System.out.println("*******************************************");
        System.out.println(m3);
        System.out.println("*******************************************");
        System.out.println(mf1);
        System.out.println("*******************************************");
        System.out.println(mf2);
        System.out.println("*******************************************");
        System.out.println(mf3);
        System.out.println("*******************************************");
        System.out.println(p1);
        System.out.println("*******************************************");
        System.out.println(p2);
        System.out.println("*******************************************");
        System.out.println(p3);
        System.out.println("*******************************************");
        System.out.println(manager);
        System.out.println("*******************************************");
    }
}
