package Tugas6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soal6 {
    private double[] arr;
    private double total = 0;
    private int n;

    public void prosesInputDanHitung() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan yang ingin dihitung: ");
        
        try {
            n = input.nextInt();
            arr = new double[n];

            for (int i = 0; i < n; i++) {
                boolean valid = false;
                while (!valid) {
                    try {
                        System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                        arr[i] = input.nextDouble();
                        total += arr[i];
                        valid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("[Error] Masukan bukan angka! Silakan masukkan angka yang valid.");
                        input.next(); // Membersihkan input yang salah
                    }
                }
            }

            double rataRata = (n == 0) ? 0 : total / n;
            System.out.println("\nTotal keseluruhan: " + total);
            System.out.println("Nilai rata-rata: " + rataRata);

        } catch (InputMismatchException e) {
            System.out.println("[Error] Jumlah bilangan harus berupa angka bulat!");
        }
    }
}
