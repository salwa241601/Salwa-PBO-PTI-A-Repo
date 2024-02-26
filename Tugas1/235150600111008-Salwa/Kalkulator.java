import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] operasi = {
            "Penjumlahan",
            "Pengurangan",
            "Perkalian",
            "Pembagian"
        };

        while (true) {

            System.out.println("\nKalkulator sederhana");

            for (int i = 0; i < operasi.length; i++) {
                System.out.println((i + 1) + ". " + operasi[i]);
            }
            System.out.print("Pilihlah operasi yang anda mau 1-" + operasi.length + ": ");
            int pilihanOperasi = sc.nextInt();

            if (pilihanOperasi < 1 || pilihanOperasi > operasi.length) {
                System.out.println("\nPilihan operasi tidak valid");
                continue;
            }

            System.out.print("Masukkan nilai pertama: ");
            int n1 = sc.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            int n2 = sc.nextInt();

            int hasil = hitungHasil(pilihanOperasi, n1, n2);

            System.out.println(" = " + hasil);

            System.out.println("\nApakah mau berhitung lagi (Y/T)? ");
            String ulang = sc.next();
            if (!ulang.equalsIgnoreCase("Y")) 
                if (!ulang.equalsIgnoreCase("y")){
                break;
            }
        }
    }

    private static int hitungHasil(int pilihanOperasi, int n1, int n2) {
        switch (pilihanOperasi) {
            case 1:
                System.out.print("\n" + n1 + " + " + n2);
                return n1 + n2;
            case 2:
                System.out.print("\n" + n1 + " - " + n2);
                return n1 - n2;
            case 3:
                System.out.print("\n" + n1 + " x " + n2);
                return n1 * n2;
            case 4:
                System.out.print("\n" + n1 + " / " + n2);
                return n1 / n2;
            default:
                return 0;
        }
    }
}
