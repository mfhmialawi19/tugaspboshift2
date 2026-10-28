package Tugas4;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Tahun : ");
        int tahun = input.nextInt();
                
        if((tahun % 4 == 0 && tahun % 100 != 0)|| (tahun % 400 == 0)){
            System.out.println("Tahun : " + tahun + " adalah tahun Kabisat");
        } else{
            System.out.println("Tahun : " + tahun + " adalah Bukan tahun Kabisat");
        }
    }
}
