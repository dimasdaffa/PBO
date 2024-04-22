package week5;
import java.util.Scanner;

import week6.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "A11.2000.0000";
        mhs1.nama = "Budi";
        mhs1.sks = 22;
        mhs1.semester = 3;
    }

    double biayaKuliah= mhs1.hitungBiayaKuliah();
    System.out.print("Biaya Kuliah Mahasiswa = " + biayaKuliah);

}
