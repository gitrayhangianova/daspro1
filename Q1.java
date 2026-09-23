//NAMA: RAYHAN GIANOVA ARIANTO
//NIM : 264107020213
//KELAS : TI-1D

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // menyimpan variabel
        int tarifDasar, jarakPerjalanan, biayaBahanBakar, hargaJualMkn, jumlahTransaksi, biayaMkn;
        double resikoKerusakan, komisiPerusahaan, resikoKeterlambatan;

        tarifDasar = 8000;
        resikoKerusakan = 2;
        resikoKeterlambatan = 2;
        komisiPerusahaan = 3;

        
        // Input value untuk menghitung Keuntungan Driver
        System.out.println("Menghitung keuntungan driver dan merchant");
        System.out.print("Masukkan jarak perjalanan : ");
        jarakPerjalanan = sc.nextInt();
        System.out.print("Masukkan biaya bahan bakar : ");
        biayaBahanBakar = sc.nextInt();
        System.out.print("Masukkan jumlah transaksi : ");
        jumlahTransaksi = sc.nextInt();
        // input value dari merchant
        System.out.println("Biaya Merchant");
        System.out.print("Masukkan harga jual makanan (online) : ");
        hargaJualMkn = sc.nextInt();
        System.out.print("Masukkan biaya makanan (offline) : ");
        biayaMkn = sc.nextInt();


        // menghitung Keuntungan Driver
        int keuntunganDriver = (int) ((tarifDasar * jarakPerjalanan - biayaBahanBakar * jarakPerjalanan)
                * (1 - komisiPerusahaan / 100) * (1 - resikoKeterlambatan / 100) * jumlahTransaksi);
        System.out.println("Keuntungan Driver : Rp." + keuntunganDriver);

        // menghitung Keuntungan Merchant
        int keuntunganMerchant = (int) ((hargaJualMkn - biayaMkn) * (1 - komisiPerusahaan / 100)
                * (1 - resikoKerusakan / 100) * jumlahTransaksi);
        System.out.println("Keuntungan Merchant : Rp." + keuntunganMerchant);

        // total keuntungan dari semua mitra
        int totalKeuntungan = (int) keuntunganDriver + keuntunganMerchant;
        System.out.println("Total keuntungan dari semua mitra : Rp." + totalKeuntungan);

        // rata-rata keuntungan dari semua transaksi
        int rataKeuntungan = totalKeuntungan / jumlahTransaksi;
        System.out.println("Rata - rata keuntungan dari semua transaksi : Rp." + rataKeuntungan);

        // Persentase kontribusi dari masing-masing mitra
        double kontribusiDriver = keuntunganDriver / totalKeuntungan * 0.1;
        double kontribusiMerchant = keuntunganMerchant / totalKeuntungan * 0.1;

        System.out.println("Kontribusi Driver : " + kontribusiDriver + "%");
        System.out.println("Kontribusi Merchant : " + kontribusiMerchant + "%");

        sc.close();
    }
}
