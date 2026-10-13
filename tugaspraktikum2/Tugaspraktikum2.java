package tugaspraktikum2;

class PersegiPanjang{    
        int p = 50;
        int l = 45; 
        
        int luas = p * l;
}
class PersamaanKuadrat{
    int a = 2;
    int b = 10;
    int c = 5;
    
    int hasil_kuadrat = (b * b) - (4 * a * c);
    
}
class OperasiMatematika{
    int a = 22;
    int b = 33;
    
    int hasil_tambah = a + b;
    int hasil_kurang = a - b;
    double hasil_bagi  = b / a;
    int hasil_kali = a * b;
}

class Segitiga{
    double a = 6;
    double b = 8;
    
    double luas_segitiga = 0.5 * b * a;
    double c = ((a*a) + (b*b));
    double kel = a + b + c;
}

class Manipulasi{
    String a = "Saya Belajar Ngaji";
    String b = "Saya Belajar Java";
    
    String hasilA = a.toLowerCase();
    String hasilB = a.toUpperCase();
}
        
class WaktuTempuhCahaya{
    double Jarak_bulan = 384400;
    double Jarak_matahari = 152100000;
    double Kecepatan_cahaya = 300000;
    
    double Waktu_keBulan = Jarak_bulan / Kecepatan_cahaya;
    double Waktu_keMatahari = Jarak_matahari / Kecepatan_cahaya;
}
class Konversi_suhu{
    double C = 10;
    double F = 15;
    double R = 5;
    
    double cToF = (C * 4 / 5) + 32;
    double fToC = (F - 32) * 5 / 9 ;
    
    double cToR = C * 4 / 5;
    double rToc = R * 5 / 4;
    
    double fToR = (F - 32) * 4 / 9;
    double rToF = (R * 9 / 4) + 32;
}
public class Tugaspraktikum2 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("1.increment");
        System.out.println("Nilai awal x : " + x);
        System.out.println("increment " + ++x);
        System.out.println("==================================");
 
    PersegiPanjang objek1 = new PersegiPanjang();
        System.out.println("2.Persegi panjang");
        System.out.println("Luas persegi panjang");
        System.out.println("Panjang persegi : " + objek1.p );
        System.out.println("Lebar persegi  :  " + objek1.l );
        System.out.println("Luas persegi panjang : " + objek1.luas);
        System.out.println("===================================");
        
    PersamaanKuadrat objek3 = new PersamaanKuadrat();
        System.out.println("3.Persamaan kuedrat");
        System.out.println("Nilai a : " + objek3.a);
        System.out.println("Nilai b : " + objek3.b);
        System.out.println("Nilai c : " + objek3.c);
        System.out.println("Nilai b^2 - 4ac = " + objek3.hasil_kuadrat);
        System.out.println("===================================");
        
    OperasiMatematika objek2 = new OperasiMatematika();
        System.out.println("4.Operasi mtk");
        System.out.println("Operasi penjumlahan : " + objek2.hasil_tambah);
        System.out.println("Operasi pengurangan : " + objek2.hasil_kurang);
        System.out.println("Operasi perkalian   : " + objek2.hasil_kali);
        System.out.println("Operasi pembagian   : " + objek2.hasil_bagi);
        System.out.println("===================================");
        
    Segitiga objek4 = new Segitiga();
        System.out.println("5.Luas segitiga");
        System.out.println("Tinggi (a)    = " + objek4.a);
        System.out.println("Alas (b)      = " + objek4.b);
        System.out.println("Luas Segitiga = " + objek4.luas_segitiga);
        System.out.println("====================================");
        
        System.out.println("6. Rumus Phytagoras");
        System.out.println("Sisi a = " + objek4.a);
        System.out.println("Sisi b = " + objek4.b);
        System.out.println("Nilai c sisi miring = " + objek4.c);
        System.out.println("Keliling Segitiga = " + objek4.kel );
        System.out.println("=====================================");
        
     Manipulasi objek5 = new Manipulasi();
        System.out.println("7.Manipulasi ");
        System.out.println("String a (Lowercase) = " + objek5.hasilA);
        System.out.println("String b (Uppercase) = " + objek5.hasilB);
        System.out.println("=======================================");
        
    WaktuTempuhCahaya objek6 = new WaktuTempuhCahaya();
        System.out.println("8.Waktu tempuh cahaya");
        System.out.println("Waktu tempuh ke bulan = " + objek6.Waktu_keBulan + "Detik");
        System.out.println("Waktu tempuh ke matahari = " + objek6.Waktu_keMatahari + 
                "detik (" + (objek6.Waktu_keMatahari / 60) + "menit )");
        System.out.println("=========================================");
        
    Konversi_suhu objek7 = new Konversi_suhu();
        System.out.println("9.Konversi suhu");
        System.out.println("=========================================");
        System.out.println("== a. Celcius ke Fahrenheit dan Sebaliknya ==");
        System.out.println(objek7.C + " Celcius = " + objek7.cToF + " Fahrenheit " );
        System.out.println(objek7.F + " Fahrenheit = " + objek7.fToC + " Celcius");
        System.out.println("==========================================");
        System.out.println("== b. Celcius ke Reamur dan sebaliknya == ");
        System.out.println(objek7.C + " Celcius = " + objek7.cToR + " Reamur ");
        System.out.println(objek7.R + " Reamur = " + objek7.rToc + " Celcius  ");
        System.out.println("===========================================");
        System.out.println("== c. Fahrenheit ke Reamur dan sebaliknya==");
        System.out.println(objek7.F + " Fahrenheit =" + objek7.fToR + " Reamur");
        System.out.println(objek7.R + " Reamur = " + objek7.rToF + " Fahrenheit");
    }
}
