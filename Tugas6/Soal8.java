package Tugas6;

import java.util.Scanner;

public class Soal8 extends Thread {
    private int threadId;

    public Soal8(int id) {
        this.threadId = id;
    }

    @Override
    public void run() {
        System.out.println("Thread ke-" + threadId + " mulai berjalan.");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berapa banyak thread yang ingin dibuat: ");
        int jumlahThread = input.nextInt();

        for (int i = 1; i <= jumlahThread; i++) {
            Soal8 t = new Soal8(i);
            t.start();
        }
    }
    
}
