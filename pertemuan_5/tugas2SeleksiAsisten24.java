package pertemuan_5;

import java.util.Scanner;

public class tugas2SeleksiAsisten24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang mendapat sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        // Tahap 1: Verifikasi status mahasiswa
        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman (0-100): ");
            double nilaiDaspro = sc.nextDouble();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            // Tahap 2: Verifikasi nilai atau sertifikat
            if (nilaiDaspro >= 80 || punyaSertifikat) {
                System.out.println("\nSelamat! Anda dipanggil untuk mengikuti wawancara.");
                System.out.print("Masukkan nilai wawancara (0-100): ");
                double nilaiWawancara = sc.nextDouble();

                // Tahap 3: Verifikasi wawancara
                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat, Anda DITERIMA sebagai Asisten Praktikum!");
                } else {
                    System.out.println("Gagal: Nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println("Gagal: Nilai Dasar Pemrograman < 80 dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("Gagal: Status mahasiswa tidak aktif atau sedang mendapat sanksi akademik.");
        }

        sc.close();
    }
}
