package pertemuan_4;

import java.util.Scanner;

public class Assignment1SelectionIf24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print KRS SIAKAD");
        System.out.print("Apakah kamu sudah membayar UKT? (true/false)");
        boolean uktPaid = sc.nextBoolean();

        String message = (uktPaid == true) ? "UKT sudah dibayar"
                : "Maaf KRS tidak bisa diberikan karena UKT belum dibayar";

        System.out.println(message);
        sc.close();
    }
}
