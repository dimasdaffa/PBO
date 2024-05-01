package latUTS;

public class Produk {
    protected String kdProduk;
    protected String nmProduk;
    protected double hrgBeli;
    protected double hrgJual;

    public void inputProduk(String kode, String nama, double hargaBeli) {
        this.kdProduk = kode;
        this.nmProduk = nama;
        this.hrgBeli = hargaBeli;
        this.hrgJual = setHargaJual(hargaBeli);
    }

    private double setHargaJual(double hargaBeli) {
        double hargaJual;
        if (hargaBeli > 200000) {
            hargaJual = hargaBeli + (0.1 * hargaBeli);
        } else if (hargaBeli > 100000) {
            hargaJual = hargaBeli + (0.15 * hargaBeli);
        } else if (hargaBeli > 50000) {
            hargaJual = hargaBeli + (0.2 * hargaBeli);
        } else if (hargaBeli > 25000) {
            hargaJual = hargaBeli + (0.3 * hargaBeli);
        } else {
            hargaJual = hargaBeli + (0.5 * hargaBeli);
        }
        return hargaJual;
    }
}
