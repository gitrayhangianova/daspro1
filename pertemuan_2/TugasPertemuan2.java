package pertemuan_2;

import java.util.Scanner;

public class TugasPertemuan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan gaji pokok anda : Rp ");
        double gajiPokok = input.nextDouble();
        System.out.println("Masukkan jumlah anak anda : ");
        int jumlahAnak = input.nextInt();
        System.out.println("Masukkan tunjangan per anak : Rp ");
        double tunjanganPerAnak = input.nextDouble();
        double persentasePensiun = 0.10;

        double totalTunjanganAnak = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * persentasePensiun;
        double gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;

        System.out.println("Gaji Pokok            : Rp " + gajiPokok);
        System.out.println("Total Tunjangan Anak  : Rp " + totalTunjanganAnak);
        System.out.println("Potongan Dana Pensiun : Rp " + potonganPensiun);
        System.out.println("Gaji Bersih Diterima  : Rp " + gajiBersih);

        input.close();
    }
}
