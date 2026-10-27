package jobsheet6.studikasus1;

import java.util.Scanner;

public class StudiKasus124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli : ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan jumlah uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga : Rp." + totalHarga);
        System.out.println("Total Diskon : Rp." + diskon);
        System.out.println("Total Bayar : Rp." + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian anda : Rp." + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda tidak cukup, kurang Rp." + kurang);
        }

        sc.close();
    }
}
