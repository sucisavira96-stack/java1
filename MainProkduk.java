public class MainProkduk {
    public static void main(String[] args) {
        ProdukElektronik laptop = new ProdukElektronik("Laptop Asus", 8500000, 24);
        System.out.println("=== Detail Produk Elektronik ===");
        laptop.tampilkanInfo();
    }
}