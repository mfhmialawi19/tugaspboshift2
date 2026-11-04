package Tugas5;


public class main {
    public static void main(String[] args) {
        
        Soal1 p1 = new Soal1 ();
        p1.Bilangan();
        
        System.out.println("=============================");
        Soal2 p2 = new Soal2 ();
        p2.inputBil();
        System.out.println("=============================");
        Soal3 p3 = new Soal3();
        p3.Floyd();
        System.out.println("=============================");
        Soal4 p4 = new Soal4();
        p4.Ganjil();
        System.out.println("=============================");
        Soal5 p5 = new Soal5();
        p5.bintang();
        System.out.println("=============================");
        Soal6 p6 = new Soal6();
        p6.Baris();
        System.out.println("=============================");
        Soal7 p7 = new Soal7();
        p7.While();
        System.out.println("=============================");
        Soal8 p8 = new Soal8();
        p8.foreach();
    }
}
