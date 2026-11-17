package Tugas6;

public class Soal10 {
    private Object[] data = {19, 0.2, 'C', "Java", true};

    public void tampilkanData() {
        System.out.println("Isi data campuran di dalam array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Indeks " + i + " (" + data[i].getClass().getSimpleName() + "): " + data[i]);
        }
    }
}
