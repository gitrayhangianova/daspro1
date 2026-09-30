package pertemuan_5;

import java.util.Scanner;

public class tugas1DiskonBuku24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0.0;

        // Input data dari pengguna
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine().trim();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            // Diskon dasar kamus = 10%
            diskon = 0.10;
            if (jumlahBuku > 2) {
                // Tambahan diskon 2% jika buku > 2
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            // Diskon dasar novel = 7%
            diskon = 0.07;
            if (jumlahBuku > 3) {
                // Tambahan diskon 2% jika novel > 3
                diskon += 0.02;
            } else {
                // Tambahan diskon 1% jika novel <= 3
                diskon += 0.01;
            }
        } else {
            // Buku selain kamus dan novel
            if (jumlahBuku > 3) {
                // Diskon 5% jika jumlah buku > 3
                diskon = 0.05;
            } else {
                diskon = 0.0;
            }
        }

        // Menampilkan output persentase diskon
        System.out.println("\n--------------------------------");
        System.out.println("Jenis Buku  : " + jenisBuku);
        System.out.println("Jumlah Buku : " + jumlahBuku);
        System.out.println("Total Diskon: " + (diskon * 100) + "%");
        System.out.println("--------------------------------");

        sc.close();
    }
}
