package UTS3;

import java.util.ArrayList;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaWisuda extends Mahasiswa {
    private int nomor_urut;
    private String judul_skripsi;
    private double potongan = 0.1;
    private String tanggal_lahir;
    private String progdi;
    private ArrayList<BiayaWisuda> biaya_wisuda = new ArrayList<BiayaWisuda>();
    private ArrayList<BiayaWisuda> biaya_sidang = new ArrayList<BiayaWisuda>();

    // const
    public MahasiswaWisuda(int nomor_urut, String judul_skripsi, String nim, String nama, String tanggal_lahir,
            String progdi) {
        // super class
        super(nim, nama, tanggal_lahir);
        this.nomor_urut = nomor_urut;
        this.judul_skripsi = judul_skripsi;
        this.progdi = progdi;
        this.tanggal_lahir = tanggal_lahir;
    }

    // getter
    public int getNomorUrut() {
        return nomor_urut;
    }

    public String getJudulSkripsi() {
        return judul_skripsi;
    }

    public String getProgdi() {
        return progdi;
    }
    public String getTanggallahir() {
        return tanggal_lahir;
    }

    // getter+kondisi switch
    public double getBiaya() {
        int biaya_sidang = 350000;
        int biaya_wisuda;
        double total;
        double diskon;
        switch (progdi) {
            case "A11":
                biaya_wisuda = 2000000;
                break;
            case "A12":
                biaya_wisuda = 2000000;
                break;
            case "A14":
                biaya_wisuda = 1750000;
                break;
            case "A15":
                biaya_wisuda = 1500000;
                break;

            default:
                biaya_wisuda = 1250000;
                break;
        }

        diskon = (biaya_sidang + biaya_wisuda) * potongan;
        total = (biaya_sidang + biaya_wisuda) - diskon;
        return total;
    }

}
