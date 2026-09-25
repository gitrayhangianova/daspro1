package pertemuan_4;

import java.util.Scanner;

public class AssignmentParking24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifDasar = 2000;
        int tarifTambahan = 1000;
        System.out.println("Masukkan berapa lama anda parkir: ");
        int lamaParkir = sc.nextInt();

        if (lamaParkir <= 2) {
            System.out.println("Biaya parkir selama " + lamaParkir + " Jam sebesar Rp. " + tarifDasar);
        } else {
            System.out.println("Biaya parkir selama " + lamaParkir + " Jam sebesar Rp. "
                    + (tarifDasar + (tarifTambahan * lamaParkir)));
        }
        sc.close();
    }
}
