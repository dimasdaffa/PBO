package week4;

import week1.Mahasiswa;
import java.util.*;

public class Akademik {
    public static void main(String[] args) {
        int n;
        System.out.print("Masukkan Jumlah Data : ");

        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        Mahasiswa[] mhs = new Mahasiswa[n];

        String nim;
        String nama;
        Double ipk;

        for (int i = 0; i < n; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan NIM:");
            nim = inp.nextLine();
            System.out.print("Masukkan IPK:");
            ipk = inp.nextDouble();
            System.out.print("Masukkan Nama:");
            nama = inp.nextLine();

            mhs[i] = new Mahasiswa(nim, nama, ipk);

        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println(mhs[i].getIdentitas());
        }

    }

}
