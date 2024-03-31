package week1;

public class Mahasiswa
{
    public String nim,nama;
    public int usia;
    public Double ipk;
    
    public Mahasiswa(String nim, String nama, Double ipk) {
		this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
	}

    public void belajar()
    {
        System.out.println(nama + " belajar");
    }

    public void mainGame()
    {
        System.out.println(nama + " main game");
    }

    public void getIdentitas()
    {
        System.out.println("Nama mahasiswa: "+nama);
        System.out.println("NIM mahasiswa: "+nim);
        System.out.println("Usia: "+usia);
        System.out.println("IPK: "+ipk);
    }


}