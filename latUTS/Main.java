package latUTS;

public class Main {
    public static void main(String[] args) {
        Agen agen = new Agen("Jakarta");
        agen.setNota("001");
        agen.inputProduk("P001", "Produk A", 150000);
        agen.inputJumlah(5);
        agen.inputJenis(1); // 1 = Cash
        agen.hitungJual();
        agen.cetak();
    }
}
