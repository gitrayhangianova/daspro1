package pertemuan_4;

import java.util.Scanner;

public class NusantaraPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== NUSANTARA PAY - SISTEM KEAMANAN TRANSAKSI ===");

        // Input Data Transaksi
        System.out.print("Masukkan Status Akun (NORMAL / BLACK-LISTED / SUSPICIOUS): ");
        String statusAkun = input.nextLine();

        System.out.print("Masukkan Sisa Saldo ($): ");
        double saldo = input.nextDouble();

        System.out.print("Masukkan Nominal Transaksi ($): ");
        double nominal = input.nextDouble();

        System.out.print("Apakah transaksi dari luar negeri? (true/false): ");
        boolean isBedaNegara = input.nextBoolean();

        System.out.print("Masukkan Jam Transaksi (0 - 23): ");
        int jam = input.nextInt();

        String statusAkhir = "";

        // 1. REJECTED_BLACKLIST: Status akun terdaftar sebagai "BLACK-LISTED"
        if (statusAkun.equalsIgnoreCase("BLACK-LISTED")) {
            statusAkhir = "REJECTED_BLACKLIST";
        }
        // 2. REJECTED_SALDO: Nominal transaksi melebihi sisa saldo
        else if (nominal > saldo) {
            statusAkhir = "REJECTED_SALDO";
        }
        // 3. REJECTED_LIMIT: Nominal transaksi melebihi limit harian ($10.000)
        else if (nominal > 10000) {
            statusAkhir = "REJECTED_LIMIT";
        }
        // 4. FLAGGED_FRAUD: Transaksi dari luar negeri DAN nominalnya di atas $2.000
        else if (isBedaNegara && nominal > 2000) {
            statusAkhir = "FLAGGED_FRAUD";
        }
        // 5. REQUIRE_OTP_NIGHT: Transaksi antara jam 00.00–04.00 pagi DAN nominal di
        // atas $1.000
        else if ((jam >= 0 && jam <= 4) && nominal > 1000) {
            statusAkhir = "REQUIRE_OTP_NIGHT";
        }
        // 6. REQUIRE_OTP_SUSPICIOUS: Status akun "SUSPICIOUS" DAN nominal di atas $500
        else if (statusAkun.equalsIgnoreCase("SUSPICIOUS") && nominal > 500) {
            statusAkhir = "REQUIRE_OTP_SUSPICIOUS";
        }
        // 7. APPROVED: Transaksi aman dan tidak memicu kondisi di atas
        else {
            statusAkhir = "APPROVED";
        }

        // TAMPILKAN HASIL
        System.out.println("\n-------------------------------------------");
        System.out.println("Status Akhir Transaksi: " + statusAkhir);

        input.close();
    }
}
