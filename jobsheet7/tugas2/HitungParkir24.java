package jobsheet7.tugas2;

import java.util.Scanner;

public class HitungParkir24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Pilihan tidak valid! Masukkan 1, 2, atau 0.");
            }

        } while (jenis != 0); // Berhenti jika memasukkan angka 0

        System.out.println("Total pendapatan parkir: Rp " + total);
        sc.close();
    }
}
