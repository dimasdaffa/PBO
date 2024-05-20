package javalab;

import java.util.Scanner;

public class Student extends Person {
	private String nim;

	public Student(String name, String address, String nim) {
		// memanggil const dari superclass (Person) dengan parameter name dan address
		super(name, address);
		this.nim = nim;
	}

	public String getNim() {// method public untuk mendapatkan nilai atribut nim

		return nim;// mengembalikan nilai atribut nim
	}

	public double hitungPembayaran() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan SPP: ");
		double spp = scanner.nextDouble();

		System.out.print("Masukkan SKS: ");
		int sks = scanner.nextInt();

		System.out.print("Masukkan biaya modul: ");
		double modul = scanner.nextDouble();

		double totalPembayaran = spp + (sks * 100000) + modul;
		return totalPembayaran;
	}
}