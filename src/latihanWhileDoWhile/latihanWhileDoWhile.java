package latihanWhileDoWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanWhileDoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //while
        //menjumlahkan setiap angka yang di-entry kan
        //kondisi: pengulangan penjumlahan akan dilakukan apabila angka yang diinputkan >= 0
        //output: angka hasil jumlah
        int number=0, jumlah=0;
        while (number >= 0){
            jumlah += number; //untuk penjumlahan setiap angka yang diinputkan
            System.out.print("Masukkan angka: ");
            number  = Integer.parseInt(br.readLine());
            //jumlah += number artinya adalah jumlah = jumlah + angka
        }
        System.out.println("Jumlah = " + jumlah);

        //menge-entry kan nim dan nama apabila kondisinya true (dua data diisi dengan benar, dimana tipe datanya sesuai)
        boolean b;
        int i=0; //mengulang while sampai angka yang telah di tentukan
        while (i < 5){
            System.out.print("Entry nim: ");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("Entry nama: ");
            String nama = br.readLine();
            i++; //berfungsi untuk menambah +1 value dari variable i
        }

    }
}
