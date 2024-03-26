import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa yang ingin diinput : ");
        int j = sc.nextInt();
        Student[] murid = new Student[j];

        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();
        
        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();//siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();
        
        //siswa denagan nama chris dirubah informasi alamat danumurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        Student salwa = new Student(71, 81, 77);
        salwa.setName("Salwa");
        salwa.setAddress("Kalteng");
        salwa.setAge(19);
        salwa.displayMessage();

        Student.jumlahObjek(j);

    }
}
    
    
