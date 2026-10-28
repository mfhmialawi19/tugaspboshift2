package Tugas4;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. SENIN ");
        System.out.println("2. SELASA ");
        System.out.println("3. RABU ");
        System.out.println("4. KAMIS ");
        System.out.println("5. JUM'AT ");
        System.out.println("6. SABTU ");
        System.out.println("7. MINGGU ");
        
        
        System.out.print("Masukan Pilihan : ");
        int pilih = input.nextInt();
        
        if(pilih == 1){
            System.out.println( pilih + " SENIN ");
        }else if (pilih == 2){
            System.out.println( pilih + " SELASA ");
        }else if (pilih == 3){
            System.out.println( pilih + " RABU ");
        }else if (pilih == 4){
            System.out.println( pilih + " KAMIS ");
        }else if (pilih == 5){
            System.out.println( pilih + " JUM'AT ");
        }else if (pilih == 6){
            System.out.println( pilih + " SABTU ");
        }else if (pilih == 7){
            System.out.println( pilih + " MINGGU ");
        }
    }
}
