package jobsheet6.studikasus2;

import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.next();

        System.out.print("Jumlah dokumen (0-4): ");
        int jumlahDokumen = input.nextInt();

        int peringkatJuara = 0;
        int statusPendanaanPKM = 0;

        // Input kondisi tambahan berdasarkan jenis kegiatan
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            peringkatJuara = input.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaanPKM = input.nextInt();
        }

        // Logika pemilihan bersarang (Nested IF)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            // Cek apakah peraih Juara 1, 2, atau 3
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                // Cek kelengkapan dokumen (wajib 4)
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            // Cek apakah lolos pendanaan
            if (statusPendanaanPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        input.close();
    }
}
