package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class tugasQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<String> queue = new LinkedList<>();
        //menambahkan elemen dalam antrian
        queue.add("Jhon");
        queue.add("Marcus");
        queue.add("Adrian");

        //menampilkan isi antrian
        System.out.println("List peserta wawancara: " + queue);

        //mengeluarkan antrian pertama
        System.out.println("Peserta antrian pertama: " + queue.remove());
        System.out.println("Peserta antrian kedua: " + queue.remove());
        System.out.println("Peserta antrian ketiga: " + queue.remove());

        //menampilkan jumlah elemen dalam antrian
        int size = queue.size();
        System.out.println("Jumlah elemen dalam antrian: " + size);

    }
}
