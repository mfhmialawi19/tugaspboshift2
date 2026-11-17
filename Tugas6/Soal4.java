package Tugas6;

import java.util.ArrayList;
import java.util.Scanner;
        
public class Soal4 {
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<Integer> nilai = new ArrayList<>();
    private ArrayList<String> status = new ArrayList<>();

    public void inputMahasiswa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang akan dimasukkan: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            nama.add(input.nextLine());
            
            System.out.print("Nilai  : ");
            int n = input.nextInt();
            input.nextLine(); 
            nilai.add(n);

            if (n <= 50) {
                status.add("Tidak Lulus");
            } else {
                status.add("Lulus");
            }
        }
    }

    public void tampilkanTabel() {
        System.out.println("\n\t\tDaftar Nilai Mahasiswa");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-8s | %-15s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < nama.size(); i++) {
            System.out.printf("%-5s | %-20s | %-8s | %-15s\n", (i + 1), nama.get(i), nilai.get(i), status.get(i));
        }
        System.out.println("--------------------------------------------------");
    }
}
