public abstract class BangunDatar {
    
    public static final double PI = 3.14;

    public int panjang;
    public int lebar;
    public double diameter;


    public int getLuasPersegi(int panjang, int lebar) {
        return panjang * lebar;
    }
    public int getLuasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public double getLuasLingkaran(double diameter) {
        return PI * diameter * diameter;
    }
}