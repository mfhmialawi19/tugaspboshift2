package Tugas3;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nomor induk Karyawan : ");
        String nik = input.nextLine();
        System.out.print("Masukan Nama Karyawan        : ");
        String nama = input.nextLine();
        System.out.print("Masukan alamat               : ");
        String alamat = input.nextLine();
        System.out.print("Jabatan                      : ");
        String jabatan = input.nextLine();
        System.out.print("gaji pokok                   : ");
        double p1 = input.nextDouble();
        System.out.print("Tunjangan jabatan            : ");
        double p2 = input.nextDouble();
        System.out.print("Tunjangan Istri              : ");
        double p3 = input.nextDouble();
        System.out.print("Tunjangan anak               : ");
        double p4 = input.nextDouble();
        
        double totalGaji = p1+p2+p3+p4;
        double pajakHasil = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajakHasil;
        
        System.out.println("=============================");
        System.out.println("  Rincian Gaji Para Karyawan ");
        System.out.println("=============================");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji pokok           : " + p1);
        System.out.println("Tunjangan jabatan    : " + p2);
        System.out.println("Tunjangan istri      : " + p3);
        System.out.println("Tunjangan anak       : " + p4);
        System.out.println("Total Gaji           : " + totalGaji);
        System.out.println("Pajak penghasilan    : " + pajakHasil);
        System.out.println("Gaji Bersih          : " + gajiBersih);
    }
}
