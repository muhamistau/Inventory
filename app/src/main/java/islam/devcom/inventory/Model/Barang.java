package islam.devcom.inventory.Model;

public class Barang {
    public int id;
    public String nama;
    // harga dalam USD
    public int harga;

    public Barang(int ids, String namas, int hargas) {
        this.id = ids;
        this.nama = namas;
        this.harga = hargas;
    }
}

