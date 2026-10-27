package quiz_uts_uas;
// Nama = Rayhan Gianova Arianto
// NIM = 264107020213
// Kelas = TI-1D

import java.util.Scanner;

public class TUS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Persiapan Menentukan tipe data variabel
        String mode = "";
        int jumlahZombie, koinZombie, totalKoin;
        double bonus;

        // input data mode
        System.out.print("Masukkan mode level Siang/Malam : ");
        mode = sc.nextLine();

        // input data jumlah zombie yang terbunuh
        System.out.print("Masukkan jumlah zombie terbunuh : ");
        jumlahZombie = sc.nextInt();

        // kondisi user memilih mode siang
        if (mode.equalsIgnoreCase("siang")) {
            // menghitung koin yang didapatkan
            koinZombie = jumlahZombie * 10;
            // kondisi apabila user memenuhi kriteria bonus, serta perhitungan yang
            // didapatkan
            if (jumlahZombie >= 1 && jumlahZombie <= 10) {
                bonus = 0;
                totalKoin = (int) (koinZombie + bonus);
                System.out.println("Koin Dasar : " + koinZombie);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Koin : " + totalKoin);
            } else if (jumlahZombie >= 11 && jumlahZombie <= 25) {
                bonus = koinZombie * 0.10;
                totalKoin = (int) (koinZombie + bonus);
                System.out.println("Koin Dasar : " + koinZombie);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Koin : " + totalKoin);
            } else if (jumlahZombie >= 26) {
                bonus = koinZombie * 0.25;
                totalKoin = (int) (koinZombie + bonus);
                System.out.println("Koin Dasar : " + koinZombie);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Koin : " + totalKoin);
                // kondisi apabila input user tidak memenuhi kondisi-kondisi sebelumnya
            } else {
                System.out.println("Input tidak valid! Periksa kembali data anda");
            }
            // kondisi apabila user memilih mode siang
        } else {
            // kondisi apabila user memenuhi kriteria bonus, serta perhitungan yang
            // didapatkan
            koinZombie = jumlahZombie * 15;
            if (jumlahZombie >= 1 && jumlahZombie <= 10) {
                bonus = 0;
                totalKoin = (int) (koinZombie + bonus);
                System.out.println("Koin Dasar : " + koinZombie);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Koin : " + totalKoin);
            } else if (jumlahZombie >= 11 && jumlahZombie <= 25) {
                bonus = koinZombie * 0.15;
                totalKoin = (int) (koinZombie + bonus);
                System.out.println("Koin Dasar : " + koinZombie);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Koin : " + totalKoin);
            } else if (jumlahZombie >= 26) {
                bonus = koinZombie * 0.30;
                totalKoin = (int) (koinZombie + bonus);
                System.out.println("Koin Dasar : " + koinZombie);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Koin : " + totalKoin);
            } else if (jumlahZombie > 40) {
                bonus = 100;
                totalKoin = (int) (koinZombie + bonus);
                System.out.println("Koin Dasar : " + koinZombie);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Koin : " + totalKoin);
                // tambahan apabila user telah membunuh 40 lebih zombie
                System.out.println("Selamat Anda Mendapatkan Trofi Malam!");
            } else {
                // kondisi apabila input user tidak memenuhi kondisi-kondisi sebelumnya
                System.out.println("Input tidak valid! Periksa kembali data anda");
            }
        }

    }

}