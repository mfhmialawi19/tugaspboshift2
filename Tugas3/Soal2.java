package Tugas3;
import java.io.*;

public class Soal2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukkan Nama Barangnya: ");
        String nama = reader.readLine();
        System.out.print("Masukkan Total Belanja : ");
        double totalBelanja = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan Diskon (%): ");
        double diskon = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan Uang Bayar: ");
        double bayar = Double.parseDouble(reader.readLine());
        
        double potongan = totalBelanja * (diskon / 100);
        double total = totalBelanja - potongan;
        double kembalian = bayar - total;
        
        // Simpan ke file menggunakan DataOutputStream
        FileOutputStream fos = new FileOutputStream("transaksi.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembalian);
        dos.close();
        
        FileInputStream fis = new FileInputStream("transaksi.dat");
        DataInputStream dis = new DataInputStream(fis);
        
        System.out.println("\n--- Hasil DataInputStream ---");
        System.out.println("Nama      : " + dis.readUTF());
        System.out.println("Belanja   : " + dis.readDouble());
        System.out.println("Diskon    : " + dis.readDouble() + "%");
        System.out.println("Total     : " + dis.readDouble());
        System.out.println("Bayar     : " + dis.readDouble());
        System.out.println("Kembalian : " + dis.readDouble());
        dis.close();
    }
}
