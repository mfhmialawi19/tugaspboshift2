package Tugas6;


public class Soal9 {
    private int[] age = {12, 4, 5, 2, 6};

    public void tampilkanForStandar() {
        System.out.println("1. Menggunakan For-Loop Standar : ");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + " ");
        }
        System.out.println();
    }

    public void tampilkanForEach() {
        System.out.println("2. Menggunakan For-Each Loop : ");
        for (int angka : age) {
            System.out.print(angka + " ");
        }
        System.out.println();
    }
}
