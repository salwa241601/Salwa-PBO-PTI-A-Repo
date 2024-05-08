import java.util.*;

public abstract class Employee {
    private String name;
    private String noKTP;
    private Date tanggalLahir;
    private Date bulanIni = new Date();
    public Employee(String name, String noKTP){
        this.name = name;
        this.noKTP = noKTP;
    }
    @SuppressWarnings("deprecation")
    public void setTanggalLahir(int tanggal, int bulan, int tahun){
        this.tanggalLahir = new Date(tahun, bulan, tanggal);
    }
    public Date getTanggalLahir(){
        return tanggalLahir;
    }
    @SuppressWarnings("deprecation")
    public double getBonusBulanLahir(){
        if (bulanIni.getMonth() + 1 == tanggalLahir.getMonth()) {
            return 1000;
        } else {
            return 0;
        }
    }
    @SuppressWarnings("deprecation")
    public void setBulanGaji(int bulan){
        bulanIni.setMonth(bulan-1);
    }
    public String getName(){
        return name;
    }
    public String getNoKTP(){
        return noKTP;
    }
    public String toString(){
        return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP());
    }
    public abstract double earnings();
   }