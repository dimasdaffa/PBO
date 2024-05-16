package UTS3;

public class Main2 {
    public static void main(String[] args) {
  MahasiswaWisuda mhs1 = new MahasiswaWisuda (1,"Judul Skripsi","A11.2022.14079","Dimas","02-07-2004","A11");


        System.out.println("Data Mahasiswa :");
        System.out.println("Nomor Urut: " + mhs1.getNomorUrut());
        System.out.println("Nama: " + mhs1.getNim());
        System.out.println("Nim: " + mhs1.getNama());
        System.out.println("Judul: " + mhs1.getJudulSkripsi());
        System.out.println("Tanggal Lahir: " + mhs1.getTanggallahir());
        System.out.println("Kode Progdi: " + mhs1.getProgdi());
        System.out.println("Biaya: " + mhs1.getBiaya());
    }

}
