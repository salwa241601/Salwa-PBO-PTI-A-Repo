import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //instan objek bernama m1 
    Mobil m1 = new Mobil(); 
    // m1.setKecepatan(50); 
    // m1.setManufaktur("Toyota"); 
    // m1.setNoPlat("AB 1231 UA"); 
    // m1.setWarna("Merah"); 
    System.out.print("\nMasukkan manufaktur mobil : ");
    m1.setManufaktur(sc.nextLine());
    System.out.print("Masukkan no plat mobil : ");
    m1.setNoPlat(sc.nextLine());
    System.out.print("Masukkan warna mobil : ");
    m1.setWarna(sc.nextLine());
    System.out.print("Masukkan kecepatan mobil : ");
    m1.setKecepatan(sc.nextInt());
    System.out.print("Masukkan waktu yang ingin ditempuh : ");
    m1.setWaktu(sc.nextDouble());
    m1.displayMessage();
    // System.out.println("================");
    // //instan objek baru bernama m2 
    // Mobil m2 = new Mobil(); 
    // m2.setKecepatan(100); 
    // m2.setManufaktur("Mitsubishi"); 
    // m2.setNoPlat("N 1134 AG"); 
    // m2.setWarna("Pink"); 
    // m2.displayMessage();
    // System.out.println("================");
    // //merubah warna dari objek m1
    // System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
    // m1.setWarna("Hijau");
    // //menampilkan hasil perubahan m1.displayMessage();

    // System.out.println("Masukkan kecepatan mobil: " );
    }
}


