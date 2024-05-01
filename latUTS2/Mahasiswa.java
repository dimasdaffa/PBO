package latUTS2;

import java.util.Scanner;

public class Mahasiswa {
    private String nim, nama, jurusan;
    private int semester, sks;
    private double ipk, biayaKuliah, biayaUKT;

    public void inputData(Scanner input) {
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan Jurusan: ");
        jurusan = input.nextLine();
        System.out.print("Masukkan Semester: ");
        semester = input.nextInt();
        System.out.print("Masukkan IPK: ");
        ipk = input.nextDouble();
        System.out.print("Masukkan SKS: ");
        sks = input.nextInt();
        System.out.print("Masukkan Biaya UKT: ");
        biayaUKT = input.nextDouble();
        input.nextLine(); // Membersihkan baris baru setelah membaca double

        hitungBiayaKuliah();
    }

    private void hitungBiayaKuliah() {
        double biayaSKS = (semester >= 1 && semester <= 3) ? sks * 200000
                : (semester >= 4 && semester <= 6) ? sks * 300000 : sks * 400000;
        biayaKuliah = biayaSKS + biayaUKT;
    }

    public void tampilData() {
        System.out.println("\nData Mahasiswa");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Semester: " + semester);
        System.out.println("IPK: " + ipk);
        System.out.println("SKS: " + sks);
        System.out.println("Biaya UKT: Rp" + biayaUKT);
        System.out.println("Biaya Kuliah: Rp" + biayaKuliah);
    }
}
