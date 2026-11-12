public class MainBank {
    public static void main(String[] args) {
        // Inisialisasi akun dengan nama suci savira
        BankAccount akun = new BankAccount("suci savira", 1000000);

        // Memasukkan nominal transaksi
        akun.deposit = 500000;
        akun.penarikan = 200000;

        // Menampilkan struk transaksi
        akun.cetakStruk();
    }
}