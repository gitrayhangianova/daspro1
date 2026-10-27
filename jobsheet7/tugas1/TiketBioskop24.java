package jobsheet7.tugas1;

import java.util.Scanner;

public class TiketBioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        System.out.println("Ketik angka 0 atau minus untuk selesai.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tidak valid! Masukkan angka yang benar.\n");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            double subtotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = subtotal - (subtotal * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar transaksi ini: Rp " + totalBayar);
        }

        System.out.println(" REKAP PENJUALAN HARI INI =");
        System.out.println("Total seluruh tiket terjual : " + totalTiketTerjual);
        System.out.println("Total uang yang didapat     : Rp " + totalPendapatan);

        sc.close();
    }
}
