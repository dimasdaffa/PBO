package javalab;

public class Person {
	// atribut
	private String name;
	private String address;

	// konstruktor public untuk class Person yg dua parameter
	public Person(String name, String address) {
		// atribut name dgn parameter name
		this.name = name;
		this.address = address;
	}

	// method public untuk mendapatkan nilai atribut name
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	// method public untuk menampilkan hobi
	public void hobi() {
		System.out.println("Hobi saya adalah membaca dan berolahraga.");
	}
}