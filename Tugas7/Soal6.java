package Tugas7;

class Civitas {
    String nama;
    String status;

    void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status + " (Civitas Akademika Fakultas Teknik)");
        System.out.println("------------------------------------");
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        this.nama = nama;
        this.status = "Dosen";
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        this.nama = nama;
        this.status = "Mahasiswa";
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        this.nama = nama;
        this.status = "Staff";
    }
}

public class Soal6 {
   
}
