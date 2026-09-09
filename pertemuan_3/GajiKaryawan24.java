package pertemuan_3;

import java.util.Scanner;

public class GajiKaryawan24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransparan = 600000;
        double tunjMkn = 400000;

        System.out.println("Masukkan gaji pokok anda : Rp.");
        gajiPokok = sc.nextInt();

        bonus = 0.05 * gajiPokok;

        totGaji = gajiPokok + tunjTransparan + tunjMkn + bonus - 0.1 * gajiPokok;

        System.out.println("Bonus bulanan anda adalah : Rp." + bonus);
        System.out.println("Gaji yang diterima adalah : Rp." + (int) totGaji);

        sc.close();
    }
}
