package pertemuan_4;

import java.util.Scanner;

public class AlokasiRuangUGD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA PASIEN UGD ===");

        System.out.print("Saturasi Oksigen / SpO2 (%): ");
        double spo2 = input.nextDouble();

        System.out.print("Sisa Tempat Tidur ICU: ");
        int sisaBedICU = input.nextInt();

        System.out.print("Tekanan Darah Sistolik (mmHg): ");
        int sistolik = input.nextInt();

        System.out.print("Apakah pasien sadar penuh? (true/false): ");
        boolean sadarPenuh = input.nextBoolean();   

        System.out.print("Suhu Tubuh (°C): ");
        double suhu = input.nextDouble();

        System.out.print("Punya riwayat komorbid? (true/false): ");
        boolean komorbid = input.nextBoolean();

        System.out.print("Usia Pasien (tahun): ");
        int usia = input.nextInt();

        System.out.print("Laju Napas (x/menit): ");
        int lajuNapas = input.nextInt();

        // LOGIKA PENENTUAN RUANG
        String hasilRuang = "";

        // 1. Syarat ICU
        if (spo2 < 85 && sisaBedICU > 0) {
            hasilRuang = "ICU";
        }
        // 2. Syarat UGD Ventilator Mobil
        else if (spo2 < 85 && sisaBedICU == 0) {
            hasilRuang = "UGD_VENTILATOR_MOBIL";
        }
        // 3. Syarat Resusitasi UGD
        else if ((spo2 >= 85 && spo2 <= 89) || (sistolik < 90 || sistolik > 180) || (!sadarPenuh)) {
            hasilRuang = "RESUSITASI_UGD";
        }
        // 4. Syarat HCU Isolasi
        else if (((spo2 >= 90 && spo2 <= 94) || suhu > 39) && komorbid && usia >= 65) {
            hasilRuang = "HCU_ISOLASI";
        }
        // 5. Syarat Rawat Inap Umum
        else if ((spo2 >= 90 && spo2 <= 94) || lajuNapas > 24) {
            hasilRuang = "RAWAT_INAP_UMUM";
        }
        // 6. Jika tidak memenuhi kriteria di atas
        else {
            hasilRuang = "RAWAT_JALAN";
        }

        // TAMPILKAN HASIL
        System.out.println("\n----------------------------------");
        System.out.println("Hasil Alokasi Ruang: " + hasilRuang);
        System.out.println("----------------------------------");

        input.close();
    }
}