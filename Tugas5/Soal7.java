package Tugas5;


public class Soal7 {
    public void While(){
        int i = 0;
        System.out.println("Menggunakan i++ :");
        while (i < 3) {
            System.out.print((i++) + " "); 
        }

        System.out.println("\n\nMenggunakan ++i :");
        int j = 0;
        while (j < 3) {
            System.out.print((++j) + " "); 
        }
        System.out.println();
    }
}
