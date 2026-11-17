package Tugas6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soal3 {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int sumGanjilIndex = 0;
    private int sumGenapIndex = 0;

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        System.out.println("Masukkan nilai elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            arr.add(input.nextInt());
        }
    }

    public void MinMax() {
        if (arr.isEmpty()) return;
        int max = arr.get(0), min = arr.get(0);
        int idxMax = 0, idxMin = 0;
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                idxMax = i;
            }
            if (arr.get(i) < min) {
                min = arr.get(i);
                idxMin = i;
            }
        }
        System.out.println("\nNilai terbesar: " + max + " pada indeks " + idxMax);
        System.out.println("Nilai terkecil: " + min + " pada indeks " + idxMin);
    }

    public void TotalDanRataRata() {
        double total = 0;
        for (int val : arr) {
            total += val;
        }
        double rataRata = arr.isEmpty() ? 0 : total / arr.size();
        System.out.println("Jumlah total elemen: " + total);
        System.out.println("Nilai rata-rata: " + rataRata);
    }

    public void GanjilGenap() {
        sumGanjilIndex = 0;
        sumGenapIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 != 0) {
                sumGanjilIndex += arr.get(i);
            } else {
                sumGenapIndex += arr.get(i);
            }
        }
        System.out.println("Jumlah elemen berindeks ganjil: " + sumGanjilIndex);
        System.out.println("Jumlah elemen berindeks genap: " + sumGenapIndex);
    }

    public void cekGanjilGenap() {
        String statusE = (sumGanjilIndex % 2 == 0) ? "Genap" : "Ganjil";
        String statusF = (sumGenapIndex % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Hasil jumlah indeks ganjil bernilai: " + statusE);
        System.out.println("Hasil jumlah indeks genap bernilai: " + statusF);
    }

    public void urutkanArray() {
        Collections.sort(arr);
        System.out.println("ArrayList setelah diurutkan: " + arr);
    }
}
