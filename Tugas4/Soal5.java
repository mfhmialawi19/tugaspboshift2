package Tugas4;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.print("Masukkan total penjualan hari ini (Rp): ");
        double pendapatanHari = input.nextDouble();
        
        double uangJasa = 0;
        double komisi = 0;
        
        if (pendapatanHari <= 2000000) {
            uangJasa = 100000;
            komisi = 0.10 * pendapatanHari;
        } else if (pendapatanHari <= 5000000) {
            uangJasa = 200000;
            komisi = 0.15 * pendapatanHari;
        } else {
            uangJasa = 300000;
            komisi = 0.20 * pendapatanHari;
        }
        
        double totalPendapatan = uangJasa + komisi;
        
        System.out.println("Uang Jasa       : Rp" + uangJasa);
        System.out.println("Uang Komisi     : Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    }
}
