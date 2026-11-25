package Tugas7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== SOAL 1 ==="); 
        Sapi Emoh = new Sapi();
        Emoh.makan();
        
        System.out.println("=== SOAL 2 ===");
        Soal2 s2 = new Soal2();
        System.out.println("Kel Persegi panjang (p = 10 , l - 5): " + s2.hitungKeliling(10,5));
        System.out.println();

        System.out.println("=== SOAL 3 ===");
        Soal3 s3 = new Soal3();
        System.out.println("Hasil tebakan (Januari tgl 14): " + s3.tebakTanggalLahir(1, 14));
        System.out.println();

        
        System.out.println("=== SOAL 4 ===");
        Soal4 s4 = new Soal4();
        s4.tampilkanSumpah();
        System.out.println();

        
        System.out.println("=== SOAL 5 ===");
        Soal5 s5 = new Soal5();
        System.out.println("Faktorial 5 = " + s5.hitungFaktorial(5));
        System.out.println();

        
        System.out.println("=== SOAL 6 ===");
        Dosen d = new Dosen("Dr. Budi Santoso");
        Mahasiswa m = new Mahasiswa("Andi Pratama");
        Staff st = new Staff("Siti Aminah");
        d.tampilkanInfo();
        m.tampilkanInfo();
        st.tampilkanInfo();
        System.out.println();

        
        System.out.println("=== SOAL 7 ===");
        Soal7 s7 = new Soal7();
        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();

        s7.setData(nama, npm, kelas);
        System.out.println("\n--- Hasil Input ---");
        s7.tampilkanData();

        input.close();
    }
}