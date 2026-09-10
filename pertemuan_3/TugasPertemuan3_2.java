package pertemuan_3;

import java.util.Scanner;

public class TugasPertemuan3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cetakLembar;
        int biayaCetak = 500;
        int biayaJilid = 5000;

        System.out.println("Masukkan berapa lembar yang ingin dicetak: ");
        cetakLembar = sc.nextInt();

        int totalBayar = cetakLembar * biayaCetak + biayaJilid;

        System.out.println("Total bayar: Rp." + totalBayar);
        sc.close();

    }
}
