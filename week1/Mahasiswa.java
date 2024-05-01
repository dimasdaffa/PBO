package week1;

import java.util.ArrayList;
import java.util.Iterator;

import week5.MataKuliah;

public class Mahasiswa {

    private String nim, nama, tanggallahir;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<MataKuliah> mk = new ArrayList<MataKuliah>();
    

    public Mahasiswa(String nim, String nama, String tanggallahir) {
        this.nim = nim;
        this.nama = nama;
        this.tanggallahir = tanggallahir;
    }
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
      

    }

    public void insertNilai(double n1) {
        nilai.add(n1);
    }

    public void insertMatkul(String nama, String klp, int sks) {
        mk.add(new MataKuliah(nama, klp, sks));
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public String getNama() {
        return nim;
    }

    public String getNim() {
        return nama;
    }

    public void belajar() {
        System.out.println(nama + " belajar");
    }

    public void mainGame() {
        System.out.println(nama + " main game");
    }

    public void getIdentitas() {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("NIM mahasiswa: " + nim);
    }

    private void getNilai() {
        Iterator<Double> it = nilai.iterator(); // looping menggunakan iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void getMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : mk) {
            System.out.println(matkul.getMatkul() + "-" + matkul.getKelompok() + "-" + matkul.getSks());
        }
    }
}