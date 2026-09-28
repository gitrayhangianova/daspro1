package pertemuan_4;

import java.util.Scanner;

public class KonsultanPajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR PPh 21 ===");
        System.out.print("Masukkan Penghasilan Kena Pajak (PKP) Tahunan: Rp ");
        double pkp = input.nextDouble();

        double totalPajak = 0;

        // Jika PKP kurang dari atau sama dengan 0 (Bebas Pajak)
        if (pkp <= 0) {
            totalPajak = 0;
        } else if (pkp <= 60000000) {
            totalPajak = pkp * 0.05;
        } else if (pkp <= 250000000) {
            totalPajak = 3000000 + ((pkp - 60000000) * 0.15);
        } else if (pkp <= 500000000) {
            totalPajak = 31500000 + ((pkp - 250000000) * 0.25);
        } else {
            totalPajak = 94000000 + ((pkp - 500000000) * 0.30);
        }

        // TAMPILKAN HASIL
        System.out.println("Total PPh 21 Terutang: Rp " + (long) totalPajak);

        input.close();

    }
}
