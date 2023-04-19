package latihanWhileDoWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanDoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //letakkan variable sebelum blok try agar terbaca semua di dalam blok try-catch
        int nim,i=0;
        String nama;

        //do while nim & nama
//        try {
//            do {
//                System.out.print("Entry nim: ");
//                nim = Integer.parseInt(br.readLine());
//                System.out.print("Entry nama: ");
//                nama = br.readLine();
//                i++;
//            } while (i<5);
//
//        }catch (Exception e){
//
//        }
        //deklarasi variable
        String nimMhs=null, namaMhs=null, prodi=null, mk=null, cari;
        int uts, uas, tugas, nilaiAkhir=0;

        try {
            /*membuat program menu
            1. Entri mahasiswa (nim, nama, prodi, dan MK
            2. Hitung nilai mahasiswa ( uts, uas, tugas)
            3. Lihat rapor mahasiswa
            4. Keluar program
             */
            int menu;
            do {
                System.out.println("=== Program Akademik Mahasiswa ===");
                System.out.println("1. Entry biodata mahasiswa");
                System.out.println("2. Hitung nilai MK mahasiswa");
                System.out.println("3. Lihat rapor mahasiswa");
                System.out.println("4. Keluar program");
                System.out.print("Pilih menu: ");
                menu = Integer.parseInt(br.readLine());
                System.out.println();
                //mengisi logika setiap menu (percabangan: if, dan switch-case)
                switch (menu){
                    /*
                    sama seperti
                    if (menu == 1){
                    }else if (menu ==2){
                    }else{ else dalam if-else == default)
                    }
                     */
                    case 1:
                        System.out.println("=== Menu entry biodata mahasiswa ===");
                        System.out.print("Nim: ");
                        nimMhs = br.readLine();
                        System.out.print("Nama: ");
                        namaMhs = br.readLine();
                        System.out.print("Program Studi: ");
                        prodi = br.readLine();
                        System.out.print("Mata kuliah: ");
                        mk = br.readLine();
                        System.out.println();
                        break;//artinya menghentikan proses case 1, dan mengembalikan ke perulangan awal (menu di awal)
                    case 2:
                        System.out.println("=== Menu Menghitung Nilai Mahasiswa ===");
                        //menghitung nilai akhir mahasiswa(30% * UTS + 30% * UAS + 40% * tugas)
                        System.out.print("Cari berdasarkan NIM: ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)){
                            System.out.print("Masukkan nilai UTS: ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan nilai UAS: ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan nilai tugas: ");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts*30/100) + (uas*30/100) + (tugas*40/100);

                            //cetak nilaiAkhir
                            System.out.println("Hasil nilai mahasiswa: " + nilaiAkhir);
                            System.out.println();
                        }else{
                            System.out.println("Data tidak ditemukan!");
                        }
                        break;
                    case 3:
                        System.out.println("=== Menu Rapor Mahasiswa ===");
                        System.out.println("Cari berdasarkan NIM: ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                            System.out.println("NIM: " + nimMhs + "\nNama: " + namaMhs + "\nProgram Studi: " + prodi + "\nMata kuliah: " + mk);
                            System.out.println("Nilai akhir mata kuliah " + mk + ": " + nilaiAkhir);
                        /*
                        A = 80 - 100
                        B+ = 75 - 79
                        B = 65 - 74
                        C+ = 60 - 64
                        C = 55 - 59
                        Nilai  < 55 == D/E
                         */
                            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                                System.out.println("Nilai: A");
                                System.out.println();
                            } else if (nilaiAkhir >= 75 && nilaiAkhir <= 79) {
                                System.out.println("Nilai: B+");
                                System.out.println();
                            } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
                                System.out.println("Nilai: B");
                                System.out.println();
                            } else if (nilaiAkhir >= 60 && nilaiAkhir <= 64) {
                                System.out.println("Nilai: C+");
                                System.out.println();
                            } else if (nilaiAkhir >= 55 && nilaiAkhir <= 59) {
                                System.out.println("Nilai: C");
                                System.out.println();
                            } else {
                                System.out.println("Nilai D/E");
                                System.out.println();
                            }

                        }else{
                            System.out.println("Data tidak ditemukan!");
                        }
                        break;
                    default: //jika yang dipilih di luar 1-3, maka
                        System.out.println("Thank you!");
                        System.exit(0);
                }
            }while (menu < 4); //boleh juga diisi "true"
        }catch (Exception e){
            System.out.println("Terdapat kesalahan -->" + e.getMessage());
        }
    }
}
