package jobsheet8.tugas3;

import java.util.Scanner;

public class Tugas324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int maxBarang = -1;
        int tokoTerbaik = 0;
        int totalBarangSeluruhToko = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                int jumlahBarang = sc.nextInt();
                totalBarangToko += jumlahBarang;
            }

            System.out
                    .println("Toko " + i + " -> Pelanggan: " + jumlahPelanggan + ", Total Barang: " + totalBarangToko);
            System.out.println("--------------------------------------------------");

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbaik = i;
            }
        }

        System.out.println("\n=== RINGKASAN AKHIR ===");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);

        sc.close();
    }
}
