package week2;

public class krs {
    String[] matakuliah = new String[5];
    int[] sks = new int[5];
    int totalsks = 0;

    public void setMataKuliah(String matkul, int index) {
        matakuliah[index] = matkul;
    }

    public void setSks(int kredit, int index) {
        sks[index] = kredit;
    }

    public void sumOfSks() {
        for (int i = 0; i < sks.length; i++) {
            totalsks = totalsks + sks[i];
        }
    }

    public void infoKrs() {
        for (int i = 0; i < getArraySize(matakuliah); i++) {
            System.out.println("Nama mata kuliah: " + matakuliah[i] + " SKS: " + sks[i]);
        }

        sumOfSks();
        System.out.println("Total SKS: " + totalsks);
    }

    public int getArraySize(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }
}
