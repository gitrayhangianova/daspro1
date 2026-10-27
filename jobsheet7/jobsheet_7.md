# JOBSHEET 7 - PERULANGAN 1

**Identitas Mahasiswa:**

- **Nama:** Rayhan Gianova Arianto
- **NIM:** 264107020213
- **Kelas / No. Presensi:** TI-1D / 24

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa dapat menjelaskan format penulisan program perulangan (for, while, dan do-while).
2. Mahasiswa dapat mengimplementasikan flowchart perulangan menggunakan bahasa pemrograman Java.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan FOR

Percobaan ini memperagakan penggunaan struktur perulangan `FOR` untuk memproses input nilai dari 10 mahasiswa guna mencari nilai tertinggi, nilai terendah, serta jumlah mahasiswa yang lulus dan tidak lulus.

#### Kode Program Java Percobaan 1

```java
package jobsheet7.percobaan1;

import java.util.Scanner;

public class SiakadFor24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi " + tertinggi);
        System.out.println("Nilai terendah " + terendah);

    }
}

```

#### 2.1.1 Pertanyaan & Analisis Percobaan 1

##### Pertanyaan 1 : Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!

- **Jawaban:** Komponen perulangan FOR pada program terletak pada baris for (int i = 1; i <= 10; i++), yang terdiri dari 3 bagian:
  a. **Inisialisasi (int i = 1)**: Menentukan nilai awal penghitung (memulai urutan dari mahasiswa ke-1).
  b. **Kondisi Batas (i <= 10)**: Menjadi syarat agar perulangan terus berjalan selama nilai i kurang dari atau sama dengan 10.
  c. **Penambahan/Update (i++)**: Menambah nilai i sebanyak 1 setiap kali satu putaran perulangan selesai dilakukan.

##### Pertanyaan 2 : Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?

- **Jawaban:** Variabel tertinggi diisi 0 di awal agar nilai input pertama dari mahasiswa yang bernilai lebih dari 0 bisa langsung menggantikannya sebagai nilai tertinggi sementara. Sebaliknya, variabel terrendah diisi 100 agar nilai input pertama yang kurang dari 100 dapat langsung masuk menjadi nilai terendah sementara. Jika posisinya dibalik (tertinggi = 100 dan terendah = 0), maka logika perbandingan akan rusak; nilai tertinggi akan selalu bernilai 100 dan nilai terendah akan selalu bernilai 0 karena tidak ada input nilai mahasiswa yang bisa melewati batas tersebut.

##### Pertanyaan 3 : Jelaskan fungsi dan alur kerja dari potongan kode berikut!

```java
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
```

- **Jawaban:** Potongan kode tersebut berfungsi sebagai sistem pembanding rekor nilai. Alur kerjanya dimulai saat angka nilai baru dimasukkan. Program pertama-tama mengecek apakah nilai baru tersebut lebih besar dari isi variabel tertinggi saat ini; jika ya, variabel tertinggi diperbarui dengan angka baru tersebut. Selanjutnya, program mengecek secara terpisah apakah nilai baru tersebut lebih kecil dari isi variabel terendah saat ini; jika ya, variabel terendah diperbarui dengan angka baru tersebut.

---

### 2.2 Percobaan 2: Studi Kasus Nilai Mahasiswa di SIAKAD - Perulangan WHILE

Percobaan ini menggunakan struktur perulangan WHILE untuk mengelompokkan nilai mahasiswa ke dalam kategori huruf (A, B+, B, C+, C, D, E) secara dinamis sesuai jumlah mahasiswa yang diinputkan, dilengkapi dengan validasi input nilai (0-100).

#### Kode Program Java Percobaan 2

```java
package jobsheet7.percobaan2;
import java.util.Scanner;
public class SiakadWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml, i = 0;

        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }

            i++;
        }
    }
}

```

#### 2.2.1 Pertanyaan & Analisis Percobaan 2

##### Pertanyaan 1 : Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut!

```java
if (nilai < 0 || nilai > 100) {
    System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
    continue;
}
```

- **a. nilai < 0 || nilai > 100 :** Merupakan syarat logika untuk mendeteksi apakah angka yang dimasukkan berada di luar batas acuan yang benar (artinya angka bernilai negatif atau lebih besar dari 100).
- **b. continue :** Perintah untuk langsung melompat kembali ke awal perulangan dan mengabaikan sisa perintah di bawahnya, sehingga pengguna diminta memasukkan ulang data tanpa membuat hitungan urutan mahasiswa bertambah.

##### Pertanyaan 2 : Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?

- **Jawaban:** Sintaks i++ diletakkan di akhir agar penambahan urutan mahasiswa hanya terjadi jika data nilai yang dimasukkan terbukti valid dan sudah selesai diproses hingga tuntas. Jika i++ diletakkan di awal perulangan, urutan mahasiswa akan bertambah lebih dulu sebelum nilainya diperiksa, sehingga nomor urut mahasiswa pada tampilan input akan menjadi salah (dimulai dari mahasiswa ke-2) dan input yang salah/invalid akan tetap menghitung dan mengurangi jatah kuota input mahasiswa.

##### Pertanyaan 3 : Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?

- **Jawaban:** Perulangan WHILE akan berjalan sebanyak 19 kali proses input data valid (tidak menghitung percobaan input yang gagal/invalid).

---

### 2.3 Percobaan 3: Studi Kasus Transaksi di Kafe - Perulangan DO-WHILE

Percobaan ini memperagakan penggunaan struktur perulangan DO-WHILE untuk menghitung total biaya transaksi pemesanan menu kafe secara terus-menerus hingga pengguna memasukkan kata "batal" untuk menghentikan transaksi.

#### Kode Program Java Percobaan 3

```java
package jobsheet7.percobaan3;

import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi, teh, roti;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        int totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine(); // Membersihkan baris kosong

        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}

```

#### 2.3.1 Pertanyaan & Analisis Percobaan 3

##### Pertanyaan 1 : Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah "batal", maka berapa kali perulangan dilakukan?

- **Jawaban:** Perulangan dilakukan sebanyak 1 kali. Hal ini terjadi karena sifat mendasar dari perulangan DO-WHILE yang selalu mengeksekusi blok kode di dalam DO terlebih dahulu minimal satu kali sebelum memeriksa syarat berhentinya.

##### Pertanyaan 2 : Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!

- **Jawaban:** Kondisi berhenti pada program ini dikendalikan oleh pengecekan variabel namaPelanggan.equalsIgnoreCase("batal") yang diikuti dengan perintah break untuk memaksa keluar dari perulangan.

##### Pertanyaan 3 : Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?

- **Jawaban:** Penggunaan nilai true pada while(true) berfungsi untuk membuat perulangan berjalan secara terus-menerus tanpa batas (infinite loop), sampai ada perintah break di dalam program yang menghentikannya secara manual.

##### Pertanyaan 4 : Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?

- **Jawaban:** Perulangan tetap dapat berjalan karena kondisinya dibuat selalu bernilai benar (true), sehingga program tidak membutuhkan penghitung otomatis (inisialisasi dan update). Kontrol perulangan dialihkan sepenuhnya kepada interaksi pengguna melalui input nama pelanggan.

---

## 3: TUGAS MANDIRI

### 3.1 Tugas 1 : Menghitung Total Penjualan Tiket Bioskop Dalam Satu Hari

Program ini digunakan untuk menghitung total tiket terjual dan total pendapatan harian penjualan tiket bioskop dengan perhitungan diskon bertingkat (10% untuk > 4 tiket dan 15% untuk > 10 tiket) serta penanganan validasi input tiket.

```java
package jobsheet7.tugas1;

import java.util.Scanner;

public class TiketBioskop24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        System.out.println("Ketik angka 0 atau minus untuk selesai.\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tidak valid! Masukkan angka yang benar.\n");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            double subtotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalBayar = subtotal - (subtotal * diskon);
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("Diskon: " + (int) (diskon * 100) + "%");
            System.out.println("Total bayar transaksi ini: Rp " + totalBayar);
        }

        System.out.println(" REKAP PENJUALAN HARI INI =");
        System.out.println("Total seluruh tiket terjual : " + totalTiketTerjual);
        System.out.println("Total uang yang didapat     : Rp " + totalPendapatan);

        sc.close();
    }
}

```

- **Penjelasan Singkat:** Program kasir bioskop ini memanfaatkan perulangan while(true) untuk menerima data transaksi pembeli secara berkelanjutan. Input bernilai negatif akan ditolak menggunakan continue, sedangkan input 0 akan memicu break untuk mengakhiri program dan menampilkan rekap total tiket serta total pendapatan harian.

---

### 3.2 Tugas 2 : Perhitungan Total Pembayaran Parkir Kendaraan Berdasarkan Flowchart

Program ini mengimplementasikan flowchart perhitungan total biaya parkir kendaraan (mobil Rp 3.000/jam, motor Rp 2.000/jam) secara berulang hingga pengguna memasukkan angka 0 untuk keluar.

```java
package jobsheet7.tugas2;

import java.util.Scanner;

public class HitungParkir24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Pilihan tidak valid! Masukkan 1, 2, atau 0.");
            }

        } while (jenis != 0); // Berhenti jika memasukkan angka 0

        System.out.println("Total pendapatan parkir: Rp " + total);
        sc.close();
    }
}

```

- **Penjelasan Singkat:** Program parkir ini mengimplementasikan struktur perulangan do-while sesuai alur flowchart yang diberikan. Pengguna memasukkan jenis kendaraan (1 untuk mobil, 2 untuk motor) dan durasi parkir. Tarif dihitung akumulatif ke dalam variabel total hingga pengguna memasukkan angka 0 untuk mematikan sistem.
