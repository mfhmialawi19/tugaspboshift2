package Tugas6;

import java.util.Scanner;

public class Soal5 {
    private int baris, kolom;
    private int[][] matriksA, matriksB, hasil;

    public void inputMatriks() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        kolom = input.nextInt();

        matriksA = new int[baris][kolom];
        matriksB = new int[baris][kolom];
        hasil = new int[baris][kolom];

        System.out.println("\n--- Masukkan Matriks A ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println("\n--- Masukkan Matriks B ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matriksB[i][j] = input.nextInt();
            }
        }
    }

    public void jumlahkanMatriks() {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
    }

    public void tampilkanHasil() {
        System.out.println("\n--- Hasil Penjumlahan Matriks (A + B) ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
