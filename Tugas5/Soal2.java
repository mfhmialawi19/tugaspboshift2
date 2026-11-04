package Tugas5;

import java.util.Scanner;

public class Soal2 {
    private Scanner input = new Scanner(System.in);
    public void inputBil(){
        
        System.out.print("Masukan Jumlah Angka : ");
        int n = input.nextInt();
       
        double angka;
        double total = 0;
        double rata;
        
        for (int i=1; i <= n; i++ ){
            System.out.print("Angka ke - " + i + ": " );
            angka = input.nextDouble();
            total += angka;            
        }
        rata = total / n;
        
        System.out.println("Jumlah Total : " + total);
        System.out.println("Jumlah rata2 : " + rata);
        
    }
}
