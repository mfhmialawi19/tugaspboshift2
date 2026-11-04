package Tugas5;

public class Soal5 {
    public void bintang(){
        System.out.println("=== Half Triangle === ");
        
        int a = 5;
        for(int i = 1; i <= a; i++ ){
            for(int x = 1; x <= a-i; x++){
                System.out.print(" ");   
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=== Full Triangle ===");
        
        int n = 3;
           for(int i = 1; i <= n; i++ ){
            for(int x = 1; x <= n-i; x++){
                System.out.print(" ");   
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int i = n - 1; i >= 1; i-- ){
            for(int x = 1; x <= n-i; x++){
                System.out.print(" ");   
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
