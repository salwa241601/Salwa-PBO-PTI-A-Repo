public class BurungMain {
    public static void main(String[] args) {
        Burung brg = new Burung();
        Burung brg1 = new Burung("Pipit");
        Burung brg2 = new Burung("Elang", "Avertebrata");

        Burung brg3 = new Burung();
        brg3.nama = "Pipit";
        brg3.jenis = "hfhgf";
        brg3.usia = 4;
        brg3.warnaBulu = "ada aja";

        brg3.aves();

        
       
    }
}
