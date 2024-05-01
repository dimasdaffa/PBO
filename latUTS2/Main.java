package latUTS2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine(); // Membersihkan baris baru setelah membaca int

        Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            mahasiswaArray[i] = new Mahasiswa();
            mahasiswaArray[i].inputData(input);
        }

        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            mahasiswa.tampilData();
        }
    }
}
