import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manusia human = new Manusia("Salwa", 19);
        human.tampilkanNama();
        human.tampilkanUmur();

        
    System.out.println("Silahkan pilih identitas yang ingin anda masukkan");
        System.out.println("1. Manusia");
        System.out.println("2. Hewan");
        System.out.print("Pilihan = ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama manusia: ");
                String namaManusia = sc.next();
                System.out.print("Masukkan umur manusia: ");
                int umurManusia = sc.nextInt();

                Manusia manusia = new Manusia(namaManusia, umurManusia);

                System.out.println("\nNamanya " + namaManusia + " yang berumur " + umurManusia);
                manusia.makan();
                manusia.berjalan();
                manusia.bersuara();
                manusia.tampilkanNama();
                manusia.tampilkanUmur();
                break;

            case 2:
                System.out.print("Masukkan nama hewan: ");
                String namaHewan = sc.next();
                System.out.print("Masukkan umur hewan: ");
                int umurHewan = sc.nextInt();

                Hewan hewan = new Hewan(namaHewan, umurHewan);

                System.out.println("\nNama hewan ini ialah " + namaHewan + " yang berumur " + umurHewan + " bulan");
                hewan.makan();
                hewan.berjalan();
                hewan.bersuara();
                hewan.tampilkanNama();
                hewan.tampilkanUmur();
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }

        Hewan animal = new Hewan();
        animal.makan();
        animal.bersuara();
        animal.berjalan();
        
    }

}
