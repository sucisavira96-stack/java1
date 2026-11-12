public class ProdukElektronik extends Produk {
    int garansiBulan;

    public ProdukElektronik(String namaProduk, double harga, int garansiBulan) {
        super(namaProduk, harga);
        this.garansiBulan = garansiBulan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansiBulan + " Bulan");
    }
}