import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegitigaTerbalik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int segitiga;
        System.out.print("Masukkan ukuran segitiga: ");
        segitiga = Integer.parseInt(br.readLine());
        for (int i = 0; i < segitiga; i++) {
            for (int j = 1; j <= segitiga-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
