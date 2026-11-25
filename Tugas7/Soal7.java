package Tugas7;

public class Soal7 {
    String nama;
    String npm;
    String kelas;

    public void setData(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}