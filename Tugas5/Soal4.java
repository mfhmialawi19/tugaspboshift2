package Tugas5;

import java.util.Scanner;

public class Soal4 {
    private Scanner input = new Scanner(System.in);
    
    public void Ganjil(){
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();

        int ganjil = 1, total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }

        System.out.println("\nTotal penjumlahan : " + total);
    }
}
