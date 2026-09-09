package pertemuan_3;

import java.util.Scanner;

public class TugasPertemuan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaLaptop, uangMuka, lamaKredit;

        System.out.print("Masukkan harga laptop: Rp.");
        hargaLaptop = sc.nextInt();

        System.out.print("Bayar uang muka sebesar: Rp.");
        uangMuka = sc.nextInt();

        int sisaHarga = hargaLaptop - uangMuka;

        System.out.println("Sisa yang perlu dibayar sebesar: Rp." + sisaHarga);

        System.out.print("Berapa lama ingin kredit?: ");
        lamaKredit = sc.nextInt();

        int cicilan = sisaHarga / lamaKredit;
        double bunga = cicilan * 0.02f;
        double totalCicilan = cicilan + bunga;
        System.out.println("Anda perlu membayar sebesar: Rp." + cicilan);
        System.out.println("Jadi anda perlu membayar sebesar: " + totalCicilan);
        sc.close();

    }
}
