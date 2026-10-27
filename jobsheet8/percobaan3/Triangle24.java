package jobsheet8.percobaan3;

import java.util.Scanner;

public class Triangle24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga Siku-Siku Tegak
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        // Segitiga Terbalik (Modifikasi)
        int k = n;
        while (k >= 1) {
            int j = 0;
            while (j < k) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            k--;
        }

        sc.close();
    }
}
