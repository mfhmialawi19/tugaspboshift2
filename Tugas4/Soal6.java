package Tugas4;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();
        
        System.out.print("Apakah memiliki kartu member? (y/t): ");
        char punyaMember = input.next().charAt(0);
        
        System.out.print("Masukkan uang yang diberikan pembeli (Rp): ");
        double uangDiberikan = input.nextDouble();
        
        double diskon = 0;
        
        if (punyaMember == 'y' || punyaMember == 'Y') {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        
        double harusDibayar = totalBelanja - diskon;
        double kembalian = uangDiberikan - harusDibayar;
        
        System.out.println("\n--- Struk Belanja ---");
        System.out.println("Total Belanja     : Rp " + totalBelanja);
        System.out.println("Diskon            : Rp " + diskon);
        System.out.println("Yang Harus Dibayar: Rp " + harusDibayar);
        System.out.println("Uang Diberikan    : Rp " + uangDiberikan);
        System.out.println("Kembalian         : Rp " + kembalian);   
    }
}
