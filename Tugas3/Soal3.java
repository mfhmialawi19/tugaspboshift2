package Tugas3;
import java.io.*;
import java.util.Scanner;

public class Soal3 {
     public static void main(String[] args) throws IOException {
        // Contoh Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan Angka: ");
        int angkaScanner = sc.nextInt();
        System.out.println("Hasil: " + angkaScanner);
        
        // Contoh BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan Angka: ");
        int angkaBR = Integer.parseInt(br.readLine());
        System.out.println("Hasil: " + angkaBR);
}
}