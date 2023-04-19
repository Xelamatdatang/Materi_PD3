package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array1D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Deklarasi array 1D
        String [] namaMK = new String[3];
        int[] sks = new int[3];
        int bobot [] = new int[3];

        //input
        //.length ---> mengulang sebanyak panjang array
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Nama MK: ");
            namaMK[i] = br.readLine();
            System.out.print("SKS: ");
            sks[i] = Integer.parseInt(br.readLine());
        }

        //output
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println("Nama MK adalah: " + namaMK[i]);
            System.out.println("SKS dari MK " + namaMK[i] + " adalah: " + sks[i]);

        }
    }
}
