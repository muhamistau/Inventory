class Barang {

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
/**
 * InventoryDevcom
 */
public class InventoryDevcom {
    static int totalHarga(Barang[] bs) {
        int sum = 0;
        
        for (Barang b : bs) {
            sum += b.harga;
        }

        return sum;
    }

    static void print(Barang[] barangs) {
        for (int i = 0; i < barangs.length; i++) {
            System.out.printf(
                "id: %d\nnama: %s\nharga: %d\n\n", 
                barangs[i].id,
                barangs[i].nama,
                barangs[i].harga);
        }

        System.out.printf("Total Harga: %d", totalHarga(barangs));
        System.out.println("Total Harga: " + totalHarga(barangs));
    }

    public static void main(String[] args) {
        Barang[] barangs = new Barang[5];
        String[] namaBarang = {"sampo", "sabun", "sendal", "sepatu", "sendok"};
        int[] hargaBarang = {1000, 2000, 3000, 4000, 5000};

        Barang[] barangs2 = new Barang[5];

        // input barang
        for (int i = 0; i < 5; i++) {
            barangs[i] = new Barang(i, namaBarang[i], hargaBarang[i]);
            barangs2[i] = new Barang(i, namaBarang[i] + "2", hargaBarang[i] * 3);
        }

        print(barangs);

        System.out.println("\n\n");

        print(barangs2);
    }
}