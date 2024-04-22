package week5;

import week1.Mahasiswa;
import java.util.*;

public class MataKuliah {
    public MataKuliah(String nama, String klp, int sks) {
        //
    }

    public String getMatkul() {
        return getMatkul();
    }

    public String getKelompok() {
        return getKelompok();
    }

    public int getSks() {
        return getSks();
    }

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa("Budi", "12345");
        mhs.insertNilai(86.0);
        mhs.insertMatkul("PBO", "233232", 4);
        mhs.insertMatkul("Alpro", "233232", 2);
        mhs.getMataKuliah();

    }

}
