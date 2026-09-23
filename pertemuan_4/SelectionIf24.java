package pertemuan_4;

import java.util.Scanner;

public class SelectionIf24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print KRS SIAKAD");
        System.out.print("Apakah kamu sudah membayar UKT? (true/false)");
        boolean uktPaid = sc.nextBoolean();

        if (uktPaid) {
            System.out.println("UKT sudah dibayar");
            System.out.println("Tolong print KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Tolong bayar UKT terlebih dahulu");
        }

        sc.close();
    }
}
