package Tugas6;


public class Soal7 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread anak sedang berjalan: " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println("Proses iterasi thread ke-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu.");
            }
        }
        System.out.println("Thread anak selesai.");
    }
    public static void main(String[] args) {
        System.out.println("Thread utama (main) dimulai.");
        
        Soal7 threadAnak = new Soal7();
        threadAnak.start(); // Memanggil start untuk memulai eksekusi thread baru
        
        System.out.println("Thread utama (main) selesai.");
    }
}
