package Tugas5;

import java.util.Scanner;

public class Soal1 {
    private Scanner input = new Scanner(System.in);

    public void Bilangan() {
        System.out.print("Masukan 10 Angka : ");
        int angka = input.nextInt();
        System.out.println("Angka Ke- 1: " + angka);

        int terbesar = angka;
        int terkecil = angka;

        for (int i = 2; i <= 10; i++) {
            angka = input.nextInt();
            System.out.println("Angka Ke- " + i + ": " + angka);

            if (angka > terbesar) {
                terbesar = angka;
            }
            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("\n--------------------------");
        System.out.println("Angka Terbesar : " + terbesar);
        System.out.println("Angka Terkecil  : " + terkecil);
    }
}

