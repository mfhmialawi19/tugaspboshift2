package Tugas3;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Waktu Pertama ---");
        System.out.print("Jam: ");
        int jam1 = input.nextInt();
        System.out.print("Menit: ");
        int menit1 = input.nextInt();
        System.out.print("Detik: ");
        int detik1 = input.nextInt();
        
        System.out.println("\n--- Waktu Kedua ---");
        System.out.print("Jam: ");
        int jam2 = input.nextInt();
        System.out.print("Menit: ");
        int menit2 = input.nextInt();
        System.out.print("Detik: ");
        int detik2 = input.nextInt();
        
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;
        
        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);
        
        int selisihJam = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int selisihMenit = sisaDetik / 60;
        int detikSisa = sisaDetik % 60;
        
        System.out.println("\nSelisih Waktu: " + selisihJam + " jam, " + selisihMenit + " menit, " + detikSisa + " detik.");
    }
}
