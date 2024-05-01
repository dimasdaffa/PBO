package week7;

import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa {
    private int usia;
    private int semester;

    public MahasiswaAktif(String nama, String nim, String tanggallahir, int semester, int usia) {
        super(nama, nim, tanggallahir);
        this.semester = semester;
        this.usia = usia;

    }

    public void getIdentitas() {
        System.out.println("Nama: " + super.getNama());
        System.out.println("NIM: " + super.getNim());
        System.out.println("Tanggal Lahir: " + super.getTanggallahir());
        System.out.println("Semester: " + getSemester());
        System.out.println("Usia: " + getUsia());
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

}
