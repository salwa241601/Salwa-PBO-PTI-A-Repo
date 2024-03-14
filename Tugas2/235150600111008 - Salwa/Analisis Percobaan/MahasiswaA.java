public class MahasiswaA {
    private int jumlahKataPerHari;
    private int isiBuku;
    public int lamaMenulis;

    public int rumus(int isiBuku, int jumlahKataPerHari) {
        return isiBuku * 2 * 200 / jumlahKataPerHari;
    }

    public void tampilkanHasil(int isiBuku, int jumlahKataPerHari) {
        System.out.println("Total lembar isi dalam buku: " + isiBuku);
        System.out.println("Jumlah kata yang ditulis per hari: " + jumlahKataPerHari);
        System.out.println("Lama menulis: " + rumus(isiBuku, jumlahKataPerHari) + " hari");
    }
}
