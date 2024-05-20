package javalab;

import java.util.Scanner;

public class InheritMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama dll
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan alamat: ");
        String address = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Objek student (nama, adr, nim)
        Student student = new Student(name, address, nim);

        // Menampilkan nama dll
        System.out.println("Nama: " + student.getName());
        System.out.println("Alamat: " + student.getAddress());
        System.out.println("NIM: " + student.getNim());

        // Hitung pembayaran
        double totalPembayaran = student.hitungPembayaran();
        System.out.println("Total pembayaran: " + totalPembayaran);

        // Tampilkan hobi
        student.hobi();
    }
}