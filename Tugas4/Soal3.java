package Tugas4;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIK  : ");
        String nik = input.nextLine();
        System.out.println("=====================");
        System.out.println("golongan darah");
        System.out.println("1.a 2.ab 3.b 4.o");
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int kodeGolongan = input.nextInt();
        
        System.out.println("1.Menikah 2.belum / Cerai ");
        System.out.print("Status Pernikahan : ");
        int statusNikah = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();
        
        double gajiPokok = 0;
        
        switch (kodeGolongan) {
            case 1:
                gajiPokok = 1200000;
                break;
            case 2:
                gajiPokok = 1500000;
                break;
            case 3:
                gajiPokok = 1750000;
                break;
            case 4:
                gajiPokok = 2000000;
                break;
            default:
                System.out.println("Kode Golongan tidak valid.");
        }
        
        double tunjanganPasangan = (statusNikah == 1) ? 0.10 * gajiPokok : 0;
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;
        
        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Nik           : " + nik);
        System.out.println("Gaji Pokok      : Rp. " + gajiPokok);
        System.out.println("Total Tunjangan : Rp. " + totalTunjangan);
        System.out.println("Gaji Bersih     : Rp. " + gajiBersih);
        
    }
}
