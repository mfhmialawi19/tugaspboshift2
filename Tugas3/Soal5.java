package Tugas3;

import java.io.*;

public class Soal5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan jumlah mangga awal: ");
        int manggaAwal = Integer.parseInt(br.readLine());
        System.out.print("Masukkan mangga busuk: ");
        int manggaBusuk = Integer.parseInt(br.readLine());
        
        System.out.print("Masukkan jumlah tetangga: ");
        int jumlahTetangga = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jambu per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());
        
        int manggaBersih = manggaAwal - manggaBusuk;
        int totalJambu = jumlahTetangga * jambuPerTetangga;
        int totalBuah = manggaBersih + totalJambu;
        
        System.out.println("\nTotal mangga yang tersisa : " + manggaBersih + " pcs");
        System.out.println("Total jambu yang dibeli   : " + totalJambu + " pcs");
        System.out.println("Total seluruh buah        : " + totalBuah + " pcs");
        
    }
}
