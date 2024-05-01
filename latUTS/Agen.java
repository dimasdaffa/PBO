package latUTS;

public class Agen extends Produk {
    private String noNota;
    private int jmlJual;
    private double totJual;
    private int jnsByr; // 1 = Cash, 2 = Tempo
    private String ketByr;
    private double ppn;
    private double bunga;
    private double totByr;
    private String souvenir;

    public Agen(String cabang) {
        System.out.println("Agen Cabang: " + cabang);
    }

    public void setNota(String nota) {
        this.noNota = nota;
    }

    public void inputJumlah(int jumlah) {
        this.jmlJual = jumlah;
    }

    public double getHargaJual() {
        return this.hrgJual;
    }

    public void inputJenis(int jenis) {
        this.jnsByr = jenis;
    }

    public void hitungJual() {
        this.totJual = this.jmlJual * this.hrgJual;
        this.ppn = 0.11 * this.totJual;
        if (this.jnsByr == 2) {
            int waktuTempo = inputWaktuTempo();
            if (waktuTempo > 1) {
                this.bunga = 0.05 * this.totJual;
            }
        }
        this.totByr = this.totJual + this.ppn + this.bunga;
        this.ketByr = (this.jnsByr == 1) ? "Cash" : "Tempo";
        this.souvenir = setSouvenir(this.totByr);
    }

    private int inputWaktuTempo() {
        // Implementasi untuk meminta input waktu tempo dari pengguna
        return 2; // Asumsi waktu tempo 2 bulan
    }

    private String setSouvenir(double totalBayar) {
        if (totalBayar >= 1000001) {
            return "Voucher 100rb";
        } else if (totalBayar >= 750001) {
            return "Tas Belanja";
        } else if (totalBayar >= 500001) {
            return "Payung";
        } else if (totalBayar >= 100000) {
            return "Mug";
        } else {
            return "-";
        }
    }

    public void cetak() {
        System.out.println("\nNota : " + this.noNota);
        System.out.println("Kode Produk : " + this.kdProduk);
        System.out.println("Nama Produk : " + this.nmProduk);
        System.out.println("Harga Beli : " + this.hrgBeli);
        System.out.println("Harga Jual : " + this.hrgJual);
        System.out.println("Jumlah Jual : " + this.jmlJual);
        System.out.println("Total : " + this.totJual);
        System.out.println("Jenis Bayar : " + this.ketByr);
        System.out.println("Keterangan Bayar : " + this.ketByr);
        System.out.println("PPN : " + this.ppn);
        System.out.println("Bunga : " + this.bunga);
        System.out.println("Total Bayar : " + this.totByr);
        System.out.println("Souvenir : " + this.souvenir);
    }
}
