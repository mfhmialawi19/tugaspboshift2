package Tugas4;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan angka = ");
        int angka = input.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Bilangan : " + angka + " -> angka Genap");
        }else{
            System.out.println("Bilangan : " + angka + " -> angka Ganjil");
        }           
    }
}
