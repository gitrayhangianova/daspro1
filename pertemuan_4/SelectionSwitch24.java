package pertemuan_4;

import java.util.Scanner;

public class SelectionSwitch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print KRS SIAKAD");
        System.out.println("Masukkan semester berapa sekarang: ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS for Semester 1 is displayed");
                break;
            case 2:
                System.out.println("KRS for Semester 2 is displayed");
                break;
            case 3:
                System.out.println("KRS for Semester 3 is displayed");
                break;
            case 4:
                System.out.println("KRS for Semester 4 is displayed");
                break;
            case 5:
                System.out.println("KRS for Semester 5 is displayed");
                // break;
            case 6:
                System.out.println("KRS for Semester 6 is displayed");
                break;
            case 7:
                System.out.println("KRS for Semester 7 is displayed");
                break;
            case 8:
                System.out.println("KRS for Semester 8 is displayed");
                break;

            default:
                System.out.println();
                break;
        }
        sc.close();
    }
}
