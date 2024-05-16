package UTS3;

import java.util.Scanner;

// import inheritance.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program hitung biaya kuliah mahasiswa ");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Nomor Urut: ");
        int nomor_urut = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Judul Skripsi: ");
        String judul_skripsi = scanner.nextLine();
        System.out.print("Nim: ");
        String nim = scanner.nextLine();
        System.out.print("Tanggal Lahir: ");
        String tanggal_lahir = scanner.nextLine();
        System.out.print("Progdi: ");
        String progdi = scanner.nextLine();


        MahasiswaWisuda mhs1 = new MahasiswaWisuda(nomor_urut, judul_skripsi,nim,nama,tanggal_lahir, progdi);
        System.out.println("Data Mahasiswa :");
        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Judul: " + mhs1.getJudulSkripsi());
        System.out.println("Progdi: " + mhs1.getProgdi());
        System.out.println("Biaya: " + mhs1.getBiaya());
    }
}
