package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class array2D {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //deklarasi array 2D
        String[][] ips = new String[3][4];

        //karena array bertipe String, maka ada konversi tipe data dari String ke integer bagi data sks, bobot, total, jumlah sks, ip
        //menampung hasil konversi pada variable
        //memakai tipe data double karena ada angka desimal
        double sks, bobot, totalBobot=0, jumlahSKS, grandTotal=0, ip;


        try{
            //input nama dan nim di luar looping
            System.out.print("NIM: ");
            String nim = br.readLine();
            System.out.print("Nama: ");
            String nama = br.readLine();

            //input data MK (jumlah data MK > 1)
            for (int i = 0; i < ips.length; i++) {
                System.out.print("Nama MK: ");
                ips[i][0] = br.readLine();
                System.out.print("SKS: ");
                ips[i][1] = br.readLine();
                //konversi tipe data dari ips[i][1] (String) ke double
                sks = Double.parseDouble(ips[i][1]);

                System.out.print("Bobot: ");
                ips[i][2] = br.readLine();
                bobot = Double.parseDouble(ips[i][2]);

                //memasukkan perhitungan IPS
                totalBobot = sks*bobot;

                //total bobot per index
                //konversi dari numeric (int, double, dll) ke String ----> String.valueOf
                ips[i][3] = String.valueOf(totalBobot);
                System.out.println("Total: " + ips[i][3]);
                System.out.println("-----------------------------------");
                System.out.println();
            }
            //hitung grandtotal
            grandTotal=grandTotal+totalBobot;
            System.out.println("Grand Total (SKS*Bobot)= " + grandTotal);

            //menghitung IP
            System.out.print("Jumlah SKS yang diambil: ");
            jumlahSKS = Integer.parseInt(br.readLine());
            ip = grandTotal/jumlahSKS;
            System.out.println("IP anda semester ini adalah: " + ip);

        }catch (Exception e){

        }

    }
}
