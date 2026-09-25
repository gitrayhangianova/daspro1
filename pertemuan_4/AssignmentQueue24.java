package pertemuan_4;

import java.util.Scanner;

public class AssignmentQueue24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kode pelayanan untuk mengetahui jenis layanan dan loketnya ");
        System.out.print(" Masukkan kode: ");
        int kodeLayanan = sc.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Legalisir Ijazah, Loket A");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah, Loket B");
                break;
            case 3:
                System.out.println("Pembayaran UKT, Loket C");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik, Loket D");
                break;

            default:
                break;
        }
        sc.close();
    }

}