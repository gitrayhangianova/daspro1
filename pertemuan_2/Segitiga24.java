package pertemuan_2;

import java.util.Scanner;

public class Segitiga24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();

        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextInt();
        sc.close();

        luas = alas * tinggi / 2f;

        System.out.println("Luas segitiga: " + luas);
    }
}
