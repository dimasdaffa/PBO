package week6;

import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int sks;
    private int semester;
    private double spp; // Declare the spp variable

    public Mahasiswa(String nama, String nim, int sks, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.sks = sks;
        this.semester = semester;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getSks() {
        return sks;
    }

    public int getSemester() {
        return semester;
    }

    public double hitungBiayaKuliah() {
        double biayaPerSks = 750000;
        if (semester <= 2) {
            biayaPerSks = 300000;
            spp = 3000000; // Assign the spp value
        } else if (semester >= 3 && semester <= 6) {
            biayaPerSks = 275000;
            spp = 2900000; // Assign the spp value
        } else {
            biayaPerSks = 250000;
            spp = 2750000; // Assign the spp value
        }
        return sks * biayaPerSks + spp; // Add spp to the total cost
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program hitung biaya kuliah mahasiswa ");
        System.out.print("Nama: ");
        String nama1 = scanner.nextLine();
        System.out.print("Nim: ");
        String nim1 = scanner.nextLine();
        System.out.print("Sks: ");
        int sks1 = scanner.nextInt();
        System.out.print("Semester: ");
        int semester1 = scanner.nextInt();

        Mahasiswa mahasiswa1 = new Mahasiswa(nama1, nim1, sks1, semester1);
        System.out.println("Data Mahasiswa :");
        System.out.println("Nama: " + mahasiswa1.getNama());
        System.out.println("Nim: " + mahasiswa1.getNim());
        System.out.println("Sks: " + mahasiswa1.getSks());
        System.out.println("Semester: " + mahasiswa1.getSemester());
        System.out.println("Biaya mahasiswa : Rp" + mahasiswa1.hitungBiayaKuliah());
    }
}