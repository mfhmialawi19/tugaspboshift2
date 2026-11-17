package Tugas6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Soal2 p2 = new Soal2();
       p2.ubahMobil();
       p2.tampilkanMobil();

        System.out.println("====================================");
       
        Soal3 p3 = new Soal3();
        p3.inputData();
        p3.TotalDanRataRata();
        p3.GanjilGenap();
        p3.cekGanjilGenap();
        p3.urutkanArray();

        System.out.println("====================================");
        
        Soal4 p4 = new Soal4();
        p4.inputMahasiswa();
        p4.tampilkanTabel();

        System.out.println("====================================");
        
        Soal5 p5 = new Soal5();
        p5.inputMatriks();
        p5.jumlahkanMatriks();
        p5.tampilkanHasil();

        System.out.println("====================================");

        Soal6 p6 = new Soal6();
        p6.prosesInputDanHitung();

        System.out.println("====================================");
        

        Soal9 p9 = new Soal9();
        p9.tampilkanForEach();
        p9.tampilkanForStandar();

        System.out.println("=====================================");
        Soal10 s10 = new Soal10();
        s10.tampilkanData();
    }
}
