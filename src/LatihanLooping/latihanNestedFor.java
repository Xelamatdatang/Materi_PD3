package LatihanLooping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanNestedFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //variable
        int minggu, hari;
        //input
        System.out.print("Masukkan jumlah minggu: ");
        minggu = Integer.parseInt(br.readLine());
        System.out.print("Masukkan jumlah hari: ");
        hari = Integer.parseInt(br.readLine());

        //perulangan + output
        //outer loop (baris)
        for (int i = 1; i <= minggu; i++) {
            System.out.println("\nMinggu ke - "+i);

            //inner loop (kolom)
            for (int j = 1; j <= hari; j++) {
                if (i==4){
                    break;
                }
                System.out.println("Hari: "+j);
            }
        }
        //pattern kotak tanpa inputan
        int n=4;
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern segitiga tanpa inputan
        //outer loop (baris)
        for (int a = 0; a <= 5; a++) {

            //inner loop (baris)
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
