package Tugas7;

class Sapi{
    String merk = "Limosin";
    
    void makan(){
        System.out.println("Sapi " + merk + " Sedang Makan");
    }
}

public class Soal1 {
    public static void main(String[] args) {
        Sapi Emoh = new Sapi();
        Emoh.makan();
    }
}
