package Tugas6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array2D_programPenjualan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //deklarasi string
        String[][] menu = new String[5][4];
        //deklarasi variabel
        int quantity, harga, totalHarga, grandTotal=0, payment, change;
        //input data
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Masukan Nama Barang   : ");
            menu[i][0] = br.readLine();
            System.out.print("Masukan Jumlah Barang : ");
            menu[i][1] = br.readLine();

            //konversi tipe data dari ips[i][1] (string) ke double
            quantity = Integer.parseInt(menu[i][1]);
            System.out.print("Harga Barang  : ");
            menu[i][2] = br.readLine();
            harga = Integer.parseInt(menu[i][2]);

            //rumus menghitung total harga
            totalHarga = quantity * harga;

            menu[i][3] = String.valueOf(totalHarga);
            System.out.println("Total : "+menu[i][3]);

            //rumus menghitung grandtotal
            grandTotal = grandTotal + totalHarga;
            System.out.println("---------------------------");


        }
        System.out.println("Grand total : " +grandTotal);
        System.out.print("Uang yang dibayarkan: ");
        payment = Integer.parseInt(br.readLine());

        //Rumus menghitung uang kembalian
        change = payment - grandTotal;
        System.out.print("Uang kembali Rp."+ change);
    }
}
