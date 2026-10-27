package cobacoba;

public class coba {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                if (i == 1 || i == 4 || k == 1 || k == 8) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }

            for (int a = 1; a <= i; a++) {
                System.out.print("=");
            }

            // for (int a = i; a >= 2; a--) {
            // System.out.print("* ");
            // }
            System.out.println();

        }
    }
}
