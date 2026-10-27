package jobsheet8.tugas2;

import java.util.Scanner;

public class Tugas224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();
        int jumlahSeluruhAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahSeluruhAngka += hasil;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        sc.close();
    }
}
