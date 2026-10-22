package Tugas3;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Program Hitung Waktu Percetakan Novel ---");
      
        System.out.print("Masukkan banyaknya novel yang akan dicetak : ");
        int jumlahNovel = input.nextInt();
        
        System.out.print("Masukkan tebal lembar per novel            : ");
        int lembarPerNovel = input.nextInt();
        
        int totalDetik = jumlahNovel * lembarPerNovel;
        int hari = totalDetik / 86400;
        int sisaDetik = totalDetik % 86400;
        
        int jam = sisaDetik / 3600;
        sisaDetik = sisaDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;
        
        // Output hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Total Lembar yang dicetak : " + (jumlahNovel * lembarPerNovel) + " lembar");
        System.out.println("Waktu yang diperlukan     : " + hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");
        
        input.close();
    }
}
