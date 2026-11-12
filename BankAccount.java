public class BankAccount {
    String namaPemilik;
    double saldoAwal;
    double deposit;
    double penarikan;

    // Constructor untuk inisialisasi akun
    public BankAccount(String namaPemilik, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.saldoAwal = saldoAwal;
    }

    // Method hitung saldo akhir
    public double hitungSaldoAkhir() {
        return saldoAwal + deposit - penarikan;
    }

    // Method format Rupiah
    public String formatRupiah(double jumlah) {
        return String.format("%,.0f", jumlah).replace(',', '.');
    }

    // Method cetak output transaksi
    public void cetakStruk() {
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo Awal: Rp" + formatRupiah(saldoAwal));
        System.out.println("Deposit berhasil: Rp" + formatRupiah(deposit));
        System.out.println("Penarikan berhasil: Rp" + formatRupiah(penarikan));
        System.out.println("Saldo Akhir: Rp" + formatRupiah(hitungSaldoAkhir()));
    }
}