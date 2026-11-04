package Tugas5;

import java.util.Scanner;

public class Soal3 {
    private Scanner input = new Scanner(System.in);
    public void Floyd(){
        System.out.print("Masukkan banyak baris : ");
        int baris = input.nextInt();
        int angka = 1;
        
        for (int i = 1; i <= baris; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}
