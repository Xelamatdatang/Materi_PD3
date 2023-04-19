package LatihanLooping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanLoopingPattern {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //pattern kotak
        int kotak;
        System.out.print("Masukkan ukuran kotak: ");
        kotak = Integer.parseInt(br.readLine());
        for (int x = 0; x <= kotak; x++) {
            for (int b = 0; b <= kotak; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //pattern segitiga
        int segitiga;
        System.out.print("Masukkan ukuran segitiga: ");
        segitiga = Integer.parseInt(br.readLine());
        for (int i = 0; i <= segitiga; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
