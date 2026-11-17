package Tugas6;


public class Soal2 {
    String[] mobil = {"BMW","CIVIC","DUGUL","ANGKOT","FERARI","GALARDO"};
       
      public void ubahMobil() {
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("CIVIC")) {
                mobil[i] = "Honda";
            }
        }
    }

    public void tampilkanMobil() {
        System.out.println("Array setelah diubah:");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + ": " + mobil[i]);
        }
   } 

}
