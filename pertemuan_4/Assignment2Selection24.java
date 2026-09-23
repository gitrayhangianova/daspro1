package pertemuan_4;

import java.util.Scanner;

public class Assignment2Selection24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCredits;
        System.out.print("Masukkan berapa SKS yang diambil: ");
        totalCredits = sc.nextInt();

        if (totalCredits > 24) {
            System.out.println("SKS melebihi limit");
        } else {
            System.out.println("KRS VALID!");
        }
        sc.close();
    }
}
